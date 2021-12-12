diff --git a/idea/src/org/jetbrains/jet/plugin/parameterInfo/JetFunctionParameterInfoHandler.java b/idea/src/org/jetbrains/jet/plugin/parameterInfo/JetFunctionParameterInfoHandler.java
index 3da7d3a..ab567ed 100644
--- a/idea/src/org/jetbrains/jet/plugin/parameterInfo/JetFunctionParameterInfoHandler.java
+++ b/idea/src/org/jetbrains/jet/plugin/parameterInfo/JetFunctionParameterInfoHandler.java
@@ -151,7 +151,7 @@
             builder.append("vararg ");
         }
         builder.append(descriptor.getName()).append(": ").
-                append(DescriptorRenderer.TEXT.renderType(getActualParameterType(descriptor)));
+                append(DescriptorRenderer.TEXT.renderTypeWithShortNames(getActualParameterType(descriptor)));
         if (descriptor.hasDefaultValue()) {
             PsiElement element = BindingContextUtils.descriptorToDeclaration(bindingContext, descriptor);
             String defaultExpression = "?";
