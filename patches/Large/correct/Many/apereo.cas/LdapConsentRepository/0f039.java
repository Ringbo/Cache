diff --git a/support/cas-server-support-consent-ldap/src/main/java/org/apereo/cas/consent/LdapConsentRepository.java b/support/cas-server-support-consent-ldap/src/main/java/org/apereo/cas/consent/LdapConsentRepository.java
index 8cba475..a73e2f9 100644
--- a/support/cas-server-support-consent-ldap/src/main/java/org/apereo/cas/consent/LdapConsentRepository.java
+++ b/support/cas-server-support-consent-ldap/src/main/java/org/apereo/cas/consent/LdapConsentRepository.java
@@ -84,7 +84,7 @@
                         .collect(Collectors.toSet());
             }
         }
-        return new HashSet<>();
+        return new HashSet<>(0);
     }
 
     @Override
@@ -104,7 +104,7 @@
             return CollectionUtils.wrap(decisions);
         }
         LOGGER.debug("No consent decision could be found");
-        return new HashSet<>();
+        return new HashSet<>(0);
     }
 
     @Override
@@ -231,7 +231,7 @@
         } catch (final LdapException e) {
             LOGGER.debug(e.getMessage(), e);
         }
-        return new HashSet<>();
+        return new HashSet<>(0);
     }
 
     private static ConsentDecision mapFromJson(final String json) {
