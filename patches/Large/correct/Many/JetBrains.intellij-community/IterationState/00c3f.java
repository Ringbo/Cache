diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/IterationState.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/IterationState.java
index 602073d..ee31e70 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/IterationState.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/IterationState.java
@@ -172,9 +172,9 @@
         Caret caret = carets.get(i);
         mySelectionStarts[iterateBackwards ? caretCount - i - 1 : i] = caret.getSelectionStart();
         mySelectionEnds[iterateBackwards ? caretCount - i - 1 : i] = caret.getSelectionEnd();
-        if (!iterateBackwards) {
+        if (!iterateBackwards && caret.hasSelection()) {
           myVirtualSelectionStarts[i] = caret.getSelectionStartPosition().column -
-                                        editor.offsetToVisualPosition(mySelectionStarts[i]).column;
+                                        editor.offsetToVisualPosition(mySelectionStarts[i], true).column;
           myVirtualSelectionEnds[i] = caret.getSelectionEndPosition().column -
                                       editor.offsetToVisualPosition(mySelectionEnds[i]).column;
         }
