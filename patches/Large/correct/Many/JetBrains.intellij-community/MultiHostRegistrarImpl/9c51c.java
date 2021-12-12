diff --git a/platform/lang-impl/src/com/intellij/psi/impl/source/tree/injected/MultiHostRegistrarImpl.java b/platform/lang-impl/src/com/intellij/psi/impl/source/tree/injected/MultiHostRegistrarImpl.java
index 8c70a99..4cbd4dc 100644
--- a/platform/lang-impl/src/com/intellij/psi/impl/source/tree/injected/MultiHostRegistrarImpl.java
+++ b/platform/lang-impl/src/com/intellij/psi/impl/source/tree/injected/MultiHostRegistrarImpl.java
@@ -567,7 +567,7 @@
   }
 
   @NotNull
-  PsiFile getHostPsiFile() {
+  public PsiFile getHostPsiFile() {
     return myHostPsiFile;
   }
 
