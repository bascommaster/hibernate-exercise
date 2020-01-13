package src.dao;

import org.hibernate.Session;
import src.HibernateConfig;
import src.entity.Car;



public class CarDao {

    private HibernateConfig hibernateConfig;


    public CarDao() {
        this.hibernateConfig = new HibernateConfig();
    }


    public Car getCar(Long id){

        Session session = hibernateConfig.getSessionFactory().openSession();
        Car car = session.get(Car.class, id);
        session.close();

        return car;
    }


    public void add(Car car){

        Session session = hibernateConfig.getSessionFactory().openSession();
        session.save(car);
        session.close();

    }
}
