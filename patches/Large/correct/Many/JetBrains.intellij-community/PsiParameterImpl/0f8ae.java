diff --git a/java/java-psi-impl/src/com/intellij/psi/impl/source/PsiParameterImpl.java b/java/java-psi-impl/src/com/intellij/psi/impl/source/PsiParameterImpl.java
index ae08b6d..e77e7ad 100644
--- a/java/java-psi-impl/src/com/intellij/psi/impl/source/PsiParameterImpl.java
+++ b/java/java-psi-impl/src/com/intellij/psi/impl/source/PsiParameterImpl.java
@@ -99,7 +99,7 @@
         if (parameterIndex < parameters.length) {
           final PsiType psiType = LambdaUtil.getSubstitutor(method, resolveResult).substitute(parameters[parameterIndex].getType());
           if (!LambdaUtil.dependsOnTypeParams(psiType, conjunct, lambdaExpression)) {
-            return GenericsUtil.eliminateWildcards(psiType);
+            return GenericsUtil.eliminateWildcards(psiType, false);
           }
         }
       }
