diff --git a/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapHandler.java b/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapHandler.java
index 6d912ac..b44acbd 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapHandler.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapHandler.java
@@ -167,7 +167,7 @@
       perform();
     }
 
-    void perform() {
+    public void perform() {
       final PsiFile file = myElement.getContainingFile();
       if (!FileModificationService.getInstance().prepareFileForWrite(file)) return;
 
