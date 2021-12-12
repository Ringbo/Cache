diff --git a/components/camel-ldap/src/test/java/org/apache/camel/component/ldap/LdapRouteTest.java b/components/camel-ldap/src/test/java/org/apache/camel/component/ldap/LdapRouteTest.java
index 9a69e94..d30d7e2 100644
--- a/components/camel-ldap/src/test/java/org/apache/camel/component/ldap/LdapRouteTest.java
+++ b/components/camel-ldap/src/test/java/org/apache/camel/component/ldap/LdapRouteTest.java
@@ -66,7 +66,7 @@
         LdapContext ctx = getWiredContext(ldapServer);
 
         SimpleRegistry reg = new SimpleRegistry();
-        reg.put("localhost:" + port, ctx);
+        reg.bind("localhost:" + port, ctx);
         camel = new DefaultCamelContext(reg);
         template = camel.createProducerTemplate();
     }
