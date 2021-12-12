diff --git a/liquibase-core/src/main/java/liquibase/precondition/PreconditionFactory.java b/liquibase-core/src/main/java/liquibase/precondition/PreconditionFactory.java
index 01b139c..3162610 100644
--- a/liquibase-core/src/main/java/liquibase/precondition/PreconditionFactory.java
+++ b/liquibase-core/src/main/java/liquibase/precondition/PreconditionFactory.java
@@ -27,14 +27,14 @@
         }
     }
 
-    public static PreconditionFactory getInstance() {
+    public static synchronized PreconditionFactory getInstance() {
         if (instance == null) {
              instance = new PreconditionFactory();
         }
         return instance;
     }
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new PreconditionFactory();
     }
 
