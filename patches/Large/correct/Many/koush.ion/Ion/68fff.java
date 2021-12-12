diff --git a/ion/src/com/koushikdutta/ion/Ion.java b/ion/src/com/koushikdutta/ion/Ion.java
index de7ac1e..e0c15fd 100644
--- a/ion/src/com/koushikdutta/ion/Ion.java
+++ b/ion/src/com/koushikdutta/ion/Ion.java
@@ -540,7 +540,7 @@
          * Disable routing of https requests through a previous provided proxy
          */
         public void disableSecureProxy() {
-            httpClient.getSocketMiddleware().disableProxy();
+            httpClient.getSSLSocketMiddleware().disableProxy();
         }
 
         /**
