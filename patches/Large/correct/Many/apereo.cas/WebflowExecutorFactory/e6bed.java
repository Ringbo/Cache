diff --git a/core/cas-server-core-webflow-api/src/main/java/org/apereo/cas/web/flow/executor/WebflowExecutorFactory.java b/core/cas-server-core-webflow-api/src/main/java/org/apereo/cas/web/flow/executor/WebflowExecutorFactory.java
index 415f24c..f81e2ae 100644
--- a/core/cas-server-core-webflow-api/src/main/java/org/apereo/cas/web/flow/executor/WebflowExecutorFactory.java
+++ b/core/cas-server-core-webflow-api/src/main/java/org/apereo/cas/web/flow/executor/WebflowExecutorFactory.java
@@ -46,7 +46,7 @@
     private FlowExecutor buildFlowExecutorViaServerSessionBindingExecution() {
         final SessionBindingConversationManager conversationManager = new SessionBindingConversationManager();
         final WebflowSessionManagementProperties session = webflowProperties.getSession();
-        conversationManager.setLockTimeoutSeconds((int) Beans.newDuration(session.getLockTimeout()).toMillis());
+        conversationManager.setLockTimeoutSeconds((int) Beans.newDuration(session.getLockTimeout()).getSeconds());
         conversationManager.setMaxConversations(session.getMaxConversations());
 
         final FlowExecutionImplFactory executionFactory = new FlowExecutionImplFactory();
