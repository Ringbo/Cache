diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/code/MavenBackspaceHandlerDelegate.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/code/MavenBackspaceHandlerDelegate.java
index 1e62bf5..0150740 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/code/MavenBackspaceHandlerDelegate.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/code/MavenBackspaceHandlerDelegate.java
@@ -31,7 +31,7 @@
 
     int offset = editor.getCaretModel().getOffset();
     CharSequence text = editor.getDocument().getCharsSequence();
-    if (offset <= text.length() && text.charAt(offset) == '}') {
+    if (offset < text.length() && text.charAt(offset) == '}') {
       editor.getDocument().deleteString(offset, offset + 1);
       return true;
     }
