diff --git a/src/net/java/sip/communicator/service/httputil/HttpUtils.java b/src/net/java/sip/communicator/service/httputil/HttpUtils.java
index 7774974..f72b4b2 100644
--- a/src/net/java/sip/communicator/service/httputil/HttpUtils.java
+++ b/src/net/java/sip/communicator/service/httputil/HttpUtils.java
@@ -317,7 +317,7 @@
             if(resEntity == null)
                 return null;
 
-            return new HTTPResponseResult(reqEntity, httpClient);
+            return new HTTPResponseResult(resEntity, httpClient);
         }
         catch(Throwable e)
         {
