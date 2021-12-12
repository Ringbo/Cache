diff --git a/proxy/src/main/java/net/md_5/bungee/entitymap/EntityMap_1_8.java b/proxy/src/main/java/net/md_5/bungee/entitymap/EntityMap_1_8.java
index d5df24c..9d020d3 100644
--- a/proxy/src/main/java/net/md_5/bungee/entitymap/EntityMap_1_8.java
+++ b/proxy/src/main/java/net/md_5/bungee/entitymap/EntityMap_1_8.java
@@ -161,7 +161,7 @@
         int packetId = DefinedPacket.readVarInt( packet );
         int packetIdLength = packet.readerIndex() - readerIndex;
 
-        if ( packetId == 0x18 /* Spectate */ )
+        if ( packetId == 0x18 /* Spectate */ && !BungeeCord.getInstance().getConfig().isIpForward())
         {
             UUID uuid = DefinedPacket.readUUID( packet );
             ProxiedPlayer player;
