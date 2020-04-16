# test-jdbc - postgres , oracle, sqlserver

wget https://github.com/inv3r53/test-jdbc/releases/download/v0.1/test-jdbc-0.0.1-SNAPSHOT-shaded.jar

java [-Doracle.jdbc.v\$session.osuser=${USER:0:29}] -jar test-jdbc-0.0.1-SNAPSHOT-shaded.jar jdbc_url  username password


Oracle
java -Doracle.jdbc.v\$session.osuser=${USER:0:29} -jar test-jdbc-0.0.1-SNAPSHOT-shaded.jar jdbc:oracle:thin:@localhost:1521/dbname dbuser dbpass

SQLServer
java -jar test-jdbc-0.0.1-SNAPSHOT-shaded.jar "jdbc:jtds:sqlserver://host:51589;databaseName=dbname" dbuser dbpass

Postgres
java -jar test-jdbc-0.0.1-SNAPSHOT-shaded.jar jdbc:postgresql://localhost:5432/dbname dbuser dbpass

