diff --git a/flyway-core/src/test/java/com/googlecode/flyway/core/dbsupport/oracle/OracleDbSupportMediumTest.java b/flyway-core/src/test/java/com/googlecode/flyway/core/dbsupport/oracle/OracleDbSupportMediumTest.java
index bbc0686..4803022 100644
--- a/flyway-core/src/test/java/com/googlecode/flyway/core/dbsupport/oracle/OracleDbSupportMediumTest.java
+++ b/flyway-core/src/test/java/com/googlecode/flyway/core/dbsupport/oracle/OracleDbSupportMediumTest.java
@@ -64,13 +64,13 @@
         if (customPropertiesFile.canRead()) {
             connectionProperties.load(new FileInputStream(customPropertiesFile));
         }
-        if (!connectionProperties.contains("oracle.user")) {
+        if (!connectionProperties.containsKey("oracle.user")) {
             connectionProperties.setProperty("oracle.user", "flyway");
         }
-        if (!connectionProperties.contains("oracle.password")) {
+        if (!connectionProperties.containsKey("oracle.password")) {
             connectionProperties.setProperty("oracle.password", "flyway");
         }
-        if (!connectionProperties.contains("oracle.url")) {
+        if (!connectionProperties.containsKey("oracle.url")) {
             connectionProperties.setProperty("oracle.url", "jdbc:oracle:thin:@localhost:1521:XE");
         }
         return connectionProperties;
