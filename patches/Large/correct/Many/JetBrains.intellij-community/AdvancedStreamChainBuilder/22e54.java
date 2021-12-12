diff --git a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/AdvancedStreamChainBuilder.java b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/AdvancedStreamChainBuilder.java
index deddd52..b104e67 100644
--- a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/AdvancedStreamChainBuilder.java
+++ b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/AdvancedStreamChainBuilder.java
@@ -154,7 +154,7 @@
       }
 
       final PsiElement parent = expression.getParent();
-      if (parent == null) return;
+      if (parent == null || !(parent instanceof PsiReferenceExpression)) return;
       final PsiElement parentCall = parent.getParent();
       if (parentCall instanceof PsiMethodCallExpression && StreamApiUtil.isStreamCall((PsiMethodCallExpression)parentCall)) {
         final PsiMethodCallExpression parentCallExpression = (PsiMethodCallExpression)parentCall;
