diff --git a/shield/src/test/java/org/elasticsearch/shield/authc/ldap/LdapUserSearchSessionFactoryTests.java b/shield/src/test/java/org/elasticsearch/shield/authc/ldap/LdapUserSearchSessionFactoryTests.java
index 7709d45..4ae330e 100644
--- a/shield/src/test/java/org/elasticsearch/shield/authc/ldap/LdapUserSearchSessionFactoryTests.java
+++ b/shield/src/test/java/org/elasticsearch/shield/authc/ldap/LdapUserSearchSessionFactoryTests.java
@@ -412,7 +412,7 @@
         }
         builder.put("path.home", createTempDir());
 
-        try (Node node = new MockNode(builder.build(), false, Version.CURRENT, Arrays.asList(ShieldPlugin.class, LicensePlugin.class))) {
+        try (Node node = new MockNode(builder.build(), Version.CURRENT, Arrays.asList(ShieldPlugin.class, LicensePlugin.class))) {
             node.start();
         }
     }
