diff --git a/zeppelin-server/src/main/java/org/apache/zeppelin/realm/ActiveDirectoryGroupRealm.java b/zeppelin-server/src/main/java/org/apache/zeppelin/realm/ActiveDirectoryGroupRealm.java
index d89719c..7990d5f 100644
--- a/zeppelin-server/src/main/java/org/apache/zeppelin/realm/ActiveDirectoryGroupRealm.java
+++ b/zeppelin-server/src/main/java/org/apache/zeppelin/realm/ActiveDirectoryGroupRealm.java
@@ -156,7 +156,7 @@
       if (userPrincipalName == null) {
         return null;
       }
-      if (this.principalSuffix != null) {
+      if (this.principalSuffix != null && userPrincipalName.indexOf('@') < 0) {
         userPrincipalName = upToken.getUsername() + this.principalSuffix;
       }
       ctx = ldapContextFactory.getLdapContext(
@@ -254,7 +254,7 @@
     SearchControls searchCtls = new SearchControls();
     searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
     String userPrincipalName = username;
-    if (principalSuffix != null) {
+    if (this.principalSuffix != null && userPrincipalName.indexOf('@') < 0) {
       userPrincipalName += principalSuffix;
     }
 
