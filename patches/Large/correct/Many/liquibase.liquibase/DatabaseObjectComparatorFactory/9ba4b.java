diff --git a/liquibase-core/src/main/java/liquibase/diff/compare/DatabaseObjectComparatorFactory.java b/liquibase-core/src/main/java/liquibase/diff/compare/DatabaseObjectComparatorFactory.java
index ad79c41..cd17650 100644
--- a/liquibase-core/src/main/java/liquibase/diff/compare/DatabaseObjectComparatorFactory.java
+++ b/liquibase-core/src/main/java/liquibase/diff/compare/DatabaseObjectComparatorFactory.java
@@ -39,14 +39,14 @@
     /**
      * Return singleton DatabaseObjectComparatorFactory
      */
-    public static DatabaseObjectComparatorFactory getInstance() {
+    public static synchronized DatabaseObjectComparatorFactory getInstance() {
         if (instance == null) {
             instance = new DatabaseObjectComparatorFactory();
         }
         return instance;
     }
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new DatabaseObjectComparatorFactory();
     }
 
@@ -92,7 +92,7 @@
     }
 
 
-    public static void resetAll() {
+    public static synchronized void resetAll() {
         instance = null;
     }
 
