diff --git a/src/main/java/com/amazonaws/http/HttpClientFactory.java b/src/main/java/com/amazonaws/http/HttpClientFactory.java
index 3eea5e2..b524b12 100644
--- a/src/main/java/com/amazonaws/http/HttpClientFactory.java
+++ b/src/main/java/com/amazonaws/http/HttpClientFactory.java
@@ -209,7 +209,7 @@
 
         public Socket createLayeredSocket(Socket arg0, String arg1, int arg2, HttpParams arg3)
                 throws IOException, UnknownHostException {
-            return getSSLContext().getSocketFactory().createSocket();
+            return getSSLContext().getSocketFactory().createSocket(arg0, arg1, arg2, true);
         }
     }
 
