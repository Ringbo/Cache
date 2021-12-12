diff --git a/liquibase-core/src/main/java/liquibase/sdk/Context.java b/liquibase-core/src/main/java/liquibase/sdk/Context.java
index ba20fc4..b651876 100644
--- a/liquibase-core/src/main/java/liquibase/sdk/Context.java
+++ b/liquibase-core/src/main/java/liquibase/sdk/Context.java
@@ -28,11 +28,11 @@
     private Context() {
     }
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = null;
     }
 
-    public static Context getInstance() {
+    public static synchronized Context getInstance() {
         if (instance == null) {
             instance = new Context();
             try {
