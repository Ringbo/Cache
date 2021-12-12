diff --git a/support/cas-server-support-actions/src/main/java/org/apereo/cas/web/flow/InitialFlowSetupAction.java b/support/cas-server-support-actions/src/main/java/org/apereo/cas/web/flow/InitialFlowSetupAction.java
index a45f62d..26616c7 100644
--- a/support/cas-server-support-actions/src/main/java/org/apereo/cas/web/flow/InitialFlowSetupAction.java
+++ b/support/cas-server-support-actions/src/main/java/org/apereo/cas/web/flow/InitialFlowSetupAction.java
@@ -52,7 +52,7 @@
         configureCookieGenerators(context);
         configureWebflowContext(context);
         configureWebflowContextForService(context);
-        return result("success");
+        return success();
     }
 
     private void configureWebflowContextForService(final RequestContext context) {
