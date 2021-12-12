diff --git a/src/java/org/jivesoftware/wildfire/ldap/LdapUserProvider.java b/src/java/org/jivesoftware/wildfire/ldap/LdapUserProvider.java
index 3bf86fd..e5f84bf 100644
--- a/src/java/org/jivesoftware/wildfire/ldap/LdapUserProvider.java
+++ b/src/java/org/jivesoftware/wildfire/ldap/LdapUserProvider.java
@@ -94,12 +94,12 @@
             }
             Date creationDate = new Date();
             Attribute creationDateField = attrs.get("createTimestamp");
-            if (creationDateField != null) {
+            if (creationDateField != null && "".equals(((String) creationDateField.get()).trim())) {
                 creationDate = parseLDAPDate((String)creationDateField.get());
             }
             Date modificationDate = new Date();
             Attribute modificationDateField = attrs.get("modifyTimestamp");
-            if (modificationDateField != null) {
+            if (modificationDateField != null && "".equals(((String) modificationDateField.get()).trim())) {
                 modificationDate = parseLDAPDate((String)modificationDateField.get());
             }
             // Escape the username so that it can be used as a JID.
