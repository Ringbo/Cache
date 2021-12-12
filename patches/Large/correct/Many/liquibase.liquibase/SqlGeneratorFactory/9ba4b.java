diff --git a/liquibase-core/src/main/java/liquibase/sqlgenerator/SqlGeneratorFactory.java b/liquibase-core/src/main/java/liquibase/sqlgenerator/SqlGeneratorFactory.java
index caef279..39d5aa3 100644
--- a/liquibase-core/src/main/java/liquibase/sqlgenerator/SqlGeneratorFactory.java
+++ b/liquibase-core/src/main/java/liquibase/sqlgenerator/SqlGeneratorFactory.java
@@ -49,14 +49,14 @@
     /**
      * Return singleton SqlGeneratorFactory
      */
-    public static SqlGeneratorFactory getInstance() {
+    public static synchronized SqlGeneratorFactory getInstance() {
         if (instance == null) {
             instance = new SqlGeneratorFactory();
         }
         return instance;
     }
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new SqlGeneratorFactory();
     }
 
