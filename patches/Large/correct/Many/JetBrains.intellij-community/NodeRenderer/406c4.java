diff --git a/platform/platform-api/src/com/intellij/ide/util/treeView/NodeRenderer.java b/platform/platform-api/src/com/intellij/ide/util/treeView/NodeRenderer.java
index db896eb..a07370e 100644
--- a/platform/platform-api/src/com/intellij/ide/util/treeView/NodeRenderer.java
+++ b/platform/platform-api/src/com/intellij/ide/util/treeView/NodeRenderer.java
@@ -73,7 +73,7 @@
             if (textAttributesKey != null) {
               final TextAttributes forcedAttributes = getColorsScheme().getAttributes(textAttributesKey);
               if (forcedAttributes != null) {
-                simpleTextAttributes = SimpleTextAttributes.merge(SimpleTextAttributes.fromTextAttributes(forcedAttributes), simpleTextAttributes);
+                simpleTextAttributes = SimpleTextAttributes.merge(simpleTextAttributes, SimpleTextAttributes.fromTextAttributes(forcedAttributes));
               }
             }
             first = false;
