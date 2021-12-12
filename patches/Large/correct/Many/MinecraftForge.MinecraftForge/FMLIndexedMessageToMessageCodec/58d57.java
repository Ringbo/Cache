diff --git a/src/main/java/net/minecraftforge/fml/common/network/FMLIndexedMessageToMessageCodec.java b/src/main/java/net/minecraftforge/fml/common/network/FMLIndexedMessageToMessageCodec.java
index e30d8cb..490b2d8 100644
--- a/src/main/java/net/minecraftforge/fml/common/network/FMLIndexedMessageToMessageCodec.java
+++ b/src/main/java/net/minecraftforge/fml/common/network/FMLIndexedMessageToMessageCodec.java
@@ -73,7 +73,7 @@
         Class<?> clazz = msg.getClass();
         if (!types.containsKey(clazz))
         {
-            throw new RuntimeException("Undefined discriminator for message type " + clazz.getSimpleName() + " in channel " + channel);
+            throw new RuntimeException("Undefined discriminator for message type " + clazz.getName() + " in channel " + channel);
         }
         byte discriminator = types.getByte(clazz);
         PacketBuffer buffer = new PacketBuffer(Unpooled.buffer());
