diff --git a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacementBuilder.java b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacementBuilder.java
index fc38738..1e9c4b2 100644
--- a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacementBuilder.java
+++ b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacementBuilder.java
@@ -469,7 +469,7 @@
 
     if (parameterizations!=null) {
       String name = parameter.getName();
-      String type = parameter.getTypeElement().getText();
+      String type = parameter.getType().getCanonicalText();
 
       if (StructuralSearchUtil.isTypedVariable(name)) {
         name = stripTypedVariableDecoration(name);
