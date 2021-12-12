diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/convertToJava/StubGenerator.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/convertToJava/StubGenerator.java
index 22eb159..767f9b3 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/convertToJava/StubGenerator.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/convertToJava/StubGenerator.java
@@ -394,7 +394,8 @@
   private static String getVariableInitializer(GrVariable variable, PsiType declaredType) {
     if (declaredType instanceof PsiPrimitiveType) {
       Object eval = GroovyConstantExpressionEvaluator.evaluate(variable.getInitializerGroovy());
-      if (eval instanceof Float) {
+      if (eval instanceof Float ||
+          PsiType.FLOAT.equals(TypesUtil.unboxPrimitiveTypeWrapper(variable.getType())) && eval instanceof Number) {
         return eval.toString() + "f";
       }
       else if (eval instanceof Character) {
