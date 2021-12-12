diff --git a/nd4j-api/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java b/nd4j-api/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java
index cc235a2..b667d20 100644
--- a/nd4j-api/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java
+++ b/nd4j-api/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java
@@ -730,7 +730,7 @@
     protected void doWriteObject(java.io.ObjectOutputStream out) throws IOException {
         out.defaultWriteObject();
         out.writeUTF(allocationMode.name());
-        out.writeLong(length());
+        out.writeInt(length());
         out.writeUTF(dataType().name());
         if(dataType() == Type.DOUBLE) {
             for(int i = 0; i < length(); i++)
