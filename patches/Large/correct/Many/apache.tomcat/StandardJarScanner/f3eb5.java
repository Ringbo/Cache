diff --git a/java/org/apache/tomcat/util/scan/StandardJarScanner.java b/java/org/apache/tomcat/util/scan/StandardJarScanner.java
index cc1f2f8..f370d14 100644
--- a/java/org/apache/tomcat/util/scan/StandardJarScanner.java
+++ b/java/org/apache/tomcat/util/scan/StandardJarScanner.java
@@ -417,7 +417,7 @@
 
         public ClassPathEntry(URL url) {
             String path = url.getPath();
-            int end = path.indexOf(Constants.JAR_EXT);
+            int end = path.lastIndexOf(Constants.JAR_EXT);
             if (end != -1) {
                 jar = true;
                 int start = path.lastIndexOf('/', end);
