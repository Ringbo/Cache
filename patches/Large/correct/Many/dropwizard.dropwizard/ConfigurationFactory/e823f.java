diff --git a/dropwizard-configuration/src/main/java/com/codahale/dropwizard/configuration/ConfigurationFactory.java b/dropwizard-configuration/src/main/java/com/codahale/dropwizard/configuration/ConfigurationFactory.java
index d0ef340..2c3bd4a 100644
--- a/dropwizard-configuration/src/main/java/com/codahale/dropwizard/configuration/ConfigurationFactory.java
+++ b/dropwizard-configuration/src/main/java/com/codahale/dropwizard/configuration/ConfigurationFactory.java
@@ -65,7 +65,7 @@
      */
     public T build(ConfigurationSourceProvider provider, String path) throws IOException, ConfigurationException {
         try (InputStream input = provider.open(checkNotNull(path))) {
-            final JsonNode node = mapper.readTree(yamlFactory.createJsonParser(input));
+            final JsonNode node = mapper.readTree(yamlFactory.createParser(input));
             return build(node, path);
         }
     }
