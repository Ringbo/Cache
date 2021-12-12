diff --git a/liquibase-core/src/main/java/liquibase/diff/DiffGeneratorFactory.java b/liquibase-core/src/main/java/liquibase/diff/DiffGeneratorFactory.java
index 75113c5..58d27e2 100644
--- a/liquibase-core/src/main/java/liquibase/diff/DiffGeneratorFactory.java
+++ b/liquibase-core/src/main/java/liquibase/diff/DiffGeneratorFactory.java
@@ -29,7 +29,7 @@
         }
     }
 
-    public static DiffGeneratorFactory getInstance() {
+    public static synchronized DiffGeneratorFactory getInstance() {
         if (instance == null) {
             instance = new DiffGeneratorFactory();
         }
