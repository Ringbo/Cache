diff --git a/src/main/java/com/ning/http/client/providers/jdk/JDKAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/jdk/JDKAsyncHttpProvider.java
index 7901e62..a8489e9 100644
--- a/src/main/java/com/ning/http/client/providers/jdk/JDKAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/jdk/JDKAsyncHttpProvider.java
@@ -474,7 +474,7 @@
                 host = request.getVirtualHost();
             }
 
-            if (uri.getPort() == -1) {
+            if (uri.getPort() == -1 && request.getVirtualHost() != null) {
                 urlConnection.setRequestProperty("Host", host);
             } else {
                 urlConnection.setRequestProperty("Host", host + ":" + uri.getPort());
