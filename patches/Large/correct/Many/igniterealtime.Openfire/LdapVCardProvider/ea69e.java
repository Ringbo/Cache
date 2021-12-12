diff --git a/src/java/org/jivesoftware/wildfire/ldap/LdapVCardProvider.java b/src/java/org/jivesoftware/wildfire/ldap/LdapVCardProvider.java
index 1148d4d..6eefd80 100644
--- a/src/java/org/jivesoftware/wildfire/ldap/LdapVCardProvider.java
+++ b/src/java/org/jivesoftware/wildfire/ldap/LdapVCardProvider.java
@@ -130,7 +130,7 @@
     private Map<String, String> getLdapAttributes(String username) {
         // Un-escape username
         username = JID.unescapeNode(username);
-        HashMap<String, String> map = new HashMap<String, String>();
+        Map<String, String> map = new HashMap<String, String>();
 
         DirContext ctx = null;
         try {
@@ -156,7 +156,7 @@
         }
         catch (Exception e) {
             Log.error(e);
-            return null;
+            return Collections.emptyMap();
         }
         finally {
             try {
