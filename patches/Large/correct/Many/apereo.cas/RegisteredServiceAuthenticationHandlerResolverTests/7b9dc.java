diff --git a/core/cas-server-core-services/src/test/java/org/apereo/cas/services/RegisteredServiceAuthenticationHandlerResolverTests.java b/core/cas-server-core-services/src/test/java/org/apereo/cas/services/RegisteredServiceAuthenticationHandlerResolverTests.java
index a8ae54b..38f8985 100644
--- a/core/cas-server-core-services/src/test/java/org/apereo/cas/services/RegisteredServiceAuthenticationHandlerResolverTests.java
+++ b/core/cas-server-core-services/src/test/java/org/apereo/cas/services/RegisteredServiceAuthenticationHandlerResolverTests.java
@@ -64,7 +64,7 @@
                 RegisteredServiceTestUtils.getCredentialsWithSameUsernameAndPassword("casuser"));
 
         final Set<AuthenticationHandler> handlers = resolver.resolve(this.handlers, transaction);
-        assertEquals(handlers.size(), 2);
+        assertEquals(2, handlers.size());
     }
 
     @Test
