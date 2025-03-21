import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Random;

@Entity
@Table(name = "sump")
public class Sump implements Environment{

public Sump(){



}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id= 0L;  // Primary Key eklenmeli

    @Column(nullable = false)
    private int level =0;

    public void live(int rate) {

        level = level + rate;
    }
    public void drain(int rate) {

        level = level - rate;
    }
    public int value() {

       return level;
    }

    @Override
    public int methane() {
        return new Random().nextInt(100);
    }

    @Override
    public int liquidLevel() {
        return level;
    }

}
