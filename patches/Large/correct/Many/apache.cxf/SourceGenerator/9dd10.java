diff --git a/tools/wadlto/jaxrs/src/main/java/org/apache/cxf/tools/wadlto/jaxrs/SourceGenerator.java b/tools/wadlto/jaxrs/src/main/java/org/apache/cxf/tools/wadlto/jaxrs/SourceGenerator.java
index 686f80e..cc88f22 100644
--- a/tools/wadlto/jaxrs/src/main/java/org/apache/cxf/tools/wadlto/jaxrs/SourceGenerator.java
+++ b/tools/wadlto/jaxrs/src/main/java/org/apache/cxf/tools/wadlto/jaxrs/SourceGenerator.java
@@ -1096,7 +1096,7 @@
                 String clsName = getSchemaClassName(packageName, gInfo, actualValue, 
                                                     info.getTypeClassNames());
                 
-                if (clsName != null) {
+                if (clsName == null) {
                     clsName = schemaTypeMap.get("{" + namespace + "}" + actualValue);
                 }
                 if (clsName != null) {
