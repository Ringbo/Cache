diff --git a/core/src/main/java/org/springframework/security/userdetails/ldap/LdapUserDetailsManager.java b/core/src/main/java/org/springframework/security/userdetails/ldap/LdapUserDetailsManager.java
index 669b9f7..9fbf567 100644
--- a/core/src/main/java/org/springframework/security/userdetails/ldap/LdapUserDetailsManager.java
+++ b/core/src/main/java/org/springframework/security/userdetails/ldap/LdapUserDetailsManager.java
@@ -184,7 +184,7 @@
             public Object executeWithContext(DirContext dirCtx) throws NamingException {
                 LdapContext ctx = (LdapContext) dirCtx;
                 ctx.removeFromEnvironment("com.sun.jndi.ldap.connect.pool");
-                ctx.addToEnvironment(Context.SECURITY_PRINCIPAL, LdapUtils.getFullDn(dn, ctx).toUrl());
+                ctx.addToEnvironment(Context.SECURITY_PRINCIPAL, LdapUtils.getFullDn(dn, ctx).toString());
                 ctx.addToEnvironment(Context.SECURITY_CREDENTIALS, oldPassword);
                 // TODO: reconnect doesn't appear to actually change the credentials
                 try {
