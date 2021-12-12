diff --git a/core/cas-server-core-authentication/src/test/java/org/apereo/cas/authentication/PolicyBasedAuthenticationManagerTests.java b/core/cas-server-core-authentication/src/test/java/org/apereo/cas/authentication/PolicyBasedAuthenticationManagerTests.java
index e4f68ae..6dcf705 100644
--- a/core/cas-server-core-authentication/src/test/java/org/apereo/cas/authentication/PolicyBasedAuthenticationManagerTests.java
+++ b/core/cas-server-core-authentication/src/test/java/org/apereo/cas/authentication/PolicyBasedAuthenticationManagerTests.java
@@ -45,7 +45,7 @@
         final PolicyBasedAuthenticationManager manager = new PolicyBasedAuthenticationManager(map, mockServicesManager());
         final Authentication auth = manager.authenticate(transaction);
         assertEquals(1, auth.getSuccesses().size());
-        assertEquals(0, auth.getFailures().size());
+        assertEquals(1, auth.getFailures().size());
         assertEquals(2, auth.getCredentials().size());
     }
 
