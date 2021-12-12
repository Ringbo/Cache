diff --git a/proxy/src/main/java/net/md_5/bungee/entitymap/EntityMap_1_12_1.java b/proxy/src/main/java/net/md_5/bungee/entitymap/EntityMap_1_12_1.java
index 72fea42..95a944e 100644
--- a/proxy/src/main/java/net/md_5/bungee/entitymap/EntityMap_1_12_1.java
+++ b/proxy/src/main/java/net/md_5/bungee/entitymap/EntityMap_1_12_1.java
@@ -43,7 +43,7 @@
         addRewrite( 0x4E, ProtocolConstants.Direction.TO_CLIENT, true ); // Entity Properties : PacketPlayOutUpdateAttributes
         addRewrite( 0x4F, ProtocolConstants.Direction.TO_CLIENT, true ); // Entity Effect : PacketPlayOutEntityEffect
 
-        addRewrite( 0x0B, ProtocolConstants.Direction.TO_SERVER, true ); // Use Entity : PacketPlayInUseEntity
+        addRewrite( 0x0A, ProtocolConstants.Direction.TO_SERVER, true ); // Use Entity : PacketPlayInUseEntity
         addRewrite( 0x15, ProtocolConstants.Direction.TO_SERVER, true ); // Entity Action : PacketPlayInEntityAction
     }
 
