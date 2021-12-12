diff --git a/core/src/main/java/org/springframework/security/providers/ldap/authenticator/LdapShaPasswordEncoder.java b/core/src/main/java/org/springframework/security/providers/ldap/authenticator/LdapShaPasswordEncoder.java
index ef6f254..b8b0f05 100644
--- a/core/src/main/java/org/springframework/security/providers/ldap/authenticator/LdapShaPasswordEncoder.java
+++ b/core/src/main/java/org/springframework/security/providers/ldap/authenticator/LdapShaPasswordEncoder.java
@@ -85,9 +85,9 @@
             sha = MessageDigest.getInstance("SHA");
             sha.update(rawPass.getBytes("UTF-8"));
         } catch (java.security.NoSuchAlgorithmException e) {
-            throw new IllegalStateException("No SHA implementation available!", e);
+            throw new IllegalStateException("No SHA implementation available!");
 		} catch (UnsupportedEncodingException ue) {
-			throw new IllegalStateException("UTF-8 not supported!", ue);
+			throw new IllegalStateException("UTF-8 not supported!");
 		}
 
         if (salt != null) {
