diff --git a/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/flow/OAuthAction.java b/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/flow/OAuthAction.java
index d0c139f..a24a311 100644
--- a/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/flow/OAuthAction.java
+++ b/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/flow/OAuthAction.java
@@ -117,7 +117,7 @@
                     authorizationUrl = provider.getAuthorizationUrl(new HttpUserSession(session));
                 }
                 logger.debug("{} -> {}", key, authorizationUrl);
-                context.getFlowScope().put(key, authorizatonUrl);
+                context.getFlowScope().put(key, authorizationUrl);
             }
         }
         
