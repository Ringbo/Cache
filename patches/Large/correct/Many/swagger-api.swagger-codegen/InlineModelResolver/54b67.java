diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/InlineModelResolver.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/InlineModelResolver.java
index dfa5238..143fa95 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/InlineModelResolver.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/InlineModelResolver.java
@@ -342,7 +342,7 @@
                             refProperty.setRequired(op.getRequired());
                             mp.setAdditionalProperties(refProperty);
                         } else {
-                            RefProperty refProperty = new RefProperty(existing);
+                            RefProperty refProperty = new RefProperty(modelName);
                             refProperty.setRequired(op.getRequired());
                             mp.setAdditionalProperties(refProperty);
                             addGenerated(modelName, innerModel);
