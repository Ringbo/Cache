diff --git a/cas-server-core-authentication/src/test/java/org/jasig/cas/authentication/DefaultAuthenticationContextBuilderTests.java b/cas-server-core-authentication/src/test/java/org/jasig/cas/authentication/DefaultAuthenticationContextBuilderTests.java
index a19d582..53b9229 100644
--- a/cas-server-core-authentication/src/test/java/org/jasig/cas/authentication/DefaultAuthenticationContextBuilderTests.java
+++ b/cas-server-core-authentication/src/test/java/org/jasig/cas/authentication/DefaultAuthenticationContextBuilderTests.java
@@ -44,14 +44,14 @@
     }
 
     @Test
-    public void checkBuilderWithManyAuthN() throws Exception {
+    public void checkBuilderWithManyAuthNAsDuplicate() throws Exception {
         final Authentication authN1 = manager.authenticate(TestUtils.getCredentialsWithSameUsernameAndPassword());
         builder.collect(authN1);
 
         final Authentication authN2 = manager.authenticate(TestUtils.getCredentialsWithSameUsernameAndPassword());
         builder.collect(authN2);
 
-        assertEquals(builder.size(), 2);
+        assertEquals(builder.size(), 1);
 
         final AuthenticationContext ctx = builder.build();
         assertNotNull(ctx);
