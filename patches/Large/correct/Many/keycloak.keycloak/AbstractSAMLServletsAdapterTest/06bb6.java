diff --git a/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/servlet/AbstractSAMLServletsAdapterTest.java b/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/servlet/AbstractSAMLServletsAdapterTest.java
index a2b2634..232deac 100644
--- a/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/servlet/AbstractSAMLServletsAdapterTest.java
+++ b/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/servlet/AbstractSAMLServletsAdapterTest.java
@@ -335,7 +335,7 @@
 
     @Deployment(name = SalesPostAutodetectServlet.DEPLOYMENT_NAME)
     protected static WebArchive salesPostAutodetect() {
-        return samlServletDeployment(SalesPostAutodetectServlet.DEPLOYMENT_NAME, SendUsernameServlet.class);
+        return samlServletDeployment(SalesPostAutodetectServlet.DEPLOYMENT_NAME, "sales-post-autodetect/WEB-INF/web.xml", SendUsernameServlet.class);
     }
 
     @Override
