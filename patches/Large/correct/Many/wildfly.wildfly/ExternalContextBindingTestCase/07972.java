diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ExternalContextBindingTestCase.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ExternalContextBindingTestCase.java
index cc6783a..65af00c 100644
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ExternalContextBindingTestCase.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ExternalContextBindingTestCase.java
@@ -312,7 +312,10 @@
     public static JavaArchive deploy() {
         return ShrinkWrap.create(JavaArchive.class, "externalContextBindingTest.jar")
                 .addClasses(ExternalContextBindingTestCase.class, LookupEjb.class)
-                .addAsManifestResource(createPermissionsXmlAsset(new JndiPermission("*", "lookup")), "jboss-permissions.xml");
+                .addAsManifestResource(createPermissionsXmlAsset(
+                        new JndiPermission("*", "lookup"),
+                        new RuntimePermission("accessClassInPackage.com.sun.jndi.ldap")
+                ), "jboss-permissions.xml");
     }
 
     @Test
