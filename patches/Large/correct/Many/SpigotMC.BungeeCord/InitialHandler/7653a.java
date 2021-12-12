diff --git a/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java b/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java
index e596f82..559787e 100644
--- a/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java
+++ b/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java
@@ -142,7 +142,7 @@
     public void handle(LegacyHandshake legacyHandshake) throws Exception
     {
         this.legacy = true;
-        ch.close( bungee.getTranslation( "outdated_client" ) );
+        ch.close( bungee.getTranslation( "outdated_client", bungee.getGameVersion() ) );
     }
 
     @Override
@@ -301,10 +301,10 @@
                 {
                     if ( handshake.getProtocolVersion() > bungee.getProtocolVersion() )
                     {
-                        disconnect( bungee.getTranslation( "outdated_server" ) );
+                        disconnect( bungee.getTranslation( "outdated_server", bungee.getGameVersion() ) );
                     } else
                     {
-                        disconnect( bungee.getTranslation( "outdated_client" ) );
+                        disconnect( bungee.getTranslation( "outdated_client", bungee.getGameVersion() ) );
                     }
                     return;
                 }
