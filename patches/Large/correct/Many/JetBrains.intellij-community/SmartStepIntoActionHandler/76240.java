diff --git a/java/debugger/impl/src/com/intellij/debugger/actions/SmartStepIntoActionHandler.java b/java/debugger/impl/src/com/intellij/debugger/actions/SmartStepIntoActionHandler.java
index 2dafdfc..d656c07 100644
--- a/java/debugger/impl/src/com/intellij/debugger/actions/SmartStepIntoActionHandler.java
+++ b/java/debugger/impl/src/com/intellij/debugger/actions/SmartStepIntoActionHandler.java
@@ -102,7 +102,7 @@
     final TextRange lineRange = new TextRange(startOffset, doc.getLineEndOffset(line));
     final int offset = CharArrayUtil.shiftForward(doc.getCharsSequence(), startOffset, " \t");
     PsiElement element = file.findElementAt(offset);
-    if (element != null) {
+    if (element != null && !(element instanceof PsiCompiledElement)) {
       do {
         final PsiElement parent = element.getParent();
         if (parent == null || (parent.getTextOffset() < lineRange.getStartOffset())) {
