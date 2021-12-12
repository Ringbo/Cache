diff --git a/services/xkms/xkms-x509-handlers/src/main/java/org/apache/cxf/xkms/x509/repo/ldap/LdapCertificateRepo.java b/services/xkms/xkms-x509-handlers/src/main/java/org/apache/cxf/xkms/x509/repo/ldap/LdapCertificateRepo.java
index 0822c00..1ec66f3 100644
--- a/services/xkms/xkms-x509-handlers/src/main/java/org/apache/cxf/xkms/x509/repo/ldap/LdapCertificateRepo.java
+++ b/services/xkms/xkms-x509-handlers/src/main/java/org/apache/cxf/xkms/x509/repo/ldap/LdapCertificateRepo.java
@@ -89,7 +89,7 @@
     
     @Override
     public List<X509CRL> getCRLs() {
-        return getCRLsFromLdap(rootDN, ldapConfig.getAttrCrlBinary(), ldapConfig.getAttrCrlBinary());
+        return getCRLsFromLdap(rootDN, ldapConfig.getCrlFilter(), ldapConfig.getAttrCrlBinary());
     }
 
     private List<X509Certificate> getCertificatesFromLdap(String tmpRootDN, String tmpFilter, String tmpAttrName) {
