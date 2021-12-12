diff --git a/flyway-sample/src/main/java/com/googlecode/flyway/sample/Main.java b/flyway-sample/src/main/java/com/googlecode/flyway/sample/Main.java
index 2a33b97..9ae4d78 100644
--- a/flyway-sample/src/main/java/com/googlecode/flyway/sample/Main.java
+++ b/flyway-sample/src/main/java/com/googlecode/flyway/sample/Main.java
@@ -37,7 +37,7 @@
                 new SimpleDriverDataSource(new org.hsqldb.jdbcDriver(), "jdbc:hsqldb:file:db/flyway_sample;shutdown=true", "SA", "");
         Flyway flyway = new Flyway();
         flyway.setDataSource(dataSource);
-        flyway.setLocations("com.googlecode.flyway.sample.migration");
+        flyway.setLocations("db.migration", "com.googlecode.flyway.sample.migration");
         flyway.migrate();
 
         SimpleJdbcTemplate jdbcTemplate = new SimpleJdbcTemplate(dataSource);
