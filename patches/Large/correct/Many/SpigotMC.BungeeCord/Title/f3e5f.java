diff --git a/protocol/src/main/java/net/md_5/bungee/protocol/packet/Title.java b/protocol/src/main/java/net/md_5/bungee/protocol/packet/Title.java
index 48ef530..89ba7a3 100644
--- a/protocol/src/main/java/net/md_5/bungee/protocol/packet/Title.java
+++ b/protocol/src/main/java/net/md_5/bungee/protocol/packet/Title.java
@@ -31,7 +31,7 @@
         int index = readVarInt( buf );
 
         // If we're working on 1.10 or lower, increment the value of the index so we pull out the correct value.
-        if ( protocolVersion <= ProtocolConstants.MINECRAFT_1_10 && index <= 2 )
+        if ( protocolVersion <= ProtocolConstants.MINECRAFT_1_10 && index >= 2 )
         {
             index++;
         }
@@ -58,9 +58,9 @@
         int index = action.ordinal();
 
         // If we're working on 1.10 or lower, increment the value of the index so we pull out the correct value.
-        if ( protocolVersion <= ProtocolConstants.MINECRAFT_1_10 && index <= 2 )
+        if ( protocolVersion <= ProtocolConstants.MINECRAFT_1_10 && index >= 2 )
         {
-            index++;
+            index--;
         }
 
         writeVarInt( index, buf );
