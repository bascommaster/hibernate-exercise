package src.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;



@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mark;
    private String model;
    private LocalDate prodYear;


    public Car() {
    }

    public Car(String mark, String model, LocalDate prodYear) {
        this.mark = mark;
        this.model = model;
        this.prodYear = prodYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getProdYear() {
        return prodYear;
    }

    public void setProdYear(LocalDate prodYear) {
        this.prodYear = prodYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", prodYear=" + prodYear +
                '}';
    }
}
