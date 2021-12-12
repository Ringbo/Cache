diff --git a/src/security/ldap/src/test/java/org/geoserver/security/ldap/LDAPAuthenticationProviderTest.java b/src/security/ldap/src/test/java/org/geoserver/security/ldap/LDAPAuthenticationProviderTest.java
index d9b0196..e7df046 100644
--- a/src/security/ldap/src/test/java/org/geoserver/security/ldap/LDAPAuthenticationProviderTest.java
+++ b/src/security/ldap/src/test/java/org/geoserver/security/ldap/LDAPAuthenticationProviderTest.java
@@ -57,7 +57,7 @@
         Authentication result = authProvider.authenticate(authentication);
         assertNotNull(result);
         assertEquals("admin", result.getName());
-        assertEquals(2, result.getAuthorities().size());
+        assertEquals(3, result.getAuthorities().size());
     }
 
     /**
@@ -103,7 +103,7 @@
         createAuthenticationProvider();
 
         Authentication result = authProvider.authenticate(authentication);
-        assertEquals(2, result.getAuthorities().size());
+        assertEquals(3, result.getAuthorities().size());
     }
     
     /**
@@ -124,7 +124,7 @@
         createAuthenticationProvider();
     
         Authentication result = authProvider.authenticate(authentication);
-        assertEquals(2, result.getAuthorities().size());
+        assertEquals(3, result.getAuthorities().size());
     
         // filter to extract user data
         ((LDAPSecurityServiceConfig)config).setUserFilter("(cn={0})");
@@ -134,7 +134,7 @@
         createAuthenticationProvider();
     
         result = authProvider.authenticate(authentication);
-        assertEquals(2, result.getAuthorities().size());
+        assertEquals(3, result.getAuthorities().size());
     }
 
     /**
