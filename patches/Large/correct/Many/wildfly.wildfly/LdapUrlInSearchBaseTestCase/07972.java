diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ldap/LdapUrlInSearchBaseTestCase.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ldap/LdapUrlInSearchBaseTestCase.java
index 8af0e7b..6b5e11b 100644
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ldap/LdapUrlInSearchBaseTestCase.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ldap/LdapUrlInSearchBaseTestCase.java
@@ -87,7 +87,11 @@
         final WebArchive war = ShrinkWrap.create(WebArchive.class, "ldap-test.war");
         war.addClasses(LdapUrlTestServlet.class);
 
-        war.addAsManifestResource(createPermissionsXmlAsset(new SocketPermission("*:10389", "connect,resolve")), "permissions.xml");
+        war.addAsManifestResource(createPermissionsXmlAsset(
+                new SocketPermission("*:10389", "connect,resolve"),
+                new RuntimePermission("accessClassInPackage.com.sun.jndi.ldap"),
+                new RuntimePermission("accessClassInPackage.com.sun.jndi.url.ldap")
+        ), "permissions.xml");
 
         return war;
     }
