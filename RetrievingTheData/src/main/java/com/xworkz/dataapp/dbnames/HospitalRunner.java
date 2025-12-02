package com.xworkz.dataapp.dbnames;

import com.xworkz.dataapp.constants.DBConst;

import java.sql.*;

public class HospitalRunner {


    public static void main(String[] args) {

        System.out.println("main started");


        try (Connection connection = DriverManager.getConnection(DBConst.URL.getProperty(), DBConst.USERNAME.getProperty(), DBConst.PWD.getProperty());
             Statement statement = connection.createStatement();) {
            System.out.println("Connection --> " + connection);

            System.out.println("Insertion started");

            String insert = "INSERT INTO hospital VALUES" +
                    "(1,'Green Valley Hospital','MultiSpeciality','Bangalore','9012345670',2003,220,'Cardiology,Neuro','Dr. Raghav',4.6)," +
                    "(2,'Little Hearts Clinic','Children','Tumkur','9012345671',2015,70,'Pediatrics','Dr. Meera',4.4)," +
                    "(3,'City Central Hospital','General','Davanagere','9012345672',2001,150,'General,Ortho','Dr. Naveen',4.2)," +
                    "(4,'Ocean Care Hospital','MultiSpeciality','Mangalore','9012345673',2008,260,'Cardiology,ENT,Ortho','Dr. Suresh',4.7)," +
                    "(5,'Vision Plus Eye Care','EyeCare','Shimoga','9012345674',2012,85,'Ophthalmology','Dr. Kiran',4.5)," +
                    "(6,'LifeSpring Hospital','MultiSpeciality','Hubli','9012345675',1999,410,'Cardiology,Oncology','Dr. Srinath',4.9)," +
                    "(7,'Western Hospital','MultiSpeciality','Belgaum','9012345676',1996,320,'Cardiology,Neuro','Dr. Karthik',4.6)," +
                    "(8,'Prime Medical Center','General','Bangalore','9012345677',2005,190,'General,Ortho','Dr. Ajith',4.3)," +
                    "(9,'Healing Touch Hospital','MultiSpeciality','Noida','9012345678',2004,360,'Cardiology,Neuro','Dr. Verma',4.8)," +
                    "(10,'Apollo Prime Care','MultiSpeciality','Coimbatore','9012345679',1992,420,'Cardiology,Nephrology','Dr. Mohan',4.9)," +
                    "(11,'Neuro Life Center','Neuro','Trichy','9012345680',2013,230,'Neurology,Spine','Dr. Prasanna',4.5)," +
                    "(12,'Silver Line Hospital','General','Warangal','9012345681',2006,270,'General,Ortho','Dr. Sanjay',4.3)," +
                    "(13,'Unity Care Hospital','General','Salem','9012345682',1988,310,'General,Cardiology','Dr. Suman',4.2)," +
                    "(14,'Ortho Plus Center','Ortho','Bangalore','9012345683',2016,165,'Ortho,Trauma','Dr. Rohit',4.6)," +
                    "(15,'Sree Sai Hospital','General','Udupi','9012345684',2009,210,'General,ENT','Dr. Anita',4.4)," +
                    "(16,'Heart Beat Institute','Cardiology','Chitradurga','9012345685',1997,370,'Cardiology','Dr. Ashok',4.8)," +
                    "(17,'Ayush Wellness Center','Ayurveda','Karwar','9012345686',2019,120,'Ayurveda,Naturopathy','Dr. Srikanth',4.1)," +
                    "(18,'Crystal Eye Care','EyeCare','Bangalore','9012345687',2010,100,'Ophthalmology','Dr. Arun',4.7)," +
                    "(19,'Family Care Clinic','General','Chikmagalur','9012345688',2018,65,'General','Dr. Bhaskar',4.0)," +
                    "(20,'Metro Plus Hospital','General','Bangalore','9012345689',2021,95,'General,ENT','Dr. Lavanya',4.2)," +
                    "(21,'Urban Care Hospital','MultiSpeciality','Surat','9012345690',2011,260,'Cardiology,ENT,Ortho','Dr. Thomas',4.5)," +
                    "(22,'Sanjeevani Hospital','General','Ballari','9012345691',2008,145,'General,Ortho','Dr. Mahesh',4.3)," +
                    "(23,'Cancer Cure Center','CancerCare','Faridabad','9012345692',2016,190,'Oncology','Dr. Deepak',4.7)," +
                    "(24,'Kerala Health Clinic','General','Kannur','9012345693',2003,175,'General,ENT','Dr. Nambiar',4.4)," +
                    "(25,'Bright Vision Eye Care','EyeCare','Udupi','9012345694',2007,95,'Ophthalmology','Dr. George',4.3)," +
                    "(26,'Healing Roots Hospital','General','Nashik','9012345695',2012,110,'General','Dr. Vinod',4.2)," +
                    "(27,'Nature Cure Hospital','Ayurveda','Sirsi','9012345696',2020,135,'Ayurveda,Massage','Dr. Vinayak',4.4)," +
                    "(28,'Well Life Clinic','General','Raichur','9012345697',2018,78,'General','Dr. Sharath',4.1)," +
                    "(29,'Royal Care Hospital','MultiSpeciality','Hassan','9012345698',2004,255,'Cardiology,Neuro','Dr. Jacob',4.6)," +
                    "(30,'Capital Health Center','General','Ghaziabad','9012345699',2000,290,'General,Ortho','Dr. Lakshmi',4.4)," +
                    "(31,'Brain Plus Hospital','Neuro','Hosapete','9012345700',2011,225,'Neuro,Spine','Dr. Manohar',4.5)," +
                    "(32,'North City Hospital','General','Panipat','9012345701',2005,160,'General','Dr. Anil',4.2)," +
                    "(33,'Women Wellness Hospital','WomenCare','Bangalore','9012345702',2014,150,'Gynecology','Dr. Jyoti',4.6)," +
                    "(34,'Mother Care Center','WomenCare','Manipal','9012345703',1997,120,'Gynecology','Dr. Devika',4.3)," +
                    "(35,'Tiny Steps Pediatric','Children','Kolhapur','9012345704',2019,72,'Pediatrics','Dr. Snehal',4.4)," +
                    "(36,'Smile Max Dental','Dental','Bangalore','9012345705',2015,38,'Dental','Dr. Praneeth',4.5)," +
                    "(37,'Perfect Smile Dental','Dental','Madurai','9012345706',2020,45,'Dental','Dr. Karthikeyan',4.3)," +
                    "(38,'MaxCare Hospital','MultiSpeciality','Vijayawada','9012345707',2003,330,'Cardiology,ENT,Ortho','Dr. Naresh',4.7)," +
                    "(39,'Metro Care Hospital','General','Meerut','9012345708',2009,200,'General','Dr. Ritu',4.3)," +
                    "(40,'Village Health Center','General','Koppal','9012345709',1991,105,'General','Dr. Pavan',4.0)," +
                    "(41,'Town Clinic','General','Srirangapatna','9012345710',2017,58,'General','Dr. Arvind',4.1)," +
                    "(42,'Universal Care Hospital','MultiSpeciality','Bangalore','9012345711',2009,340,'Cardiology,Neuro,ENT','Dr. Rajeev',4.8)," +
                    "(43,'Star Life Hospital','General','Warangal','9012345712',2012,235,'General,Ortho','Dr. Adarsh',4.4)," +
                    "(44,'HopeWell Health Clinic','General','Erode','9012345713',2020,98,'General','Dr. Ashwin',4.1)," +
                    "(45,'Divine Ayurveda Hospital','Ayurveda','Madikeri','9012345714',2018,125,'Ayurveda','Dr. Keshav',4.3)," +
                    "(46,'Remedy Health Hospital','General','Bagalkot','9012345715',2014,145,'General,ENT','Dr. Nagaraj',4.2)," +
                    "(47,'Care Pro Hospital','General','Chitradurga','9012345716',2006,185,'General,Ortho','Dr. Milan',4.4)," +
                    "(48,'Lotus Women Hospital','WomenCare','Bangalore','9012345717',2003,170,'Gynecology','Dr. Shilpa',4.5)," +
                    "(49,'Healing Hands Hospital','General','Shimoga','9012345718',2019,85,'General','Dr. Krishna',4.1)," +
                    "(50,'Sparsha Kids Hospital','Children','Bangalore','9012345719',2016,100,'Pediatrics','Dr. Meghana',4.3);";

            int rowsAffected = statement.executeUpdate(insert);
            System.out.println("rowsAffected--> " + rowsAffected);
            System.out.println("Insertion ended");

            System.out.println("UPDATE started");

            String update = "UPDATE hospital SET rating = 4.9 WHERE id = 10";
            int u1 = statement.executeUpdate(update);
            System.out.println("UpdatedRows --> " + u1);

            String update1 = "UPDATE hospital SET head_doctor = 'Dr. Newly Updated' WHERE id = 25";
            int u2 = statement.executeUpdate(update1);
            System.out.println("UpdatedRows --> " + u2);

            String update2 = "UPDATE hospital SET bed_count = 500 WHERE location = 'Bangalore'";
            int u3 = statement.executeUpdate(update2);
            System.out.println("UpdatedRows --> " + u3);

            String update3 = "UPDATE hospital SET hospital_type = 'SuperSpeciality' WHERE id = 40";
            int u4 = statement.executeUpdate(update3);
            System.out.println("UpdatedRows --> " + u4);

            System.out.println("UPDATE ended");

            System.out.println("DELETE started");

            String delete1 = "DELETE FROM hospital WHERE id = 1";
            int d1 = statement.executeUpdate(delete1);
            System.out.println("rowsAffected --> " + d1);

            String delete2 = "DELETE FROM hospital WHERE location = 'Delhi'";
            int d2 = statement.executeUpdate(delete2);
            System.out.println("rowsAffected --> " + d2);
            System.out.println("DELETE ended");

            System.out.println("fetching started");
            System.out.println("fetch all the row");
            String fetch = "SELECT * FROM hospital";
            ResultSet resultSet = statement.executeQuery(fetch);
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt(1) + "  " +
                                resultSet.getString(2) + "  " +
                                resultSet.getString(3) + "  " +
                                resultSet.getString(4) + "  " +
                                resultSet.getString(5) + "  " +
                                resultSet.getInt(6) + "  " +
                                resultSet.getString(7) + "  " +
                                resultSet.getString(8) + "  " +
                                resultSet.getString(9) + "  " +
                                resultSet.getDouble(10)
                );
            }

            System.out.println("-----------------------------------------------");
            System.out.println("fetch one row");
            String fetch1 = "SELECT * FROM hospital WHERE id=1";
            ResultSet resultSet1 = statement.executeQuery(fetch1);
            while (resultSet1.next()) {
                System.out.println(
                        resultSet1.getInt(1) + "  " +
                                resultSet1.getString(2) + "  " +
                                resultSet1.getString(3) + "  " +
                                resultSet1.getString(4) + "  " +
                                resultSet1.getString(5) + "  " +
                                resultSet1.getInt(6) + "  " +
                                resultSet1.getString(7) + "  " +
                                resultSet1.getString(8) + "  " +
                                resultSet1.getString(9) + "  " +
                                resultSet1.getDouble(10)
                );
            }

            System.out.println("------------------------------------------");
            System.out.println("fetch one row and one column");
            String fetch2 = "SELECT hospital_name FROM hospital WHERE id=1";
            ResultSet resultSet2 = statement.executeQuery(fetch2);
            while (resultSet2.next()) {
                System.out.println(resultSet2.getString("hospital_name"));
            }

            System.out.println("-----------------------------------------------");
            System.out.println("fetch two rows");
            String fetch3 = "SELECT * FROM hospital WHERE hospital_name='LifeLine Hospital' OR id=1";
            ResultSet resultSet3 = statement.executeQuery(fetch3);
            while (resultSet3.next()) {
                System.out.println(
                        resultSet3.getInt(1) + "  " +
                                resultSet3.getString(2) + "  " +
                                resultSet3.getString(3) + "  " +
                                resultSet3.getString(4) + "  " +
                                resultSet3.getString(5) + "  " +
                                resultSet3.getInt(6) + "  " +
                                resultSet3.getString(7) + "  " +
                                resultSet3.getString(8) + "  " +
                                resultSet3.getString(9) + "  " +
                                resultSet3.getDouble(10)
                );
            }

            System.out.println("---------------------------------------------------");
            System.out.println("fetch two rows");
            String fetch4 = "SELECT * FROM hospital WHERE hospital_name='LifeLine Hospital' OR id=1 OR id=8";
            ResultSet resultSet4 = statement.executeQuery(fetch4);
            while (resultSet4.next()) {
                System.out.println(
                        resultSet4.getInt(1) + "  " +
                                resultSet4.getString(2) + "  " +
                                resultSet4.getString(3) + "  " +
                                resultSet4.getString(4) + "  " +
                                resultSet4.getString(5) + "  " +
                                resultSet4.getInt(6) + "  " +
                                resultSet4.getString(7) + "  " +
                                resultSet4.getString(8) + "  " +
                                resultSet4.getString(9) + "  " +
                                resultSet4.getDouble(10)
                );
            }

            System.out.println("----------------------------------------------------");
            System.out.println("one column all row");
            String fetch5 = "SELECT hospital_name FROM hospital";
            ResultSet resultSet5 = statement.executeQuery(fetch5);
            while (resultSet5.next()) {
                System.out.println(resultSet5.getString("hospital_name"));
            }

            System.out.println("-----------------------------------------------------");
            System.out.println("fetch distinct");
            String fetch6 = "SELECT DISTINCT hospital_name, id FROM hospital";
            ResultSet resultSet6 = statement.executeQuery(fetch6);
            while (resultSet6.next()) {
                System.out.println(resultSet6.getInt("id") + "   " + resultSet6.getString("hospital_name"));
            }

            System.out.println("---------------------------------------------------");
            System.out.println("count");
            String fetch7 = "SELECT COUNT(*) FROM hospital";
            ResultSet resultSet7 = statement.executeQuery(fetch7);
            while (resultSet7.next()) {
                System.out.println(resultSet7.getInt(1));
            }

            System.out.println("---------------------------------------------------");
            System.out.println("latest row");
            String fetch8 = "SELECT * FROM hospital ORDER BY established_year DESC LIMIT 1";
            ResultSet resultSet8 = statement.executeQuery(fetch8);
            while (resultSet8.next()) {
                System.out.println(
                        resultSet8.getInt(1) + "  " +
                                resultSet8.getString(2) + "  " +
                                resultSet8.getString(3) + "  " +
                                resultSet8.getString(4) + "  " +
                                resultSet8.getString(5) + "  " +
                                resultSet8.getInt(6) + "  " +
                                resultSet8.getString(7) + "  " +
                                resultSet8.getString(8) + "  " +
                                resultSet8.getString(9) + "  " +
                                resultSet8.getDouble(10)
                );
            }

            System.out.println("---------------------------------------------------");
            System.out.println("Order by id row");
            String fetch9 = "SELECT * FROM hospital ORDER BY id DESC";
            ResultSet resultSet9 = statement.executeQuery(fetch9);
            while (resultSet9.next()) {
                System.out.println(
                        resultSet9.getInt(1) + "  " +
                                resultSet9.getString(2) + "  " +
                                resultSet9.getString(3) + "  " +
                                resultSet9.getString(4) + "  " +
                                resultSet9.getString(5) + "  " +
                                resultSet9.getInt(6) + "  " +
                                resultSet9.getString(7) + "  " +
                                resultSet9.getString(8) + "  " +
                                resultSet9.getString(9) + "  " +
                                resultSet9.getDouble(10)
                );
            }

            System.out.println("---------------------------------------------------");
            System.out.println("oldest row");
            String fetch10 = "SELECT * FROM hospital ORDER BY established_year ASC LIMIT 1";
            ResultSet resultSet10 = statement.executeQuery(fetch10);
            while (resultSet10.next()) {
                System.out.println(
                        resultSet10.getInt(1) + "  " +
                                resultSet10.getString(2) + "  " +
                                resultSet10.getString(3) + "  " +
                                resultSet10.getString(4) + "  " +
                                resultSet10.getString(5) + "  " +
                                resultSet10.getInt(6) + "  " +
                                resultSet10.getString(7) + "  " +
                                resultSet10.getString(8) + "  " +
                                resultSet10.getString(9) + "  " +
                                resultSet10.getDouble(10)
                );
            }

            System.out.println("---------------------------------------------------");
            System.out.println("group by row");
            String fetch11 = "SELECT location FROM hospital GROUP BY location";
            ResultSet resultSet11 = statement.executeQuery(fetch11);
            while (resultSet11.next()) {
                System.out.println(resultSet11.getString(1));
            }

            System.out.println("---------------------------------------------------");
            System.out.println("max row");
            String fetch12 = "SELECT MAX(location) FROM hospital";
            ResultSet resultSet12 = statement.executeQuery(fetch12);
            while (resultSet12.next()) {
                System.out.println(resultSet12.getString(1));
            }

            System.out.println("---------------------------------------------------");
            System.out.println("min row");
            String fetch13 = "SELECT MIN(location) FROM hospital";
            ResultSet resultSet13 = statement.executeQuery(fetch13);
            while (resultSet13.next()) {
                System.out.println(resultSet13.getString(1));
            }

            System.out.println("-------------------------------------------------------");
            System.out.println("Group by location");

            String fetch14 = "SELECT location, COUNT(*) AS total FROM hospital GROUP BY location";

            ResultSet resultSet14 = statement.executeQuery(fetch14);

            while (resultSet14.next()) {
                String location = resultSet14.getString("location");
                int total = resultSet14.getInt("total");
                System.out.println(location + " = " + total);
            }

            System.out.println("fetching ended");


        } catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println("main ended");
    }

}
