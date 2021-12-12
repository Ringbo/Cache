diff --git a/dropwizard-core/src/main/java/com/yammer/dropwizard/json/ObjectMapperFactory.java b/dropwizard-core/src/main/java/com/yammer/dropwizard/json/ObjectMapperFactory.java
index c0ac835..e00d1a1 100644
--- a/dropwizard-core/src/main/java/com/yammer/dropwizard/json/ObjectMapperFactory.java
+++ b/dropwizard-core/src/main/java/com/yammer/dropwizard/json/ObjectMapperFactory.java
@@ -506,15 +506,15 @@
         }
 
         for (Map.Entry<JsonGenerator.Feature, Boolean> entry : generatorFeatures.entrySet()) {
-            mapper.getJsonFactory().configure(entry.getKey(), entry.getValue());
+            mapper.getFactory().configure(entry.getKey(), entry.getValue());
         }
 
         for (Map.Entry<JsonParser.Feature, Boolean> entry : parserFeatures.entrySet()) {
-            mapper.getJsonFactory().configure(entry.getKey(), entry.getValue());
+            mapper.getFactory().configure(entry.getKey(), entry.getValue());
         }
 
         for (Map.Entry<JsonFactory.Feature, Boolean> entry : factoryFeatures.entrySet()) {
-            mapper.getJsonFactory().configure(entry.getKey(), entry.getValue());
+            mapper.getFactory().configure(entry.getKey(), entry.getValue());
         }
 
         if (annotationIntrospector != null) {
