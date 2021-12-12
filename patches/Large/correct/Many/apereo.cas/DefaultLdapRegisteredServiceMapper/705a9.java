diff --git a/support/cas-server-support-ldap-service-registry/src/main/java/org/apereo/cas/adaptors/ldap/services/DefaultLdapRegisteredServiceMapper.java b/support/cas-server-support-ldap-service-registry/src/main/java/org/apereo/cas/adaptors/ldap/services/DefaultLdapRegisteredServiceMapper.java
index da1b05b..cf887ad 100644
--- a/support/cas-server-support-ldap-service-registry/src/main/java/org/apereo/cas/adaptors/ldap/services/DefaultLdapRegisteredServiceMapper.java
+++ b/support/cas-server-support-ldap-service-registry/src/main/java/org/apereo/cas/adaptors/ldap/services/DefaultLdapRegisteredServiceMapper.java
@@ -41,7 +41,7 @@
     public LdapEntry mapFromRegisteredService(final String dn, final RegisteredService svc) {
         try {
             if (svc.getId() == RegisteredService.INITIAL_IDENTIFIER_VALUE) {
-                ((AbstractRegisteredService) svc).setId(System.nanoTime());
+                ((AbstractRegisteredService) svc).setId(System.currentTimeMillis());
             }
             final String newDn = getDnForRegisteredService(dn, svc);
             LOGGER.debug("Creating entry [{}]", newDn);
