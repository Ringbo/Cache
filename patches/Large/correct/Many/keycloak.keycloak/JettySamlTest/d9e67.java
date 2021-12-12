diff --git a/testsuite/jetty/jetty81/src/test/java/org/keycloak/testsuite/JettySamlTest.java b/testsuite/jetty/jetty81/src/test/java/org/keycloak/testsuite/JettySamlTest.java
index 644435a..916d855 100755
--- a/testsuite/jetty/jetty81/src/test/java/org/keycloak/testsuite/JettySamlTest.java
+++ b/testsuite/jetty/jetty81/src/test/java/org/keycloak/testsuite/JettySamlTest.java
@@ -82,7 +82,7 @@
         list.add(new WebAppContext(new File(base, "bad-client-signed-post").toString(), "/bad-client-sales-post-sig"));
         list.add(new WebAppContext(new File(base, "bad-realm-signed-post").toString(), "/bad-realm-sales-post-sig"));
         list.add(new WebAppContext(new File(base, "encrypted-post").toString(), "/sales-post-enc"));
-        SamlAdapterTestStrategy.uploadSP("http://localhost:8081/auth", keycloakRule);
+        SamlAdapterTestStrategy.uploadSP("http://localhost:8081/auth");
 
 
 
