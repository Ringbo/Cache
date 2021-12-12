diff --git a/liquibase-core/src/main/java/liquibase/database/DatabaseFactory.java b/liquibase-core/src/main/java/liquibase/database/DatabaseFactory.java
index 37d5757..d7e9de4 100644
--- a/liquibase-core/src/main/java/liquibase/database/DatabaseFactory.java
+++ b/liquibase-core/src/main/java/liquibase/database/DatabaseFactory.java
@@ -43,21 +43,21 @@
 
     }
 
-    public static DatabaseFactory getInstance() {
+    public static synchronized DatabaseFactory getInstance() {
         if (instance == null) {
             instance = new DatabaseFactory();
         }
         return instance;
     }
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new DatabaseFactory();
     }
 
     /**
      * Set singleton instance. Primarily used in testing
      */
-    public static void setInstance(DatabaseFactory databaseFactory) {
+    public static synchronized void setInstance(DatabaseFactory databaseFactory) {
         instance = databaseFactory;
     }
 
