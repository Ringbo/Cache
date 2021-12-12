diff --git a/components/camel-swagger-java/src/main/java/org/apache/camel/swagger/RestSwaggerReader.java b/components/camel-swagger-java/src/main/java/org/apache/camel/swagger/RestSwaggerReader.java
index eada214..58cf1c1 100644
--- a/components/camel-swagger-java/src/main/java/org/apache/camel/swagger/RestSwaggerReader.java
+++ b/components/camel-swagger-java/src/main/java/org/apache/camel/swagger/RestSwaggerReader.java
@@ -523,7 +523,7 @@
             if (swagger.getDefinitions() != null && swagger.getDefinitions().get(entry.getKey()) != null) {
                 Model oldModel = swagger.getDefinitions().get(entry.getKey());
                 if (oldModel.getVendorExtensions() != null && !oldModel.getVendorExtensions().isEmpty()) {
-                    oldExt = oldModel.getVendorExtensions().get("x-className") == null;
+                    oldExt = oldModel.getVendorExtensions().get("x-className") != null;
                 }
             }
 
