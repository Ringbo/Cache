diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/introduce/parameter/java2groovy/GroovyIntroduceParameterMethodUsagesProcessor.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/introduce/parameter/java2groovy/GroovyIntroduceParameterMethodUsagesProcessor.java
index 1493d3f..27718ff 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/introduce/parameter/java2groovy/GroovyIntroduceParameterMethodUsagesProcessor.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/introduce/parameter/java2groovy/GroovyIntroduceParameterMethodUsagesProcessor.java
@@ -103,7 +103,7 @@
 
     final GrClosureSignatureUtil.ArgInfo<PsiElement>[] actualArgs = GrClosureSignatureUtil
       .mapParametersToArguments(signature, callExpression.getNamedArguments(), callExpression.getExpressionArguments(),
-                                callExpression.getClosureArguments(), callExpression, true, true);
+                                callExpression.getClosureArguments(), callExpression, false, true);
 
     final GroovyPsiElementFactory factory = GroovyPsiElementFactory.getInstance(data.getProject());
 
