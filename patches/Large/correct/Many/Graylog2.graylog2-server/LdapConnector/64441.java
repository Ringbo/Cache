diff --git a/graylog2-server/src/main/java/org/graylog2/security/ldap/LdapConnector.java b/graylog2-server/src/main/java/org/graylog2/security/ldap/LdapConnector.java
index 769d9b4..e2a855a 100644
--- a/graylog2-server/src/main/java/org/graylog2/security/ldap/LdapConnector.java
+++ b/graylog2-server/src/main/java/org/graylog2/security/ldap/LdapConnector.java
@@ -132,7 +132,7 @@
             entryCursor = connection.search(searchBase,
                                             filter,
                                             SearchScope.SUBTREE,
-                                            groupIdAttribute, displayNameAttribute, "dn", "uid", "userPrincipalName", "mail", "rfc822Mailbox", "memberOf");
+                                            groupIdAttribute, displayNameAttribute, "dn", "uid", "userPrincipalName", "mail", "rfc822Mailbox", "memberOf", "isMemberOf");
             final Iterator<Entry> it = entryCursor.iterator();
             if (it.hasNext()) {
                 final Entry e = it.next();
@@ -151,7 +151,8 @@
                     if (attribute.isHumanReadable()) {
                         ldapEntry.put(attribute.getId(), Joiner.on(", ").join(attribute.iterator()));
                     }
-                    if ("memberOf".equalsIgnoreCase(attribute.getId())) {
+                    // ActiveDirectory (memberOf) and Sun Directory Server (isMemberOf)
+                    if ("memberOf".equalsIgnoreCase(attribute.getId()) || "isMemberOf".equalsIgnoreCase(attribute.getId())) {
                         for (Value<?> group : attribute) {
                             groupDns.add(group.getString());
                         }
