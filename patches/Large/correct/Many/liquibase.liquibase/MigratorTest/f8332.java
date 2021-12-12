diff --git a/src/java-test/liquibase/migrator/MigratorTest.java b/src/java-test/liquibase/migrator/MigratorTest.java
index 323f2db..1c9e97f 100644
--- a/src/java-test/liquibase/migrator/MigratorTest.java
+++ b/src/java-test/liquibase/migrator/MigratorTest.java
@@ -68,7 +68,7 @@
     @Test
     public void getImplementedDatabases() throws Exception {
         List<Database> databases = Arrays.asList(DatabaseFactory.getInstance().getImplementedDatabases());
-        assertEquals(7, databases.size());
+        assertEquals(8, databases.size());
 
         boolean foundOracle = false;
         boolean foundPostgres = false;
