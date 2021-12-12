diff --git a/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java b/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java
index 7f5449c..a2396e8 100644
--- a/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java
+++ b/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java
@@ -279,7 +279,7 @@
     private String findIndexFileInDirectory(File directory) {
         for (String fileName : SimpleWebServer.INDEX_FILE_NAMES) {
             File indexFile = new File(directory, fileName);
-            if (indexFile.exists()) {
+            if (indexFile.isFile()) {
                 return fileName;
             }
         }
