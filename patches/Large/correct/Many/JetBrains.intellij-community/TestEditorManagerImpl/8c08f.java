diff --git a/psi-extapi/src/com/intellij/testFramework/TestEditorManagerImpl.java b/psi-extapi/src/com/intellij/testFramework/TestEditorManagerImpl.java
index 0351247..253c463 100644
--- a/psi-extapi/src/com/intellij/testFramework/TestEditorManagerImpl.java
+++ b/psi-extapi/src/com/intellij/testFramework/TestEditorManagerImpl.java
@@ -111,7 +111,7 @@
     final EditorFactory editorFactory = EditorFactory.getInstance();
     for (VirtualFile file : myVirtualFile2Editor.keySet()) {
       Editor editor = myVirtualFile2Editor.get(file);
-      if (editor != null){
+      if (editor != null && !editor.isDisposed()){
         editorFactory.releaseEditor(editor);
       }
     }
