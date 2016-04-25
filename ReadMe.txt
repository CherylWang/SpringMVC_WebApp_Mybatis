dependces :

IDEA 14.X
apache-tomcat-8.0.33
maven-3.2.5


abstract : web App Using Spring MVC + Mybatis + MySql+Maven + IEDA(IDE)

if you want to run this application yourself, you have to edit the file /src/main/resources/config.properties and setUp the database

the database should have a table named "USERS" with attributes like this:


Field                        Type
userIdint(11)                NOT NULL
nicknamevarchar(10)          NULL
firstNamevarchar(10)         NULL
lastNamevarchar(10)          NULL
passwordvarchar(10)          NULL



