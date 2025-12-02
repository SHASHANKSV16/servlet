package com.xworkz.dataapp.dbnames;

import com.xworkz.dataapp.constants.DBConst;

import java.sql.*;

public class SweetRunner {

    public static void main(String[] args) {
        System.out.println("main started");
        try (Connection connection = DriverManager.getConnection(DBConst.URL.getProperty(), DBConst.USERNAME.getProperty(), DBConst.PWD.getProperty());
             Statement statement = connection.createStatement();) {

            System.out.println("Connection -->" + connection);

            System.out.println("Insertion started");
            String insert = "INSERT INTO sweet_info VALUES" +
                    "(1,'AlmondSquare','Premium',42.0,'Almond',34,'Haldirams')," +
                    "(2,'BerryDrop','Modern',26.0,'Berry',29,'AnandSweets')," +
                    "(3,'SugarTwist','Fried',24.0,'Caramel',41,'SweetWorld')," +
                    "(4,'MilkPearl','Soft',38.0,'Cream',46,'BengalHouse')," +
                    "(5,'CashewSlice','Luxury',72.0,'Cashew',27,'DharwadPeda')," +
                    "(6,'VanillaBite','Bakery',31.0,'Vanilla',39,'Haldirams')," +
                    "(7,'SnowRoll','Deluxe',36.0,'CoconutMilk',33,'AnandSweets')," +
                    "(8,'HoneyShot','Syrup',29.0,'Honey',52,'SweetWorld')," +
                    "(9,'GrainFudge','Healthy',23.0,'Millet',44,'BengalHouse')," +
                    "(10,'ButterDisk','Fusion',35.0,'Butter',51,'DharwadPeda')," +
                    "(11,'SaffronRice','Dessert',19.0,'Saffron',28,'Haldirams')," +
                    "(12,'PaneerBall','Classic',34.0,'Paneer',49,'AnandSweets')," +
                    "(13,'ElaichiCrunch','Crunchy',27.0,'Elaichi',67,'SweetWorld')," +
                    "(14,'GoldenDot','Dry',48.0,'Ghee',37,'BengalHouse')," +
                    "(15,'MapleCake','Syrup',33.0,'Maple',31,'DharwadPeda')," +
                    "(16,'MintCandy','Rock',18.0,'Mint',88,'Haldirams')," +
                    "(17,'CheeseSpiral','Special',52.0,'Cheese',26,'AnandSweets')," +
                    "(18,'MalaiDrop','Rich',44.0,'Malai',24,'SweetWorld')," +
                    "(19,'PalmKheer','Traditional',27.0,'PalmSugar',34,'BengalHouse')," +
                    "(20,'DalPuri','Festive',21.0,'ChanaDal',42,'DharwadPeda')," +
                    "(21,'TemplePeda','Royal',63.0,'FreshCream',53,'Haldirams')," +
                    "(22,'ButterCookies','Baked',22.0,'Butter',61,'AnandSweets')," +
                    "(23,'NutPaste','Energy',58.0,'MixedNuts',29,'SweetWorld')," +
                    "(24,'PumpkinSweet','Seasonal',30.0,'Pumpkin',38,'BengalHouse')," +
                    "(25,'LuxuryLadoo','Elite',81.0,'ExoticFruits',22,'DharwadPeda')," +
                    "(26,'SeedCrunch','Organic',19.0,'Sunflower',85,'Haldirams')," +
                    "(27,'MilkCube','Dense',37.0,'CondensedMilk',47,'AnandSweets')," +
                    "(28,'SugarDonut','Snack',41.0,'SugarDust',34,'SweetWorld')," +
                    "(29,'SaffronDisc','Aromatic',56.0,'Saffron',43,'BengalHouse')," +
                    "(30,'MilkFoam','Foamy',46.0,'CreamMilk',25,'DharwadPeda')," +
                    "(31,'TropicalBar','Fruit',33.0,'PineCoco',54,'Haldirams')," +
                    "(32,'ChocoLayer','Fusion',36.0,'DarkChoco',45,'AnandSweets')," +
                    "(33,'SesamePop','Rustic',21.0,'BlackSesame',48,'SweetWorld')," +
                    "(34,'MilkyRoll','Creamy',40.0,'FullCream',26,'BengalHouse')," +
                    "(35,'SugarBoat','Floating',29.0,'IcingSugar',31,'DharwadPeda')," +
                    "(36,'KhoyaBuns','Fried',34.0,'Khoya',39,'Haldirams')," +
                    "(37,'HoneyBrick','Bakery',28.0,'WildHoney',33,'AnandSweets')," +
                    "(38,'RavaCream','South',16.0,'Cardamom',64,'SweetWorld')," +
                    "(39,'PlainRava','Dry',14.0,'WhiteRava',72,'BengalHouse')," +
                    "(40,'WheatDrop','Grain',26.0,'SoftWheat',35,'DharwadPeda')," +
                    "(41,'PalmRing','Village',20.0,'CountryJaggery',44,'Haldirams')," +
                    "(42,'UradSwirl','Spiral',23.0,'UradDal',41,'AnandSweets')," +
                    "(43,'KajuRibbon','Premium',62.0,'CashewPure',29,'SweetWorld')," +
                    "(44,'CornSoftie','Gel',27.0,'CornStarch',55,'BengalHouse')," +
                    "(45,'SesameStick','Fiber',17.0,'WhiteSesame',49,'DharwadPeda')," +
                    "(46,'MilkTunnel','Soft',35.0,'BuffaloMilk',34,'Haldirams')," +
                    "(47,'CoconutDome','Festive',24.0,'TenderCoconut',41,'AnandSweets')," +
                    "(48,'RicePocket','Steamed',18.0,'RawRice',36,'SweetWorld')," +
                    "(49,'JaggeryCup','CupSweet',22.0,'DarkJaggery',32,'BengalHouse')," +
                    "(50,'BlackRiceHalwa','Kerala',34.0,'MattaRice',27,'DharwadPeda')," +
                    "(51,'BananaBlock','Tropical',21.0,'Nendran',38,'Haldirams')," +
                    "(52,'RoseCreamSlice','Floral',29.0,'RoseExtract',35,'AnandSweets')," +
                    "(53,'PistaSquare','Royal',57.0,'IranPista',26,'SweetWorld')," +
                    "(54,'DateEnergyBall','Fitness',49.0,'Khajur',33,'BengalHouse')," +
                    "(55,'DryFruitSheet','Supreme',61.0,'FiveFruits',24,'DharwadPeda')," +
                    "(56,'KesariMini','Temple',19.0,'TempleGhee',45,'Haldirams')," +
                    "(57,'MilkPak','Dairy',31.0,'FarmMilk',28,'AnandSweets')," +
                    "(58,'GheeBlock','Bold',52.0,'DesiGhee',30,'SweetWorld')," +
                    "(59,'RoyalSpiral','Luxury',37.0,'CrystalSugar',29,'BengalHouse')," +
                    "(60,'PaneerSquare','Protein',34.0,'FreshPaneer',31,'DharwadPeda')," +
                    "(61,'KajuFruit','Fusion',64.0,'FruitCashew',25,'Haldirams')," +
                    "(62,'KesarMilkBite','Elite',41.0,'KashmirKesar',34,'AnandSweets')," +
                    "(63,'CocoPearl','Island',18.0,'FreshCoconut',39,'SweetWorld')," +
                    "(64,'ChocoDrop','Candy',22.0,'BelgiumChoco',44,'BengalHouse')," +
                    "(65,'RoseBar','Aroma',27.0,'DesiRose',30,'DharwadPeda')," +
                    "(66,'JaggeryCube','Country',20.0,'VillageJaggery',35,'Haldirams')," +
                    "(67,'AnjeerGold','Premium',59.0,'AfghanAnjeer',23,'AnandSweets')," +
                    "(68,'DateSoftie','Vegan',51.0,'ArabDates',21,'SweetWorld')," +
                    "(69,'OrangeSlice','Citrus',24.0,'NagpurOrange',29,'BengalHouse')," +
                    "(70,'PineCube','Fresh',21.0,'GoaPineapple',34,'DharwadPeda')," +
                    "(71,'AppleSpice','Winter',26.0,'KashmirApple',37,'Haldirams')," +
                    "(72,'GheeSoft','Rich',39.0,'BuffaloGhee',33,'AnandSweets')," +
                    "(73,'SagoBall','Village',17.0,'FreshSago',52,'SweetWorld')," +
                    "(74,'BesanGold','Classic',32.0,'PremiumBesan',46,'BengalHouse')," +
                    "(75,'RagiPowerBall','Health+',23.0,'OrganicRagi',41,'DharwadPeda');";

//            statement.executeUpdate(insert);



            String update = "UPDATE sweet_info SET sweet_name = 'MysorePak Special' WHERE brand_name  = 'AnandSweets'";
            int rowsAffected = statement.executeUpdate(update);
            System.out.println("UpdatedRows -- >" + rowsAffected);

            String update1 = "UPDATE sweet_info SET price = 10.0 WHERE sweet_id  = 50";
            int rowsAffected1 = statement.executeUpdate(update1);
            System.out.println("UpdatedRows -- >" + rowsAffected1);

            String update2 = "UPDATE sweet_info SET brand_name = 'Haldirams' WHERE sweet_name  = 'BananaHalwa'";
            int rowsAffected2 = statement.executeUpdate(update2);
            System.out.println("UpdatedRows -- >" + rowsAffected2);

            String update3 = "UPDATE sweet_info SET main_ingredient = 'Pista' WHERE quantity  = 20";
            int rowsAffected3 = statement.executeUpdate(update3);
            System.out.println("UpdatedRows -- >" + rowsAffected3);
            System.out.println("UPDATE ended");

            String delete = "DELETE from sweet_info WHERE sweet_id = 1";
            int rowsAffected4 = statement.executeUpdate(delete);
            System.out.println("rowsAffected--> " + rowsAffected4);

            String delete1 = "DELETE from sweet_info WHERE brand_name = 'BengalHouse'";
            int rowsAffected5 = statement.executeUpdate(delete1);
            System.out.println("rowsAffected--> " + rowsAffected5);

            String delete2 = "DELETE from sweet_info WHERE brand_name = 'AnandSweets'";
            int rowsAffected6 = statement.executeUpdate(delete2);
            System.out.println("rowsAffected--> " + rowsAffected6);

            System.out.println("DELETE ended");

            System.out.println("SELECT started");

            System.out.println("Select all rows");
            ResultSet rsAll = statement.executeQuery("SELECT * FROM sweet_info");
            while (rsAll.next()) {
                System.out.println(rsAll.getInt("sweet_id") + "\t" +
                        rsAll.getString("sweet_name") + "\t" +
                        rsAll.getString("sweet_type") + "\t" +
                        rsAll.getDouble("price") + "\t" +
                        rsAll.getString("main_ingredient") + "\t" +
                        rsAll.getInt("quantity") + "\t" +
                        rsAll.getString("brand_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select one row");
            ResultSet rsOneRow = statement.executeQuery("SELECT * FROM sweet_info WHERE sweet_id = 2");
            while (rsOneRow.next()) {
                System.out.println(rsOneRow.getInt("sweet_id") + "\t" + rsOneRow.getString("sweet_name") +
                        "\t" + rsOneRow.getString("sweet_type"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select one row 1 column");
            ResultSet rsOneColumn = statement.executeQuery("SELECT sweet_name FROM sweet_info WHERE sweet_id = 3");
            while (rsOneColumn.next()) {
                System.out.println(rsOneColumn.getString("sweet_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select two rows");
            ResultSet rsTwoRows = statement.executeQuery("SELECT * FROM sweet_info LIMIT 2");
            while (rsTwoRows.next()) {
                System.out.println(rsTwoRows.getInt("sweet_id") + "\t" + rsTwoRows.getString("sweet_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select three rows");
            ResultSet rsThreeRows = statement.executeQuery("SELECT * FROM sweet_info LIMIT 3");
            while (rsThreeRows.next()) {
                System.out.println(rsThreeRows.getInt("sweet_id") + "\t" + rsThreeRows.getString("sweet_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select one column all rows");
            ResultSet rsOneColumnAll = statement.executeQuery("SELECT sweet_name FROM sweet_info");
            while (rsOneColumnAll.next()) {
                System.out.println(rsOneColumnAll.getString("sweet_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select distinct");
            ResultSet rsDistinct = statement.executeQuery("SELECT DISTINCT sweet_type FROM sweet_info");
            while (rsDistinct.next()) {
                System.out.println(rsDistinct.getString("sweet_type"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select count(*)");
            ResultSet rsCount = statement.executeQuery("SELECT COUNT(*) FROM sweet_info");
            if (rsCount.next()) {
                System.out.println(rsCount.getInt(1));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select latest row");
            ResultSet rsLatest = statement.executeQuery("SELECT * FROM sweet_info ORDER BY sweet_id DESC LIMIT 1");
            while (rsLatest.next()) {
                System.out.println(rsLatest.getInt("sweet_id") + "\t" + rsLatest.getString("sweet_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select 2 max row");
            ResultSet rsMax2 = statement.executeQuery("SELECT * FROM sweet_info ORDER BY price DESC LIMIT 2");
            while (rsMax2.next()) {
                System.out.println(rsMax2.getInt("sweet_id") + "\t" + rsMax2.getString("sweet_name") + "\t" + rsMax2.getDouble("price"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select 5 min row");
            ResultSet rsMin5 = statement.executeQuery("SELECT * FROM sweet_info ORDER BY price ASC LIMIT 5");
            while (rsMin5.next()) {
                System.out.println(rsMin5.getInt("sweet_id") + "\t" + rsMin5.getString("sweet_name") + "\t" + rsMin5.getDouble("price"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select oldest row");
            ResultSet rsOldest = statement.executeQuery("SELECT * FROM sweet_info ORDER BY sweet_id ASC LIMIT 1");
            while (rsOldest.next()) {
                System.out.println(rsOldest.getInt("sweet_id") + "\t" + rsOldest.getString("sweet_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select all rows order by id desc");
            ResultSet rsOrderDesc = statement.executeQuery("SELECT * FROM sweet_info ORDER BY sweet_id DESC");
            while (rsOrderDesc.next()) {
                System.out.println(rsOrderDesc.getInt("sweet_id") + "\t" + rsOrderDesc.getString("sweet_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select with group by");
            ResultSet rsGroupBy = statement.executeQuery("SELECT sweet_type, COUNT(*) FROM sweet_info GROUP BY sweet_type");
            while (rsGroupBy.next()) {
                System.out.println(rsGroupBy.getString(1) + "\t" + rsGroupBy.getInt(2));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select with group by and having");
            ResultSet rsGroupHaving = statement.executeQuery("SELECT sweet_type, COUNT(*) FROM sweet_info GROUP BY sweet_type HAVING COUNT(*) > 2");
            while (rsGroupHaving.next()) {
                System.out.println(rsGroupHaving.getString(1) + "\t" + rsGroupHaving.getInt(2));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("SELECT ended");


        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("main ended");
    }
}


