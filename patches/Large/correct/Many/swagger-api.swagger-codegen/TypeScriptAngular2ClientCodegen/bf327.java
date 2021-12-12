diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/TypeScriptAngular2ClientCodegen.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/TypeScriptAngular2ClientCodegen.java
index 10429ce..759a5bd 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/TypeScriptAngular2ClientCodegen.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/TypeScriptAngular2ClientCodegen.java
@@ -60,7 +60,7 @@
 
     @Override
     protected void addAdditionPropertiesToCodeGenModel(CodegenModel codegenModel, ModelImpl swaggerModel) {
-        codegenModel.additionalPropertiesType = getSwaggerType(swaggerModel.getAdditionalProperties());
+        codegenModel.additionalPropertiesType = getTypeDeclaration(swaggerModel.getAdditionalProperties());
         addImport(codegenModel, codegenModel.additionalPropertiesType);
     }
 
