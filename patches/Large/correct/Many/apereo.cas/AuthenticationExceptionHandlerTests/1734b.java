diff --git a/cas-server-core-authentication/src/test/java/org/apereo/cas/web/flow/AuthenticationExceptionHandlerTests.java b/cas-server-core-authentication/src/test/java/org/apereo/cas/web/flow/AuthenticationExceptionHandlerTests.java
index aba6875..12a9c39 100644
--- a/cas-server-core-authentication/src/test/java/org/apereo/cas/web/flow/AuthenticationExceptionHandlerTests.java
+++ b/cas-server-core-authentication/src/test/java/org/apereo/cas/web/flow/AuthenticationExceptionHandlerTests.java
@@ -32,7 +32,7 @@
 public class AuthenticationExceptionHandlerTests {
  
     @Test
-    public void handleAccountNotFoundExceptionByDefefault() {
+    public void handleAccountNotFoundExceptionByDefault() {
         final AuthenticationExceptionHandler handler = new AuthenticationExceptionHandler();
         final MessageContext ctx = mock(MessageContext.class);
         
@@ -97,7 +97,7 @@
         handler.setErrors(twoCustomErrors);
         assertTrue(handler.containsCustomErrors());
         assertTrue(handler.getErrors().containsAll(twoCustomErrors));
-        assertEquals(12, handler.getErrors().size());
+        assertEquals(13, handler.getErrors().size());
     }
 
     private static class TestContextualAuthenticationPolicy implements ContextualAuthenticationPolicy<Object> {
