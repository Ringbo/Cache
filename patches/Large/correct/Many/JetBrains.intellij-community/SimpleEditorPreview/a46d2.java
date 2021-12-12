diff --git a/platform/lang-impl/src/com/intellij/application/options/colors/SimpleEditorPreview.java b/platform/lang-impl/src/com/intellij/application/options/colors/SimpleEditorPreview.java
index 171cc51..2a8bc7c 100644
--- a/platform/lang-impl/src/com/intellij/application/options/colors/SimpleEditorPreview.java
+++ b/platform/lang-impl/src/com/intellij/application/options/colors/SimpleEditorPreview.java
@@ -245,7 +245,7 @@
   private boolean isOffsetVisible(final int startOffset) {
     return myEditor
       .getScrollingModel()
-      .getVisibleArea()
+      .getVisibleAreaOnScrollingFinished()
       .contains(myEditor.logicalPositionToXY(myEditor.offsetToLogicalPosition(startOffset)));
   }
 
