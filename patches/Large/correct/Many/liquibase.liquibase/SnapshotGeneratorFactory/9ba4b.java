diff --git a/liquibase-core/src/main/java/liquibase/snapshot/SnapshotGeneratorFactory.java b/liquibase-core/src/main/java/liquibase/snapshot/SnapshotGeneratorFactory.java
index 705bc0d..d8b1d62 100644
--- a/liquibase-core/src/main/java/liquibase/snapshot/SnapshotGeneratorFactory.java
+++ b/liquibase-core/src/main/java/liquibase/snapshot/SnapshotGeneratorFactory.java
@@ -45,14 +45,14 @@
     /**
      * Return singleton SnapshotGeneratorFactory
      */
-    public static SnapshotGeneratorFactory getInstance() {
+    public static synchronized SnapshotGeneratorFactory getInstance() {
         if (instance == null) {
             instance = new SnapshotGeneratorFactory();
         }
         return instance;
     }
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new SnapshotGeneratorFactory();
     }
 
@@ -193,7 +193,7 @@
         }
     }
 
-    public static void resetAll() {
+    public static synchronized void resetAll() {
         instance = null;
     }
 
