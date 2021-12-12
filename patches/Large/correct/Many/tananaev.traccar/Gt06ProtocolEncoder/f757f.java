diff --git a/src/org/traccar/protocol/Gt06ProtocolEncoder.java b/src/org/traccar/protocol/Gt06ProtocolEncoder.java
index 82c689d..b879163 100644
--- a/src/org/traccar/protocol/Gt06ProtocolEncoder.java
+++ b/src/org/traccar/protocol/Gt06ProtocolEncoder.java
@@ -38,7 +38,7 @@
         buf.writeInt(0);
         buf.writeBytes(content.getBytes()); // command
 
-        buf.writeShort(1); // message index
+        buf.writeShort(0); // message index
 
         buf.writeShort(Crc.crc16Ccitt(buf.toByteBuffer(2, buf.writerIndex() - 2)));
 
@@ -53,9 +53,9 @@
         
         switch (command.getType()) {
             case Command.TYPE_ENGINE_STOP:
-                return encodeContent("DYD#");
+                return encodeContent("RELAY,1#");
             case Command.TYPE_ENGINE_RESUME:
-                return encodeContent("HFYD#");
+                return encodeContent("RELAY,0#");
         }
 
         return null;
