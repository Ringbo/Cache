diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorComponentImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorComponentImpl.java
index 72ce1b0..4b9aa0c 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorComponentImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorComponentImpl.java
@@ -267,7 +267,7 @@
     Point oldLocationOnScreen;
 
     public AccessibleEditor() {
-      getEditor().getDocument().addDocumentListener(this);
+      getEditor().getDocument().addDocumentListener(this, myEditor.getDisposable());
       getEditor().getCaretModel().addCaretListener(this);
       caretPos = getCaretPosition();
 
