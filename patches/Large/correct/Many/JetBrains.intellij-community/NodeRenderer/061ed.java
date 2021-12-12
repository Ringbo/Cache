diff --git a/platform/platform-api/src/com/intellij/ide/util/treeView/NodeRenderer.java b/platform/platform-api/src/com/intellij/ide/util/treeView/NodeRenderer.java
index 60ee6b9..db896eb 100644
--- a/platform/platform-api/src/com/intellij/ide/util/treeView/NodeRenderer.java
+++ b/platform/platform-api/src/com/intellij/ide/util/treeView/NodeRenderer.java
@@ -58,7 +58,7 @@
       if (coloredText.isEmpty()) {
         String text = tree.convertValueToText(value.toString(), selected, expanded, leaf, row, hasFocus);
         SimpleTextAttributes simpleTextAttributes = getSimpleTextAttributes(node, presentation.getForcedTextForeground() != null ? presentation.getForcedTextForeground() : color);
-        append(text, simpleTextAttributes, selected);
+        append(text, simpleTextAttributes);
       }
       else {
         boolean first = true;
