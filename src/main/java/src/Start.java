package src;

import src.dao.CarDao;
import src.entity.Car;

import java.time.LocalDate;

public class Start {

    public static void main(String[] args) {

        CarDao carDao=new CarDao();
//        Car car = new Car("Fiat", "126p", LocalDate.of(1990,2,22));
//        carDao.add(car);

        Car car = carDao.getCar(1L);
        System.out.println(car);
    }

}
