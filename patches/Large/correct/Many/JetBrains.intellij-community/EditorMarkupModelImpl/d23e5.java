diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java
index 56875d5..79a86a9 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java
@@ -1079,7 +1079,7 @@
       endY = myEditorScrollbarTop + myEditor.visualLineToY(endLineNumber);
     }
     else {
-      int editorEndY = myEditor.visualLineToY(startLineNumber);
+      int editorEndY = myEditor.visualLineToY(endLineNumber);
       endY = myEditorScrollbarTop + (int)((float)editorEndY / myEditorSourceHeight * editorTargetHeight);
     }
     if (endY < startY) endY = startY;
