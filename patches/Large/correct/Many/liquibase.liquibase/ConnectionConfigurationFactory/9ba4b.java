diff --git a/liquibase-core/src/main/java/liquibase/sdk/supplier/database/ConnectionConfigurationFactory.java b/liquibase-core/src/main/java/liquibase/sdk/supplier/database/ConnectionConfigurationFactory.java
index b9a888f..7ca4c8a 100644
--- a/liquibase-core/src/main/java/liquibase/sdk/supplier/database/ConnectionConfigurationFactory.java
+++ b/liquibase-core/src/main/java/liquibase/sdk/supplier/database/ConnectionConfigurationFactory.java
@@ -26,7 +26,7 @@
 
     }
 
-    public static ConnectionConfigurationFactory getInstance() {
+    public static synchronized ConnectionConfigurationFactory getInstance() {
         if (instance == null) {
             instance = new ConnectionConfigurationFactory();
         }
@@ -41,7 +41,7 @@
         return configurations;
     }
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new ConnectionConfigurationFactory();
     }
 
