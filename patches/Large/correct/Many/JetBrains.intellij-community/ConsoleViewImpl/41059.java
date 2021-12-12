diff --git a/source/com/intellij/execution/impl/ConsoleViewImpl.java b/source/com/intellij/execution/impl/ConsoleViewImpl.java
index 4a2eaeb..c4014da 100644
--- a/source/com/intellij/execution/impl/ConsoleViewImpl.java
+++ b/source/com/intellij/execution/impl/ConsoleViewImpl.java
@@ -338,7 +338,7 @@
       final LogicalPosition pos = myEditor.getCaretModel().getLogicalPosition();
       final HyperlinkInfo info = getHyperlinkInfoByLineAndCol(pos.line, pos.column);
       final OpenFileDescriptor openFileDescriptor = info instanceof OpenFileHyperlinkInfo ? ((OpenFileHyperlinkInfo)info).getDescriptor() : null;
-      if (openFileDescriptor == null && !openFileDescriptor.getFile().isValid()) {
+      if (openFileDescriptor == null || !openFileDescriptor.getFile().isValid()) {
         return null;
       }
       return openFileDescriptor;
