diff --git a/src/java/org/jivesoftware/wildfire/ldap/LdapGroupProvider.java b/src/java/org/jivesoftware/wildfire/ldap/LdapGroupProvider.java
index 7d8ac4f..cc42813 100644
--- a/src/java/org/jivesoftware/wildfire/ldap/LdapGroupProvider.java
+++ b/src/java/org/jivesoftware/wildfire/ldap/LdapGroupProvider.java
@@ -270,7 +270,7 @@
                 if (JiveGlobals.getXMLProperty("ldap.wrapUserDN", true)) {
                     // Check if we need to wrap values between "
                     // eg. cn=John\, Doe,ou=People --> cn="John\, Doe",ou=People
-                    Matcher matcher = userDNPattern.matcher(username);
+                    Matcher matcher = userDNPattern.matcher(userDN);
                     while (matcher.find()) {
                         userDN = matcher.replaceFirst(
                                 matcher.group(1) + "\"" + matcher.group(2) + "\"");
