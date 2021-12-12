diff --git a/idea/src/org/jetbrains/kotlin/idea/refactoring/changeSignature/usages/JetCallableDefinitionUsage.java b/idea/src/org/jetbrains/kotlin/idea/refactoring/changeSignature/usages/JetCallableDefinitionUsage.java
index a1a7274..aac8745 100644
--- a/idea/src/org/jetbrains/kotlin/idea/refactoring/changeSignature/usages/JetCallableDefinitionUsage.java
+++ b/idea/src/org/jetbrains/kotlin/idea/refactoring/changeSignature/usages/JetCallableDefinitionUsage.java
@@ -227,9 +227,8 @@
 
         boolean returnTypeIsNeeded;
         if (element instanceof JetFunction) {
-            returnTypeIsNeeded = (changeInfo.isRefactoringTarget(originalCallableDescriptor) ||
-                                  !(callable instanceof JetFunctionLiteral) ||
-                                  callable.getTypeReference() != null);
+            returnTypeIsNeeded = !(callable instanceof JetFunctionLiteral)
+                                 && (changeInfo.isRefactoringTarget(originalCallableDescriptor) || callable.getTypeReference() != null);
         }
         else {
             returnTypeIsNeeded = element instanceof JetProperty || element instanceof JetParameter;
@@ -261,7 +260,7 @@
 
         JetParameterList newParameterList = null;
         if (isLambda) {
-            if (parametersCount == 0 && ((JetFunctionLiteral) element).getTypeReference() == null) {
+            if (parametersCount == 0) {
                 if (parameterList != null) {
                     parameterList.delete();
                     PsiElement arrow = ((JetFunctionLiteral)element).getArrow();
@@ -272,7 +271,7 @@
                 }
             }
             else {
-                newParameterList = psiFactory.createFunctionLiteralParameterList(changeInfo.getNewParametersSignature(
+                newParameterList = psiFactory.createFunctionLiteralParameterList(changeInfo.getNewParametersSignatureWithoutParentheses(
                         (JetCallableDefinitionUsage<PsiElement>) this)
                 );
                 canReplaceEntireList = true;
