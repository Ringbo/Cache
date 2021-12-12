diff --git a/ldap/src/main/java/org/springframework/security/ldap/userdetails/LdapUserDetailsImpl.java b/ldap/src/main/java/org/springframework/security/ldap/userdetails/LdapUserDetailsImpl.java
index 1ea0ed9..da426cb 100644
--- a/ldap/src/main/java/org/springframework/security/ldap/userdetails/LdapUserDetailsImpl.java
+++ b/ldap/src/main/java/org/springframework/security/ldap/userdetails/LdapUserDetailsImpl.java
@@ -133,7 +133,7 @@
         sb.append("CredentialsNonExpired: ").append(this.credentialsNonExpired).append("; ");
         sb.append("AccountNonLocked: ").append(this.accountNonLocked).append("; ");
 
-        if (this.getAuthorities() != null) {
+        if (this.getAuthorities() != null && !this.getAuthorities().isEmpty()) {
             sb.append("Granted Authorities: ");
             boolean first = true;
 
