diff --git a/plugins/ui-designer-core/src/com/intellij/designer/componentTree/TreeTransfer.java b/plugins/ui-designer-core/src/com/intellij/designer/componentTree/TreeTransfer.java
index 137c565..2644fbb 100644
--- a/plugins/ui-designer-core/src/com/intellij/designer/componentTree/TreeTransfer.java
+++ b/plugins/ui-designer-core/src/com/intellij/designer/componentTree/TreeTransfer.java
@@ -28,11 +28,11 @@
  * @author Alexander Lobas
  */
 public final class TreeTransfer extends TransferHandler implements Transferable {
-  private static final DataFlavor DATA_FLAVOR = FileCopyPasteUtil.createDataFlavor(DataFlavor.javaJVMLocalObjectMimeType);
+  private static final DataFlavor DATA_FLAVOR = FileCopyPasteUtil.createDataFlavor(DataFlavor.javaJVMLocalObjectMimeType, Class.class);
 
   private Object myData;
 
-  public TreeTransfer(Object data) {
+  public TreeTransfer(Class data) {
     myData = data;
   }
 
