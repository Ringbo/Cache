diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CompressionNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CompressionNode.java
index a1b1920..bde13a7 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CompressionNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CompressionNode.java
@@ -42,7 +42,7 @@
 @NodeInfo(nameTemplate = "{p#op/s}")
 public class CompressionNode extends ConvertNode implements LIRLowerable {
 
-    private enum CompressionOp {
+    enum CompressionOp {
         Compress,
         Uncompress
     }
@@ -50,7 +50,7 @@
     private final CompressionOp op;
     private final CompressEncoding encoding;
 
-    private CompressionNode(CompressionOp op, ValueNode input, CompressEncoding encoding) {
+    CompressionNode(CompressionOp op, ValueNode input, CompressEncoding encoding) {
         super(mkStamp(op, input.stamp(), encoding), input);
         this.op = op;
         this.encoding = encoding;
