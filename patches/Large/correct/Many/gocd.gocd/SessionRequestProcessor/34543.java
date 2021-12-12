diff --git a/server/src/com/thoughtworks/go/server/service/plugins/processor/session/SessionRequestProcessor.java b/server/src/com/thoughtworks/go/server/service/plugins/processor/session/SessionRequestProcessor.java
index a9f97f7..00473aa 100644
--- a/server/src/com/thoughtworks/go/server/service/plugins/processor/session/SessionRequestProcessor.java
+++ b/server/src/com/thoughtworks/go/server/service/plugins/processor/session/SessionRequestProcessor.java
@@ -74,7 +74,7 @@
         } catch (Exception e) {
             LOGGER.error("Error occurred while authenticating user", e);
         }
-        return new DefaultGoApiResponse(400);
+        return new DefaultGoApiResponse(500);
     }
 
     private GoApiResponse handleSessionPutRequest(GoApiRequest goPluginApiRequest) {
