diff --git a/components/camel-ldap/src/test/java/org/apache/camel/component/ldap/LdapRouteTwoTest.java b/components/camel-ldap/src/test/java/org/apache/camel/component/ldap/LdapRouteTwoTest.java
index faebd08..444c40e 100644
--- a/components/camel-ldap/src/test/java/org/apache/camel/component/ldap/LdapRouteTwoTest.java
+++ b/components/camel-ldap/src/test/java/org/apache/camel/component/ldap/LdapRouteTwoTest.java
@@ -65,7 +65,7 @@
         env.put("java.naming.security.authentication", "simple");
 
         SimpleRegistry reg = new SimpleRegistry();
-        reg.put("localhost:" + port, env);
+        reg.bind("localhost:" + port, env);
         camel = new DefaultCamelContext(reg);
         template = camel.createProducerTemplate();
     }
