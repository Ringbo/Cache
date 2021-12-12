diff --git a/liquibase-core/src/main/java/liquibase/diff/output/changelog/ChangeGeneratorFactory.java b/liquibase-core/src/main/java/liquibase/diff/output/changelog/ChangeGeneratorFactory.java
index 9f69a60..e1534da 100644
--- a/liquibase-core/src/main/java/liquibase/diff/output/changelog/ChangeGeneratorFactory.java
+++ b/liquibase-core/src/main/java/liquibase/diff/output/changelog/ChangeGeneratorFactory.java
@@ -36,14 +36,14 @@
     /**
      * Return singleton ChangeGeneratorFactory
      */
-    public static ChangeGeneratorFactory getInstance() {
+    public static synchronized ChangeGeneratorFactory getInstance() {
         if (instance == null) {
             instance = new ChangeGeneratorFactory();
         }
         return instance;
     }
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new ChangeGeneratorFactory();
     }
 
