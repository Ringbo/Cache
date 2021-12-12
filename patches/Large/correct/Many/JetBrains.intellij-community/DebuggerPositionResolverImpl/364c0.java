diff --git a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/DebuggerPositionResolverImpl.java b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/DebuggerPositionResolverImpl.java
index 3bb15b7..01d8ccc 100644
--- a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/DebuggerPositionResolverImpl.java
+++ b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/DebuggerPositionResolverImpl.java
@@ -52,7 +52,7 @@
 
     if (line >= 0 && file != null) {
       final Document document = FileDocumentManager.getInstance().getDocument(file);
-      if (document != null) {
+      if (document != null && line < document.getLineCount()) {
         final int offset = document.getLineStartOffset(line);
         return DebuggerUtilsEx.findElementAt(PsiDocumentManager.getInstance(project).getPsiFile(document), offset);
       }
