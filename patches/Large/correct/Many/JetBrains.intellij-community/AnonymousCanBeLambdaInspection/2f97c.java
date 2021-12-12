diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeLambdaInspection.java b/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeLambdaInspection.java
index cdba440..4ce89c1 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeLambdaInspection.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeLambdaInspection.java
@@ -327,7 +327,7 @@
     public void applyFix(@NotNull Project project, @NotNull ProblemDescriptor descriptor) {
       final PsiElement element = descriptor.getPsiElement();
       if (element != null) {
-        replacePsiElementWithLambda(element, false, true);
+        replacePsiElementWithLambda(element, false, false);
       }
     }
 
