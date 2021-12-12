diff --git a/cas-server-webapp-support/src/test/java/org/jasig/cas/web/AbstractServiceValidateControllerTests.java b/cas-server-webapp-support/src/test/java/org/jasig/cas/web/AbstractServiceValidateControllerTests.java
index fb13b60..5fe776b 100644
--- a/cas-server-webapp-support/src/test/java/org/jasig/cas/web/AbstractServiceValidateControllerTests.java
+++ b/cas-server-webapp-support/src/test/java/org/jasig/cas/web/AbstractServiceValidateControllerTests.java
@@ -290,13 +290,13 @@
     }
 
     protected final ModelAndView getModelAndViewUponServiceValidationWithSecurePgtUrl() throws Exception {
-        final String tId = getCentralAuthenticationService()
+        final TicketGrantingTicket tId = getCentralAuthenticationService()
                 .createTicketGrantingTicket(TestUtils.getCredentialsWithSameUsernameAndPassword());
-        final String sId = getCentralAuthenticationService().grantServiceTicket(tId, TestUtils.getService());
+        final ServiceTicket sId = getCentralAuthenticationService().grantServiceTicket(tId.getId(), TestUtils.getService());
 
         final MockHttpServletRequest request = new MockHttpServletRequest();
         request.addParameter("service", TestUtils.getService().getId());
-        request.addParameter("ticket", sId);
+        request.addParameter("ticket", sId.getId());
         request.addParameter("pgtUrl", "https://www.github.com");
 
 
