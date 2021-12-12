diff --git a/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/SocketInputHandlerImpl.java b/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/SocketInputHandlerImpl.java
index b2db2f3..0ec6681 100644
--- a/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/SocketInputHandlerImpl.java
+++ b/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/SocketInputHandlerImpl.java
@@ -495,7 +495,7 @@
       amfOut.write(property.getUnescapedValue());
     }
 
-    amfOut.getByteArrayOut().writeTo(amfOut);
+    amfOut.getByteArrayOut().writeTo(out);
   }
 
   private void getBitmapData() throws IOException {
