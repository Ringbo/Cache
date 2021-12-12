diff --git a/cas-server-core-authentication/src/main/java/org/apereo/cas/config/CasPersonDirectoryAttributeRepositoryConfiguration.java b/cas-server-core-authentication/src/main/java/org/apereo/cas/config/CasPersonDirectoryAttributeRepositoryConfiguration.java
index 766691a..c335108 100644
--- a/cas-server-core-authentication/src/main/java/org/apereo/cas/config/CasPersonDirectoryAttributeRepositoryConfiguration.java
+++ b/cas-server-core-authentication/src/main/java/org/apereo/cas/config/CasPersonDirectoryAttributeRepositoryConfiguration.java
@@ -131,7 +131,7 @@
             }
 
             jdbcDao.setQueryAttributeMapping(ImmutableMap.of("username", jdbc.getUsername()));
-            Map<String, String> mapping = casProperties.getAuthn().getAttributeRepository().getAttributes();
+            final Map<String, String> mapping = casProperties.getAuthn().getAttributeRepository().getAttributes();
             if (mapping != null && !mapping.isEmpty()) {
                 jdbcDao.setResultAttributeMapping(mapping);
             }
