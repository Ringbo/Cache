diff --git a/testsuite/tomcat7/src/test/java/org/keycloak/testsuite/TomcatSamlTest.java b/testsuite/tomcat7/src/test/java/org/keycloak/testsuite/TomcatSamlTest.java
index 29a2e05..f9cb853 100755
--- a/testsuite/tomcat7/src/test/java/org/keycloak/testsuite/TomcatSamlTest.java
+++ b/testsuite/tomcat7/src/test/java/org/keycloak/testsuite/TomcatSamlTest.java
@@ -78,7 +78,7 @@
         tomcat.addWebapp("/bad-client-sales-post-sig", new File(base, "bad-client-signed-post").toString());
         tomcat.addWebapp("/bad-realm-sales-post-sig", new File(base, "bad-realm-signed-post").toString());
         tomcat.addWebapp("/sales-post-enc", new File(base, "encrypted-post").toString());
-        SamlAdapterTestStrategy.uploadSP("http://localhost:8081/auth", keycloakRule);
+        SamlAdapterTestStrategy.uploadSP("http://localhost:8081/auth");
 
 
         tomcat.start();
