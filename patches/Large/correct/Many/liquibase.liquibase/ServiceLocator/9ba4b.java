diff --git a/liquibase-core/src/main/java/liquibase/servicelocator/ServiceLocator.java b/liquibase-core/src/main/java/liquibase/servicelocator/ServiceLocator.java
old mode 100755
new mode 100644
index 02986b8..0f2ab6e
--- a/liquibase-core/src/main/java/liquibase/servicelocator/ServiceLocator.java
+++ b/liquibase-core/src/main/java/liquibase/servicelocator/ServiceLocator.java
@@ -80,7 +80,7 @@
         return instance;
     }
 
-    public static void setInstance(ServiceLocator newInstance) {
+    public static synchronized void setInstance(ServiceLocator newInstance) {
         instance = newInstance;
     }
 
@@ -247,7 +247,7 @@
         return classes;
     }
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new ServiceLocator();
     }
 
