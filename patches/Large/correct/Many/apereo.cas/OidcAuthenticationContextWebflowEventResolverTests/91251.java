diff --git a/support/cas-server-support-oidc/src/test/java/org/apereo/cas/oidc/web/flow/OidcAuthenticationContextWebflowEventResolverTests.java b/support/cas-server-support-oidc/src/test/java/org/apereo/cas/oidc/web/flow/OidcAuthenticationContextWebflowEventResolverTests.java
index 38ab6bd..5ca0aee 100644
--- a/support/cas-server-support-oidc/src/test/java/org/apereo/cas/oidc/web/flow/OidcAuthenticationContextWebflowEventResolverTests.java
+++ b/support/cas-server-support-oidc/src/test/java/org/apereo/cas/oidc/web/flow/OidcAuthenticationContextWebflowEventResolverTests.java
@@ -50,7 +50,7 @@
     @BeforeEach
     @Override
     public void initialize() {
-        super.setup();
+        super.initialize();
 
         this.context = new MockRequestContext();
 
