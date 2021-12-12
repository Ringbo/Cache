diff --git a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/PsiChangeHandler.java b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/PsiChangeHandler.java
index 2eda033..f5f698e 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/PsiChangeHandler.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/PsiChangeHandler.java
@@ -100,7 +100,7 @@
   }
 
   private void updateChangesForDocument(@NotNull final Document document) {
-    if (DaemonListeners.isUnderIgnoredAction(null)) return;
+    if (DaemonListeners.isUnderIgnoredAction(null) || myProject.isDisposed()) return;
     List<Pair<PsiElement, Boolean>> toUpdate = changedElements.get(document);
     if (toUpdate == null) {
       // The document has been changed, but psi hasn't
