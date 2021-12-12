diff --git a/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupPreview.java b/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupPreview.java
index 522c9d0..2fa9a0d 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupPreview.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupPreview.java
@@ -92,7 +92,7 @@
   }
 
   private void addInlay(String suffix, int caretOffset) {
-    Inlay inlay = myLookup.getTopLevelEditor().getInlayModel().addInlineElement(caretOffset, createGrayRenderer(suffix));
+    Inlay inlay = myLookup.getTopLevelEditor().getInlayModel().addInlineElement(caretOffset, true, createGrayRenderer(suffix));
     if (inlay != null) {
       myInlays.add(inlay);
       Disposer.register(myLookup, inlay);
