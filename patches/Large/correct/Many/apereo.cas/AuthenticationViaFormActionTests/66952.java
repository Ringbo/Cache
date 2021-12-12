diff --git a/cas-server-webapp-support/src/test/java/org/jasig/cas/web/flow/AuthenticationViaFormActionTests.java b/cas-server-webapp-support/src/test/java/org/jasig/cas/web/flow/AuthenticationViaFormActionTests.java
index 1f7f9ea..77b0978a 100644
--- a/cas-server-webapp-support/src/test/java/org/jasig/cas/web/flow/AuthenticationViaFormActionTests.java
+++ b/cas-server-webapp-support/src/test/java/org/jasig/cas/web/flow/AuthenticationViaFormActionTests.java
@@ -172,7 +172,7 @@
 
         context.setExternalContext(new ServletExternalContext(
             new MockServletContext(), request, new MockHttpServletResponse()));
-        context.getFlowScope().put("service", TestUtils.getService("test"));
+        context.getFlowScope().put("service", TestUtils.getService());
 
         final MessageContext messageContext = mock(MessageContext.class);
         assertEquals("warn", this.action.submit(context, c, messageContext).getId());
