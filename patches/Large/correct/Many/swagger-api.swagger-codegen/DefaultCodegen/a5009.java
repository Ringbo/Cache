diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java
index 2593f85..9591a0b 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java
@@ -152,7 +152,7 @@
         }
 
         if (additionalProperties.containsKey(CodegenConstants.REMOVE_OPERATION_ID_PREFIX)) {
-            this.setSortParamsByRequiredFlag(Boolean.valueOf(additionalProperties
+            this.setRemoveOperationIdPrefix(Boolean.valueOf(additionalProperties
                     .get(CodegenConstants.REMOVE_OPERATION_ID_PREFIX).toString()));
         }
     }
