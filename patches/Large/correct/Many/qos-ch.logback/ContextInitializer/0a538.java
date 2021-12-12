diff --git a/logback-classic/src/main/java/ch/qos/logback/classic/util/ContextInitializer.java b/logback-classic/src/main/java/ch/qos/logback/classic/util/ContextInitializer.java
index ba878f2..f0f71c1 100644
--- a/logback-classic/src/main/java/ch/qos/logback/classic/util/ContextInitializer.java
+++ b/logback-classic/src/main/java/ch/qos/logback/classic/util/ContextInitializer.java
@@ -25,9 +25,9 @@
   }
 
   public static void autoConfig(LoggerContext loggerContext, ClassLoader classLoader) {
-    URL url = Loader.getResource(AUTOCONFIG_FILE, classLoader);
+    URL url = Loader.getResource(TEST_AUTOCONFIG_FILE, classLoader);
     if (url == null) {
-      url = Loader.getResource(TEST_AUTOCONFIG_FILE, classLoader);
+      url = Loader.getResource(AUTOCONFIG_FILE, classLoader);
     }
 
     if (url != null) {
