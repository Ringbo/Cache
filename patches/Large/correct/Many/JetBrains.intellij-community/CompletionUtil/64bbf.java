diff --git a/source/com/intellij/codeInsight/completion/CompletionUtil.java b/source/com/intellij/codeInsight/completion/CompletionUtil.java
index 241be18..173e64d 100644
--- a/source/com/intellij/codeInsight/completion/CompletionUtil.java
+++ b/source/com/intellij/codeInsight/completion/CompletionUtil.java
@@ -383,7 +383,7 @@
           final PsiElement parent = reference.getParent();
           if(parent instanceof PsiReference) return;
           if(referenceOnMethod && parent instanceof PsiMethodCallExpression && reference == ((PsiMethodCallExpression)parent).getMethodExpression()) {
-            if (reference.resolve() == null) unresolvedRefs.add(reference.getReferenceName());
+            if (reference.resolve() == null && reference.getReferenceName() != null) unresolvedRefs.add(reference.getReferenceName());
           }
           else if(!referenceOnMethod && reference.resolve() == null) unresolvedRefs.add(reference.getReferenceName());
         }
