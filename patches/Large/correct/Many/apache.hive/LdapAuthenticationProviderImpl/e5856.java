diff --git a/service/src/java/org/apache/hive/service/auth/LdapAuthenticationProviderImpl.java b/service/src/java/org/apache/hive/service/auth/LdapAuthenticationProviderImpl.java
index 85abba7..5342214 100644
--- a/service/src/java/org/apache/hive/service/auth/LdapAuthenticationProviderImpl.java
+++ b/service/src/java/org/apache/hive/service/auth/LdapAuthenticationProviderImpl.java
@@ -70,7 +70,7 @@
       DirContext ctx = new InitialDirContext(env);
       ctx.close();
     } catch (NamingException e) {
-      throw new AuthenticationException("Error validating LDAP user");
+      throw new AuthenticationException("Error validating LDAP user", e);
     }
   return;
   }
