diff --git a/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/BaseRemoteFileEditor.java b/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/BaseRemoteFileEditor.java
index fc12a04..525e0b1 100644
--- a/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/BaseRemoteFileEditor.java
+++ b/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/BaseRemoteFileEditor.java
@@ -78,7 +78,7 @@
   @Override
   public void setState(@NotNull FileEditorState state) {
     TextEditor textEditor = getTextEditor();
-    if (textEditor != null) {
+    if (textEditor != null && state instanceof TextEditorState) {
       textEditor.setState(state);
     }
   }
