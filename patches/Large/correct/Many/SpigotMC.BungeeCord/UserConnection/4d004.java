diff --git a/proxy/src/main/java/net/md_5/bungee/UserConnection.java b/proxy/src/main/java/net/md_5/bungee/UserConnection.java
index 3ac6396..b1874ab 100644
--- a/proxy/src/main/java/net/md_5/bungee/UserConnection.java
+++ b/proxy/src/main/java/net/md_5/bungee/UserConnection.java
@@ -431,7 +431,7 @@
         // Action bar on 1.8 doesn't display the new JSON formattings, legacy works - send it using this for now
         if ( position == ChatMessageType.ACTION_BAR && getPendingConnection().getVersion() <= ProtocolConstants.MINECRAFT_1_8 )
         {
-            sendMessage( position, ComponentSerializer.toString( new TextComponent( TextComponent.toLegacyText( message ) ) ) );
+            sendMessage( position, ComponentSerializer.toString( new TextComponent( BaseComponent.toLegacyText( message ) ) ) );
         } else
         {
             sendMessage( position, ComponentSerializer.toString( message ) );
@@ -444,7 +444,7 @@
         // Action bar on 1.8 doesn't display the new JSON formattings, legacy works - send it using this for now
         if ( position == ChatMessageType.ACTION_BAR && getPendingConnection().getVersion() <= ProtocolConstants.MINECRAFT_1_8 )
         {
-            sendMessage( position, ComponentSerializer.toString( new TextComponent( TextComponent.toLegacyText( message ) ) ) );
+            sendMessage( position, ComponentSerializer.toString( new TextComponent( BaseComponent.toLegacyText( message ) ) ) );
         } else
         {
             sendMessage( position, ComponentSerializer.toString( message ) );
