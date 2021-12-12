diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/compiler/JavacQuirksInspectionVisitor.java b/java/java-analysis-impl/src/com/intellij/codeInspection/compiler/JavacQuirksInspectionVisitor.java
index a0d2c1c..fd98aa9 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/compiler/JavacQuirksInspectionVisitor.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/compiler/JavacQuirksInspectionVisitor.java
@@ -140,7 +140,7 @@
         if (method.isVarArgs() && method.hasTypeParameters() && args.length > method.getParameterList().getParametersCount() + 50) {
           PsiSubstitutor substitutor = resolveResult.getSubstitutor();
           for (PsiTypeParameter typeParameter : method.getTypeParameters()) {
-            if (!PsiTypesUtil.isDenotableType(substitutor.substitute(typeParameter), typeParameter)) {
+            if (!PsiTypesUtil.isDenotableType(substitutor.substitute(typeParameter), expression)) {
               return;
             }
           }
