diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInsight/hint/GroovyExpressionTypeProvider.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInsight/hint/GroovyExpressionTypeProvider.java
index 8408b4d..5726f70 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInsight/hint/GroovyExpressionTypeProvider.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInsight/hint/GroovyExpressionTypeProvider.java
@@ -31,7 +31,7 @@
   @Override
   public String getInformationHint(@NotNull GrExpression element) {
     final PsiType type = element.getType();
-    return StringUtil.escapeXml(type == null ? "<unknown>" : type.getCanonicalText());
+    return StringUtil.escapeXml(type == null ? "<unknown>" : type.getPresentableText());
   }
 
   @NotNull
