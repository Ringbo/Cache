diff --git a/liquibase-core/src/main/java/liquibase/change/ChangeFactory.java b/liquibase-core/src/main/java/liquibase/change/ChangeFactory.java
index c85a682..908ed51 100644
--- a/liquibase-core/src/main/java/liquibase/change/ChangeFactory.java
+++ b/liquibase-core/src/main/java/liquibase/change/ChangeFactory.java
@@ -56,7 +56,7 @@
     /**
      * Reset the ChangeFactory so it reloads the registry on the next call to @{link #getInstance()}. Mainly used in testing
      */
-    public static void reset() {
+    public static synchronized void reset() {
         instance = null;
     }
 
