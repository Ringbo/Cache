diff --git a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/action/JvmStreamDebuggerActionHandler.java b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/action/JvmStreamDebuggerActionHandler.java
index a6bfd75..174b1b7 100644
--- a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/action/JvmStreamDebuggerActionHandler.java
+++ b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/action/JvmStreamDebuggerActionHandler.java
@@ -140,7 +140,7 @@
     final PsiFile psiFile = position.getFile();
     final VirtualFile file = psiFile.getVirtualFile();
 
-    if (file != null) {
+    if (line >= 0 && file != null) {
       final Document document = FileDocumentManager.getInstance().getDocument(file);
       if (document != null) {
         final int offset = document.getLineStartOffset(line);
