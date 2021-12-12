diff --git a/server/src/com/thoughtworks/go/server/service/plugins/processor/authentication/AuthenticationRequestProcessor.java b/server/src/com/thoughtworks/go/server/service/plugins/processor/authentication/AuthenticationRequestProcessor.java
index 5b03942..cee5870 100644
--- a/server/src/com/thoughtworks/go/server/service/plugins/processor/authentication/AuthenticationRequestProcessor.java
+++ b/server/src/com/thoughtworks/go/server/service/plugins/processor/authentication/AuthenticationRequestProcessor.java
@@ -83,7 +83,7 @@
         } catch (Exception e) {
             LOGGER.error("Error occurred while authenticating user", e);
         }
-        return new DefaultGoApiResponse(400);
+        return new DefaultGoApiResponse(500);
     }
 
     GoUserPrinciple getGoUserPrincipal(User user) {
