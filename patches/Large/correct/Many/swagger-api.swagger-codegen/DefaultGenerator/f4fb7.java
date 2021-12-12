diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultGenerator.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultGenerator.java
index 667b634..5f11f99 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultGenerator.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultGenerator.java
@@ -113,7 +113,7 @@
         config.processOpts();
         config.preprocessSwagger(swagger);
         config.additionalProperties().put("generatedDate", DateTime.now().toString());
-        config.additionalProperties().put("generatorClass", config.getClass().toString());
+        config.additionalProperties().put("generatorClass", config.getClass().getName());
         config.additionalProperties().put("inputSpec", config.getInputSpec());
         if (swagger.getVendorExtensions() != null) {
             config.vendorExtensions().putAll(swagger.getVendorExtensions());
