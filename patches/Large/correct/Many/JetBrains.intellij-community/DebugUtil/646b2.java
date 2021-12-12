diff --git a/platform/core-impl/src/com/intellij/psi/impl/DebugUtil.java b/platform/core-impl/src/com/intellij/psi/impl/DebugUtil.java
index b237f2c..5f0fbf5 100644
--- a/platform/core-impl/src/com/intellij/psi/impl/DebugUtil.java
+++ b/platform/core-impl/src/com/intellij/psi/impl/DebugUtil.java
@@ -401,7 +401,7 @@
   public static String psiToStringIgnoringNonCode(@NotNull PsiElement element) {
     StringBuilder buffer = new StringBuilder();
     ((TreeElement)element.getNode()).acceptTree(
-      new TreeToBuffer(buffer, 0, true, false, false, true, null) {
+      new TreeToBuffer(buffer, 0, true, false, false, false, null) {
         @Override
         protected boolean shouldSkipNode(TreeElement node) {
           return super.shouldSkipNode(node) || node instanceof PsiErrorElement || node instanceof PsiComment || 
