diff --git a/components/camel-ldif/src/test/java/org/apache/camel/component/ldif/LdifRouteTest.java b/components/camel-ldif/src/test/java/org/apache/camel/component/ldif/LdifRouteTest.java
index 8b3a29f..240bcd6 100644
--- a/components/camel-ldif/src/test/java/org/apache/camel/component/ldif/LdifRouteTest.java
+++ b/components/camel-ldif/src/test/java/org/apache/camel/component/ldif/LdifRouteTest.java
@@ -74,7 +74,7 @@
         ldapContext = getWiredContext(ldapServer);
 
         SimpleRegistry reg = new SimpleRegistry();
-        reg.put(LDAP_CONN_NAME, getWiredConnection(ldapServer));
+        reg.bind(LDAP_CONN_NAME, getWiredConnection(ldapServer));
         camel = new DefaultCamelContext(reg);
         template = camel.createProducerTemplate();
     }
