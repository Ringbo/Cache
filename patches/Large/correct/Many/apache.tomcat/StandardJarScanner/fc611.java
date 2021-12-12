diff --git a/java/org/apache/tomcat/util/scan/StandardJarScanner.java b/java/org/apache/tomcat/util/scan/StandardJarScanner.java
index c48a967..b830d2c 100644
--- a/java/org/apache/tomcat/util/scan/StandardJarScanner.java
+++ b/java/org/apache/tomcat/util/scan/StandardJarScanner.java
@@ -290,7 +290,8 @@
             callback.scan((JarURLConnection) conn, isWebapp);
         } else {
             String urlStr = url.toString();
-            if (urlStr.startsWith("file:") || urlStr.startsWith("jndi:")) {
+            if (urlStr.startsWith("file:") || urlStr.startsWith("jndi:") ||
+                urlStr.startsWith("http:") || urlStr.startsWith("https:")) {
                 if (urlStr.endsWith(Constants.JAR_EXT)) {
                     URL jarURL = new URL("jar:" + urlStr + "!/");
                     callback.scan((JarURLConnection) jarURL.openConnection(),
