package com.xworkz.dataapp.dbnames;

import com.xworkz.dataapp.constants.DBConst;

import java.sql.*;

public class PresidentRunner {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DBConst.URL.getProperty(), DBConst.USERNAME.getProperty(), DBConst.PWD.getProperty());
             Statement statement = connection.createStatement();) {
            ;
            System.out.println("inserting values to president table");

            String insert = "INSERT INTO president VALUES" +
                    "(1,'Narendra','Modi','Narendra Modi','India','1950-09-17','Vadnagar','Indian','2014-05-26','2024-06-09',FALSE,'BJP','Digital India','MA Political Science','modi@gov.in',4.8)," +
                    "(2,'Joe','Biden','Joe Biden','USA','1942-11-20','Scranton','American','2021-01-20','2025-01-20',FALSE,'Democratic Party','Infrastructure Bill','Law','biden@whitehouse.gov',4.4)," +
                    "(3,'Emmanuel','Macron','Emmanuel Macron','France','1977-12-21','Amiens','French','2017-05-14','2027-05-14',TRUE,'Renaissance','Economic Reforms','Philosophy','macron@gov.fr',4.3)," +
                    "(4,'Rishi','Sunak','Rishi Sunak','UK','1980-05-12','Southampton','British','2022-10-25','2024-07-04',FALSE,'Conservative Party','Economic Stability','MBA','sunak@gov.uk',4.1)," +
                    "(5,'Xi','Jinping','Xi Jinping','China','1953-06-15','Beijing','Chinese','2013-03-14','2028-03-14',TRUE,'Communist Party','Belt and Road','Chemical Engineering','xi@gov.cn',4.5)," +
                    "(6,'Vladimir','Putin','Vladimir Putin','Russia','1952-10-07','Saint Petersburg','Russian','2012-05-07','2024-05-07',FALSE,'United Russia','Military Modernization','Law','putin@gov.ru',4.2)," +
                    "(7,'Justin','Trudeau','Justin Trudeau','Canada','1971-12-25','Ottawa','Canadian','2015-11-04','2025-11-04',TRUE,'Liberal Party','Climate Action','Literature','trudeau@gov.ca',4.0)," +
                    "(8,'Olaf','Scholz','Olaf Scholz','Germany','1958-06-14','Osnabruck','German','2021-12-08','2025-12-08',TRUE,'SPD','Energy Reforms','Economics','scholz@gov.de',4.1)," +
                    "(9,'Jair','Bolsonaro','Jair Bolsonaro','Brazil','1955-03-21','Campinas','Brazilian','2019-01-01','2023-01-01',FALSE,'Social Liberal Party','Defense Policy','Military Science','bolsonaro@gov.br',3.9)," +
                    "(10,'Alberto','Fernandez','Alberto Fernandez','Argentina','1959-04-02','Buenos Aires','Argentinian','2019-12-10','2023-12-10',FALSE,'Justicialist Party','Debt Control','Law','fernandez@gov.ar',4.0)," +
                    "(11,'Pedro','Sanchez','Pedro Sanchez','Spain','1972-02-29','Madrid','Spanish','2018-06-02','2027-06-02',TRUE,'PSOE','Labor reforms','Economics','sanchez@gov.es',4.2)," +
                    "(12,'Giorgia','Meloni','Giorgia Meloni','Italy','1977-01-15','Rome','Italian','2022-10-22','2027-10-22',TRUE,'Brothers of Italy','Tax restructuring','Political Science','meloni@gov.it',4.3)," +
                    "(13,'Recep','Erdogan','Recep Erdogan','Turkey','1954-02-26','Istanbul','Turkish','2014-08-28','2028-08-28',TRUE,'AK Party','Mega infrastructure','Business','erdogan@gov.tr',4.1)," +
                    "(14,'Andrzej','Duda','Andrzej Duda','Poland','1972-05-16','Krakow','Polish','2015-08-06','2025-08-06',TRUE,'Law and Justice','Judicial reforms','Law','duda@gov.pl',4.0)," +
                    "(15,'Luis','Arce','Luis Arce','Bolivia','1963-09-28','La Paz','Bolivian','2020-11-08','2025-11-08',TRUE,'MAS','Inflation control','Economics','arce@gov.bo',4.2)," +
                    "(16,'Tsai','Ingwen','Tsai Ingwen','Taiwan','1956-08-31','Taipei','Taiwanese','2016-05-20','2024-05-20',FALSE,'DPP','Digital economy','Law','tsai@gov.tw',4.4)," +
                    "(17,'Moon','Jaein','Moon Jaein','South Korea','1953-01-24','Geoje','Korean','2017-05-10','2022-05-10',FALSE,'Democratic Party','Peace treaties','Law','moon@gov.kr',4.3)," +
                    "(18,'Abdel','Sisi','Abdel Sisi','Egypt','1954-11-19','Cairo','Egyptian','2014-06-08','2030-06-08',TRUE,'Future Party','Military expansion','Defense Studies','sisi@gov.eg',4.0)," +
                    "(19,'Ferdinand','Marcos','Ferdinand Marcos Jr','Philippines','1957-09-13','Manila','Filipino','2022-06-30','2028-06-30',TRUE,'PFP','Economic growth','Politics','marcos@gov.ph',4.1)," +
                    "(20,'Lula','Silva','Lula da Silva','Brazil','1945-10-27','Recife','Brazilian','2023-01-01','2027-01-01',TRUE,'Workers Party','Social uplift','Trade Union','lula@gov.br',4.5)," +
                    "(21,'Mohammed','BinSalman','Mohammed BinSalman','Saudi Arabia','1985-08-31','Riyadh','Saudi','2017-06-21','2035-06-21',TRUE,'Royal Court','Vision 2030','Business','mbs@gov.sa',4.2)," +
                    "(22,'Jacinda','Ardern','Jacinda Ardern','New Zealand','1980-07-26','Hamilton','Kiwi','2017-10-26','2023-01-19',FALSE,'Labour Party','COVID leadership','Communication','jacinda@gov.nz',4.6)," +
                    "(23,'Nayib','Bukele','Nayib Bukele','El Salvador','1981-07-24','San Salvador','Salvadoran','2019-06-01','2029-06-01',TRUE,'New Ideas','Crime control','Business','bukele@gov.sv',4.4)," +
                    "(24,'Alexander','DeCroo','Alexander De Croo','Belgium','1975-11-03','Vilvoorde','Belgian','2020-10-01','2025-10-01',TRUE,'Open VLD','Digital governance','Business','decroo@gov.be',4.1)," +
                    "(25,'Mark','Rutte','Mark Rutte','Netherlands','1967-02-14','The Hague','Dutch','2010-10-14','2024-10-14',TRUE,'VVD','Budget reforms','History','rutte@gov.nl',4.3)," +
                    "(26,'Ulf','Kristersson','Ulf Kristersson','Sweden','1963-12-29','Lund','Swedish','2022-10-18','2026-10-18',TRUE,'Moderate Party','Crime control','Economics','ulf@gov.se',4.2)," +
                    "(27,'Georgia','Meloni2','Georgia Meloni2','Italy','1976-12-29','Naples','Italian','2028-01-01','2033-01-01',FALSE,'Center Bloc','Education overhaul','Arts','meloni2@gov.it',3.9)," +
                    "(28,'Zoran','Milanovic','Zoran Milanovic','Croatia','1966-10-30','Zagreb','Croatian','2020-02-18','2025-02-18',TRUE,'SDP','Foreign relations','Law','milanovic@gov.hr',4.0)," +
                    "(29,'Karin','Keller','Karin Keller','Austria','1965-04-11','Graz','Austrian','2019-01-01','2025-01-01',FALSE,'Green Party','Carbon policy','Environment','keller@gov.at',3.8)," +
                    "(30,'Miguel','Diaz','Miguel Diaz','Cuba','1960-04-20','Santa Clara','Cuban','2018-04-19','2028-04-19',TRUE,'Communist Party','Energy reforms','Electronics','diaz@gov.cu',4.0)," +
                    "(31,'Paul','Biya','Paul Biya','Cameroon','1933-02-13','Mvomeka','Cameroonian','1982-11-06','2025-11-06',TRUE,'CPDM','Stability policies','Political Science','biya@gov.cm',3.7)," +
                    "(32,'Abiy','Ahmed','Abiy Ahmed','Ethiopia','1976-08-15','Beshasha','Ethiopian','2018-04-02','2026-04-02',TRUE,'Prosperity Party','Peace accord','Military Science','abiy@gov.et',4.3)," +
                    "(33,'Hage','Geingob','Hage Geingob','Namibia','1941-08-03','Otjiwarongo','Namibian','2015-03-21','2024-03-21',FALSE,'SWAPO','Housing projects','Politics','hage@gov.na',4.0)," +
                    "(34,'Joko','Widodo','Joko Widodo','Indonesia','1961-06-21','Surakarta','Indonesian','2014-10-20','2024-10-20',FALSE,'PDI-P','Smart cities','Forestry','joko@gov.id',4.4)," +
                    "(35,'Ranil','Wickremesinghe','Ranil Wickremesinghe','Sri Lanka','1949-03-24','Colombo','Sri Lankan','2022-07-21','2029-07-21',TRUE,'UNP','Economic recovery','Economics','ranil@gov.lk',4.1)," +
                    "(36,'Sheikh','Hasina','Sheikh Hasina','Bangladesh','1947-09-28','Tungipara','Bangladeshi','2009-01-06','2029-01-06',TRUE,'Awami League','Digital Bangladesh','Literature','hasina@gov.bd',4.5)," +
                    "(37,'Imran','Khan','Imran Khan','Pakistan','1952-10-05','Lahore','Pakistani','2018-08-18','2022-04-10',FALSE,'PTI','Anti corruption','Politics','imran@gov.pk',3.9)," +
                    "(38,'Khalifa','Zayed','Khalifa Zayed','UAE','1948-09-07','Al Ain','Emirati','2004-11-02','2022-05-13',FALSE,'Royal Family','Women empowerment','Defense','zayed@gov.ae',4.2)," +
                    "(39,'Sauli','Niinisto','Sauli Niinisto','Finland','1948-08-24','Salo','Finnish','2012-03-01','2024-03-01',FALSE,'National Coalition','NATO entry','Law','sauli@gov.fi',4.6)," +
                    "(40,'Yoon','Sukyeol','Yoon Sukyeol','South Korea','1960-12-18','Seoul','Korean','2022-05-10','2027-05-10',TRUE,'People Power','Judicial reforms','Law','yoon@gov.kr',4.2)," +
                    "(41,'Gustavo','Petro','Gustavo Petro','Colombia','1960-04-19','Cienaga','Colombian','2022-08-07','2026-08-07',TRUE,'Colombia Humana','Green reform','Economics','petro@gov.co',4.1)," +
                    "(42,'Aleksandar','Vucic','Aleksandar Vucic','Serbia','1970-03-05','Belgrade','Serbian','2017-05-31','2027-05-31',TRUE,'SNS','Industrial growth','Law','vucic@gov.rs',4.0)," +
                    "(43,'Salman','Rushd','Salman Rushd','Oman','1965-02-02','Muscat','Omani','2020-01-01','2026-01-01',TRUE,'Royal Council','Maritime trade','Economics','salman@gov.om',3.8)," +
                    "(44,'Mohamed','Ould','Mohamed Ould','Mauritania','1956-08-04','Atar','Mauritanian','2019-08-01','2024-08-01',FALSE,'UPR','Desert irrigation','Engineering','ould@gov.mr',3.9)," +
                    "(45,'Samia','Suluhu','Samia Suluhu','Tanzania','1960-01-27','Zanzibar','Tanzanian','2021-03-19','2026-03-19',TRUE,'CCM','Trade revival','Public Admin','samia@gov.tz',4.3)," +
                    "(46,'Andres','Obrador','Andres Obrador','Mexico','1953-11-13','Tepetitán','Mexican','2018-12-01','2024-12-01',FALSE,'MORENA','Oil policy','Political Science','obrador@gov.mx',4.0)," +
                    "(47,'Leo','Varadkar','Leo Varadkar','Ireland','1979-01-18','Dublin','Irish','2022-12-17','2027-12-17',TRUE,'Fine Gael','Healthcare reform','Medicine','leo@gov.ie',4.1)," +
                    "(48,'Fumio','Kishida','Fumio Kishida','Japan','1957-07-29','Hiroshima','Japanese','2021-10-04','2024-10-04',TRUE,'LDP','Defense policy','Law','kishida@gov.jp',4.2)," +
                    "(49,'Pedro','Castillo','Pedro Castillo','Peru','1969-10-19','Cajamarca','Peruvian','2021-07-28','2022-12-07',FALSE,'Free Peru','Rural uplift','Education','castillo@gov.pe',3.7)," +
                    "(50,'Tamim','BinHamad','Tamim BinHamad','Qatar','1980-06-03','Doha','Qatari','2013-06-25','2033-06-25',TRUE,'Royal Family','Sports diplomacy','Public Admin','tamim@gov.qa',4.4);";
            int rowEffected1 = statement.executeUpdate(insert);


            System.out.println("inserting is ended");

            System.out.println("Updating Started");
            String update = "Update President Set first_name= 'Narendra' where president_id=1";
            int u1 = statement.executeUpdate(update);
            System.out.println("Row update is   " + u1);

            String update2 = "Update President Set full_name ='Narendra Modi' where first_name='Narendra'";
            int u2 = statement.executeUpdate(update2);
            System.out.println("Row update2 is  " + u2);

            String update3 = "Update president Set country= 'INDIA' where last_name= 'Modi'";
            int u3 = statement.executeUpdate(update3);
            System.out.println("row Update 3 is  " + u3);
            System.out.println("Updating is ended");

            System.out.println("Deleting started");
            String delete = "DELETE FROM PRESIDENT where president_id=39";
            int d1 = statement.executeUpdate(delete);
            System.out.println("Delete of d1 is  " + d1);
            System.out.println("Deleting is ended");

            System.out.println("--------------------------------");
            System.out.println("fetching started");
            System.out.println("fetching all the rows");
            String fetch1 = "SELECT * from president";
            ResultSet resultSet = statement.executeQuery(fetch1);


            while (resultSet.next()) {
                int id = resultSet.getInt("president_id");

                System.out.println(resultSet.getInt("president_id") + "  " +
                        resultSet.getString("first_name") + "  " +
                        resultSet.getString("last_name") + "  " +
                        resultSet.getString("full_name") + "  " +
                        resultSet.getString("country") + "  " +
                        resultSet.getString("date_of_birth") + "  " +
                        resultSet.getString("place_of_birth") + "  " +
                        resultSet.getString("nationality") + "  " +
                        resultSet.getString("term_start") + "  " +
                        resultSet.getString("term_end"));
            }

            System.out.println("---------------------------------------------");
            System.out.println("fetching only one row");
            String fetch2 = "SELECT * from president where first_name ='Narendra'";
            ResultSet resultSet1 = statement.executeQuery(fetch2);
            while (resultSet1.next()) {
                System.out.println(resultSet1.getInt("president_id") + "  " +
                        resultSet1.getString("first_name") + "  " +
                        resultSet1.getString("last_name") + "  " +
                        resultSet1.getString("full_name") + "  " +
                        resultSet1.getString("country") + "  " +
                        resultSet1.getString("date_of_birth") + "  " +
                        resultSet1.getString("place_of_birth") + "  " +
                        resultSet1.getString("nationality") + "  " +
                        resultSet1.getString("term_start") + "  " +
                        resultSet1.getString("term_end"));
                System.out.println("------------------------------------------");
            }
            System.out.println("fetching one row and one column");
            String fetch3 = "SELECT first_name, president_id from president where president_id = 1";
            ResultSet resultSet2 = statement.executeQuery(fetch3);
            while (resultSet2.next()) {
                int id1 = resultSet2.getInt("president_id");
                String fName = resultSet2.getString("first_name");
                System.out.println(id1 + "  " + fName);
            }

            System.out.println("-------------------------------------------");
            System.out.println("select two rows");
            String fetch4 = "SELECT * from president where first_name='Narendra' OR president_id=3";
            ResultSet resultSet3 = statement.executeQuery(fetch4);
            while (resultSet3.next()) {
                System.out.println(resultSet3.getInt("president_id") + "  " +
                        resultSet3.getString("first_name") + "  " +
                        resultSet3.getString("last_name") + "  " +
                        resultSet3.getString("full_name") + "  " +
                        resultSet3.getString("country") + "  " +
                        resultSet3.getString("date_of_birth") + "  " +
                        resultSet3.getString("place_of_birth") + "  " +
                        resultSet3.getString("nationality") + "  " +
                        resultSet3.getString("term_start") + "  " +
                        resultSet3.getString("term_end"));
            }
            System.out.println("-------------------------------");
            System.out.println("three rows");
            String fetch5 = "SELECT * from president where first_name='Narendra' OR president_id=3 OR country='USA'";
            ResultSet resultSet4 = statement.executeQuery(fetch5);
            while (resultSet4.next()) {
                System.out.println(resultSet4.getInt("president_id") + "  " +
                        resultSet4.getString("first_name") + "  " +
                        resultSet4.getString("last_name") + "  " +
                        resultSet4.getString("full_name") + "  " +
                        resultSet4.getString("country") + "  " +
                        resultSet4.getString("date_of_birth") + "  " +
                        resultSet4.getString("place_of_birth") + "  " +
                        resultSet4.getString("nationality") + "  " +
                        resultSet4.getString("term_start") + "  " +
                        resultSet4.getString("term_end"));
            }
            System.out.println("================================");
            System.out.println("fetch one column all the row");
            String fetch6 = "SELECT first_name from president";
            ResultSet resultSet5 = statement.executeQuery(fetch6);
            while (resultSet5.next()) {
                System.out.println(resultSet5.getString("first_name"));
            }
            System.out.println("----------------------------------------");
            System.out.println("fetch distinct element");
            String fetch7 = "SELECT distinct full_name, president_id from president";
            ResultSet resultSet6 = statement.executeQuery(fetch7);
            while (resultSet6.next()) {
                System.out.println(resultSet6.getInt("president_id") + "  " + resultSet6.getString("full_name"));
            }
            System.out.println("----------------------------------------------");
            System.out.println("fetch the count of the row");
            String fetch8 = "SELECT count(*) from president";
            ResultSet resultSet7 = statement.executeQuery(fetch8);
            while (resultSet7.next()) {
                System.out.println(resultSet7.getInt(1));

            }
            System.out.println(" ------------------------------------------------");
            System.out.println("fetch the latest row");
            String fetch9 = "SELECT * from president order by president_id desc limit 1";
            ResultSet resultSet8 = statement.executeQuery(fetch9);
            while (resultSet8.next()) {
                System.out.println(resultSet8.getInt("president_id") + "  " +
                        resultSet8.getString("first_name") + "  " +
                        resultSet8.getString("last_name") + "  " +
                        resultSet8.getString("full_name") + "  " +
                        resultSet8.getString("country") + "  " +
                        resultSet8.getString("date_of_birth") + "  " +
                        resultSet8.getString("place_of_birth") + "  " +
                        resultSet8.getString("nationality") + "  " +
                        resultSet8.getString("term_start") + "  " +
                        resultSet8.getString("term_end"));
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("oldest row");
            String fetch10 = "SELECT full_name  from president order by term_start limit 1";
            ResultSet resultSet9 = statement.executeQuery(fetch10);
            while (resultSet9.next()) {
                System.out.println("Oldest president is     " + resultSet9.getString("full_name"));
            }
            System.out.println("-------------------------------------------------");
            System.out.println("fetch all the row desc");
            String fetch11 = "SELECT * from president order by president_id desc";
            ResultSet resultSet10 = statement.executeQuery(fetch11);
            while (resultSet10.next()) {
                System.out.println(resultSet10.getInt("president_id") + "  " +
                        resultSet10.getString("first_name") + "  " +
                        resultSet10.getString("last_name") + "  " +
                        resultSet10.getString("full_name") + "  " +
                        resultSet10.getString("country") + "  " +
                        resultSet10.getString("date_of_birth") + "  " +
                        resultSet10.getString("place_of_birth") + "  " +
                        resultSet10.getString("nationality") + "  " +
                        resultSet10.getString("term_start") + "  " +
                        resultSet10.getString("term_end"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


