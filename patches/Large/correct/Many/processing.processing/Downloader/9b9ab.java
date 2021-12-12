diff --git a/build/jre/src/Downloader.java b/build/jre/src/Downloader.java
index 55e6bc3..b25fb58 100644
--- a/build/jre/src/Downloader.java
+++ b/build/jre/src/Downloader.java
@@ -120,7 +120,7 @@
 
     //printHeaders(conn);
     //conn.connect();
-    while (conn.getResponseCode() == 302) {
+    while (conn.getResponseCode() == 302 || conn.getResponseCode() == 301) {
       Map<String, List<String>> headers = conn.getHeaderFields();
       List<String> location = headers.get("Location");
       if (location.size() == 1) {
