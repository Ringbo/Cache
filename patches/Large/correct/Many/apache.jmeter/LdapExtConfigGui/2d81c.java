diff --git a/src/protocol/ldap/org/apache/jmeter/protocol/ldap/config/gui/LdapExtConfigGui.java b/src/protocol/ldap/org/apache/jmeter/protocol/ldap/config/gui/LdapExtConfigGui.java
index cbbc366..3652dae 100644
--- a/src/protocol/ldap/org/apache/jmeter/protocol/ldap/config/gui/LdapExtConfigGui.java
+++ b/src/protocol/ldap/org/apache/jmeter/protocol/ldap/config/gui/LdapExtConfigGui.java
@@ -228,7 +228,7 @@
             cl.show(cards, CARDS_BIND);
         } else if (testType.equals(LDAPExtSampler.SBIND)) {
             sbind.setSelected(true);
-            cl.show(cards, CARDS_DEFAULT);
+            cl.show(cards, CARDS_BIND);
         } else if (testType.equals(LDAPExtSampler.COMPARE)) {
             compare.setSelected(true);
             cl.show(cards, CARDS_COMPARE);
