import jakarta.persistence.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.TimeZone;

@Entity
@Table(name = "sump")
public class Sump implements Environment{

public Sump(){



}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id= 0L;  // Primary Key eklenmeli


    @Column(nullable = false)
    private LocalDateTime date= LocalDateTime.now();

    @Column(nullable = false)
    private int level =0;

    public void live(int rate) {

        if(id==0L){
            try (Session session = HibernateUtil.getSession()) {
                Transaction tx = session.beginTransaction();
                Query query = session.createQuery("DELETE Sump");
                session.createNativeQuery("ALTER SEQUENCE sump_id_seq RESTART WITH 1").executeUpdate(); // ID sıfırla

                query.executeUpdate();
                tx.commit();
            }
        }

        level = level + rate;
        id=id+1;
        date=LocalDateTime.now().minusHours(3);

        try (Session session = HibernateUtil.getSession()) {
            Transaction transaction = session.beginTransaction();

            session.merge(this); // persist() yerine saveOrUpdate() kullan

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void drain(int rate) {

        level = level - rate;
    }
    public int value() {

       return level;
    }

}
