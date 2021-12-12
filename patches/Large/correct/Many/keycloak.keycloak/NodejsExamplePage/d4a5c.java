diff --git a/testsuite/integration-arquillian/tests/other/nodejs_adapter/src/main/java/org/keycloak/testsuite/adapter/nodejs/page/NodejsExamplePage.java b/testsuite/integration-arquillian/tests/other/nodejs_adapter/src/main/java/org/keycloak/testsuite/adapter/nodejs/page/NodejsExamplePage.java
index 0feb8ec..3f25aa9 100644
--- a/testsuite/integration-arquillian/tests/other/nodejs_adapter/src/main/java/org/keycloak/testsuite/adapter/nodejs/page/NodejsExamplePage.java
+++ b/testsuite/integration-arquillian/tests/other/nodejs_adapter/src/main/java/org/keycloak/testsuite/adapter/nodejs/page/NodejsExamplePage.java
@@ -50,11 +50,11 @@
 
     public boolean isOnLoginSecuredPage() {
         UriBuilder uriBuilder = createUriBuilder().path("login");
-        return URLUtils.currentUrlEqual(uriBuilder.build().toASCIIString());
+        return URLUtils.currentUrlEquals(uriBuilder.build().toASCIIString());
     }
 
     @Override
     public boolean isCurrent() {
-        return URLUtils.currentUrlStartWith(toString());
+        return URLUtils.currentUrlStartsWith(toString());
     }
 }
