diff --git a/src/com/loopj/android/http/AsyncHttpClient.java b/src/com/loopj/android/http/AsyncHttpClient.java
index ae65e94..2060e90 100644
--- a/src/com/loopj/android/http/AsyncHttpClient.java
+++ b/src/com/loopj/android/http/AsyncHttpClient.java
@@ -117,7 +117,7 @@
         ConnManagerParams.setMaxTotalConnections(httpParams, DEFAULT_MAX_CONNECTIONS);
 
         HttpConnectionParams.setSoTimeout(httpParams, socketTimeout);
-        HttpConnectionParams.setConnectionTimeout(httpParams, socketTimout);
+        HttpConnectionParams.setConnectionTimeout(httpParams, socketTimeout);
         HttpConnectionParams.setTcpNoDelay(httpParams, true);
         HttpConnectionParams.setSocketBufferSize(httpParams, DEFAULT_SOCKET_BUFFER_SIZE);
 
