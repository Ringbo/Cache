diff --git a/protocol/src/main/java/net/md_5/bungee/protocol/packet/Team.java b/protocol/src/main/java/net/md_5/bungee/protocol/packet/Team.java
index 91db862..be9c71f 100644
--- a/protocol/src/main/java/net/md_5/bungee/protocol/packet/Team.java
+++ b/protocol/src/main/java/net/md_5/bungee/protocol/packet/Team.java
@@ -54,7 +54,7 @@
         }
         if ( mode == 0 || mode == 3 || mode == 4 )
         {
-            int len = ( protocolVersion >= 7 ) ? readVarInt( buf ) : buf.readInt();
+            int len = ( protocolVersion >= 7 ) ? readVarInt( buf ) : buf.readShort();
             players = new String[ len ];
             for ( int i = 0; i < len; i++ )
             {
