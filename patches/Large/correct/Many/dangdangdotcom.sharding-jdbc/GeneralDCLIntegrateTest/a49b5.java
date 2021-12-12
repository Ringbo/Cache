diff --git a/sharding-jdbc/src/test/java/io/shardingsphere/dbtest/engine/dcl/GeneralDCLIntegrateTest.java b/sharding-jdbc/src/test/java/io/shardingsphere/dbtest/engine/dcl/GeneralDCLIntegrateTest.java
index b2942a5..f6aa31b 100644
--- a/sharding-jdbc/src/test/java/io/shardingsphere/dbtest/engine/dcl/GeneralDCLIntegrateTest.java
+++ b/sharding-jdbc/src/test/java/io/shardingsphere/dbtest/engine/dcl/GeneralDCLIntegrateTest.java
@@ -46,7 +46,7 @@
     
     @Test
     public void assertExecute() throws SQLException {
-        if (!getDatabaseTypeEnvironment().isEnabled() && !isExecuted()) {
+        if (!getDatabaseTypeEnvironment().isEnabled() || !isExecuted()) {
             return;
         }
         try (Connection connection = getDataSource().getConnection()) {
