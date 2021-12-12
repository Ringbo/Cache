diff --git a/modules/swagger-core/src/main/java/io/swagger/util/PropertyDeserializer.java b/modules/swagger-core/src/main/java/io/swagger/util/PropertyDeserializer.java
index 83e0621..e278754 100644
--- a/modules/swagger-core/src/main/java/io/swagger/util/PropertyDeserializer.java
+++ b/modules/swagger-core/src/main/java/io/swagger/util/PropertyDeserializer.java
@@ -145,7 +145,7 @@
 
         if (ObjectProperty.isType(type) || node.get("properties") != null) {
             detailNode = node.get("additionalProperties");
-            if (detailNode != null) {
+            if (detailNode != null && detailNode.getNodeType().equals(JsonNodeType.OBJECT)) {
                 Property items = propertyFromNode(detailNode);
                 if (items != null) {
                     MapProperty mapProperty = new MapProperty(items).description(description);
