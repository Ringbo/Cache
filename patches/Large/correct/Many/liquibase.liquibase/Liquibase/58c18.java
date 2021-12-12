diff --git a/liquibase-core/src/main/java/liquibase/Liquibase.java b/liquibase-core/src/main/java/liquibase/Liquibase.java
index 7c82d2d..571351e 100644
--- a/liquibase-core/src/main/java/liquibase/Liquibase.java
+++ b/liquibase-core/src/main/java/liquibase/Liquibase.java
@@ -1018,7 +1018,7 @@
 
     public void generateChangeLog(CatalogAndSchema catalogAndSchema, DiffToChangeLog changeLogWriter, PrintStream outputStream, Class<? extends DatabaseObject>... snapshotTypes) throws DatabaseException, IOException, ParserConfigurationException {
         Set<Class<? extends DatabaseObject>> finalCompareTypes = null;
-        if (snapshotTypes != null || snapshotTypes.length > 0) {
+        if (snapshotTypes != null && snapshotTypes.length > 0) {
             finalCompareTypes = new HashSet<Class<? extends DatabaseObject>>(Arrays.asList(snapshotTypes));
         }
 
