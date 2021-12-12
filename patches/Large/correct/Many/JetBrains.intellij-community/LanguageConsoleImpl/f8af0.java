diff --git a/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java b/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java
index 6f8e4e7..c09b9f0 100644
--- a/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java
+++ b/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java
@@ -137,7 +137,7 @@
     myCurrentEditor = myConsoleEditor;
     Document historyDocument = ((EditorFactoryImpl)editorFactory).createDocument(true);
     UndoUtil.disableUndoFor(historyDocument);
-    myHistoryViewer = (EditorEx)editorFactory.createViewer(historyDocument, getProject());
+    myHistoryViewer = (EditorEx)editorFactory.createViewer(historyDocument, getProject(), EditorKind.CONSOLE);
     myHistoryViewer.getDocument().addDocumentListener(myDocumentAdapter);
 
     myScrollBar.setOpaque(false);
