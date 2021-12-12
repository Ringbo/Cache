diff --git a/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/MxmlWriterTest.java b/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/MxmlWriterTest.java
index 79e2cc1..de6724c 100644
--- a/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/MxmlWriterTest.java
+++ b/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/MxmlWriterTest.java
@@ -63,7 +63,7 @@
       if (name.charAt(0) == '.') {
         // skip
       }
-      else if (name.endsWith(".mxml") && !name.startsWith("TestApp.")) {
+      else if (name.endsWith(".mxml") && !name.startsWith("TestApp.") && !name.startsWith("Constructor.")) {
         files.add(parent.getPath() + "/" + name);
       }
       File file = new File(parent, name);
