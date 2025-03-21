import jakarta.persistence.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDateTime;

@Entity
@Table(name = "waterlevel")
public class FloatLevelSensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id= 0L;  // Primary Key eklenmeli

    @Column(nullable = false)
    private LocalDateTime date= LocalDateTime.now().minusHours(3);

    @Column(nullable = false)
    private int level =0;

    // Hibernate için zorunlu parametresiz constructor
    public FloatLevelSensorData() {
    }


    public FloatLevelSensorData(int level) {
        this.level=level;

        try (Session session = HibernateUtil.getSession()) {
            Transaction transaction = session.beginTransaction();

            session.merge(this); // persist() yerine saveOrUpdate() kullan

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
