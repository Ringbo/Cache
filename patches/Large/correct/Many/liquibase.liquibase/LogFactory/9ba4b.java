diff --git a/liquibase-core/src/main/java/liquibase/logging/LogFactory.java b/liquibase-core/src/main/java/liquibase/logging/LogFactory.java
index 0a2f069..22e6bdb 100644
--- a/liquibase-core/src/main/java/liquibase/logging/LogFactory.java
+++ b/liquibase-core/src/main/java/liquibase/logging/LogFactory.java
@@ -14,11 +14,11 @@
 
     private static LogFactory instance;
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new LogFactory();
     }
 
-    public static LogFactory getInstance() {
+    public static synchronized LogFactory getInstance() {
         if (instance == null) {
             instance = new LogFactory();
         }
