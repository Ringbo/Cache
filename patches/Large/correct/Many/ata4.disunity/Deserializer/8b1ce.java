diff --git a/src/info/ata4/unity/serdes/Deserializer.java b/src/info/ata4/unity/serdes/Deserializer.java
index b418c66..4340d47 100644
--- a/src/info/ata4/unity/serdes/Deserializer.java
+++ b/src/info/ata4/unity/serdes/Deserializer.java
@@ -192,7 +192,7 @@
         
         // use wrapped ByteBuffers for raw byte arrays, which is much faster and
         // more efficient than a list of Integer objects
-        if (dataField.type.equals("UInt8")) {
+        if (dataField.type.equals("UInt8") || dataField.type.equals("char")) {
             ByteBuffer raw = ByteBuffer.wrap(in.readByteArray(size));
             uarray.setRaw(raw);
         } else {
