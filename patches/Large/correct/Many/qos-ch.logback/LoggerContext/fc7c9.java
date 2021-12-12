diff --git a/logback-classic/src/main/java/ch/qos/logback/classic/LoggerContext.java b/logback-classic/src/main/java/ch/qos/logback/classic/LoggerContext.java
index 5db91a1..f0714bb 100755
--- a/logback-classic/src/main/java/ch/qos/logback/classic/LoggerContext.java
+++ b/logback-classic/src/main/java/ch/qos/logback/classic/LoggerContext.java
@@ -113,7 +113,7 @@
     }
 
     @Override
-    public final Logger getLogger(final String name) {
+    public Logger getLogger(final String name) {
 
         if (name == null) {
             throw new IllegalArgumentException("name argument cannot be null");
