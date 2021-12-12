diff --git a/source/com/intellij/openapi/module/impl/ModuleUtil.java b/source/com/intellij/openapi/module/impl/ModuleUtil.java
index 9eac7dc..bfbce6f 100644
--- a/source/com/intellij/openapi/module/impl/ModuleUtil.java
+++ b/source/com/intellij/openapi/module/impl/ModuleUtil.java
@@ -99,7 +99,7 @@
   }
 
   @Nullable
-  public static Module findModuleForPsiElement(@NotNull PsiElement element) {
+  public static Module findModuleForPsiElement(@Nullable PsiElement element) {
     if (!element.isValid()) return null;
     Project project = element.getProject();
     final ProjectFileIndex fileIndex = ProjectRootManager.getInstance(project).getFileIndex();
