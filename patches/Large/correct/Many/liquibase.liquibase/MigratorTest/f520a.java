diff --git a/core/src/java-test/liquibase/migrator/MigratorTest.java b/core/src/java-test/liquibase/migrator/MigratorTest.java
index b2e5bbc..cde003b 100644
--- a/core/src/java-test/liquibase/migrator/MigratorTest.java
+++ b/core/src/java-test/liquibase/migrator/MigratorTest.java
@@ -63,7 +63,7 @@
     @Test
     public void getImplementedDatabases() throws Exception {
         List<Database> databases = Arrays.asList(DatabaseFactory.getInstance().getImplementedDatabases());
-        assertEquals(10, databases.size());
+        assertEquals(11, databases.size());
 
         boolean foundOracle = false;
         boolean foundPostgres = false;
