package su.allabergen.mynote.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Rabat on 12.02.2016.
 */
@Entity
@Table(name = "mynote")
public class MyNote {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "date", nullable = false)
    private Date mynoteDate;

    public MyNote() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getMynoteDate() {
        return mynoteDate;
    }

    public void setMynoteDate(Date mynoteDate) {
        this.mynoteDate = mynoteDate;
    }
}
