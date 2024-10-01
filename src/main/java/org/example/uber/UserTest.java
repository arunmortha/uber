package org.example.uber;

import java.util.Date;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.userId="12345";
        user.emailId="uber@email.com";
        user.name="username";
        user.phoneNumber="1234567";


        Insurance insurance1 = new Insurance();
        insurance1.insuranceId="123456";
        insurance1.name="username";


        Insurance insurance2 = new Insurance();
        insurance2.insuranceId="123456";
        insurance2.name="username";

        Vechicle vechicle = new Vechicle();
        vechicle.vechicleNumber="1234567";
        vechicle.insurance=insurance1;
        vechicle.vehicletype=VechicleTypeEnum.AUTO;


        Driver driver = new Driver();
        driver.insurance=insurance2;
        driver.name="drivername";
        driver.liences="12345erty";
        driver.mobileNumber="1234567";
        driver.vechicle=vechicle;


        Location location1 = new Location();
        location1.lattitude="radiotion";
        location1.longtitude="long";

        Location location2 = new Location();
        location2.lattitude="radiotion";
        location2.longtitude="long";


        Task task = new Task();
        task.fromLocation=location1;
        task.toLocation=location2;
        task.userId= user.userId;


        JobTaskMapping jobTaskMapping = new JobTaskMapping();
        jobTaskMapping.endTime=new Date();
        jobTaskMapping.startTime=new Date();
        jobTaskMapping.vechicle=vechicle;
        jobTaskMapping.task=task;



        System.out.println(jobTaskMapping.task.fromLocation);
        System.out.println(jobTaskMapping.task.userId);
        System.out.println(jobTaskMapping.vechicle);










    }
}
