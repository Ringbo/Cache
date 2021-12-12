diff --git a/src/test/java/spark/servlet/MyApp.java b/src/test/java/spark/servlet/MyApp.java
index 753933a..d5bb2d5 100644
--- a/src/test/java/spark/servlet/MyApp.java
+++ b/src/test/java/spark/servlet/MyApp.java
@@ -18,7 +18,7 @@
     static File tmpExternalFile;
 
     @Override
-    public void init() {
+    public synchronized void init() {
         try {
             externalStaticFileLocation(System.getProperty("java.io.tmpdir"));
             staticFileLocation("/public");
