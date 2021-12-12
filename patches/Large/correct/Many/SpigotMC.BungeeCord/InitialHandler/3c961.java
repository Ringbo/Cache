diff --git a/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java b/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java
index 8b18164..9d58b2f 100644
--- a/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java
+++ b/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java
@@ -198,10 +198,10 @@
         this.vHost = new InetSocketAddress( handshake.getHost(), handshake.getPort() );
         bungee.getLogger().log( Level.INFO, "{0} has connected", this );
 
-        if ( handshake.getProcolVersion() > Vanilla.PROTOCOL_VERSION )
+        if ( handshake.getProtocolVersion() > Vanilla.PROTOCOL_VERSION )
         {
             disconnect( bungee.getTranslation( "outdated_server" ) );
-        } else if ( handshake.getProcolVersion() < Vanilla.PROTOCOL_VERSION )
+        } else if ( handshake.getProtocolVersion() < Vanilla.PROTOCOL_VERSION )
         {
             disconnect( bungee.getTranslation( "outdated_client" ) );
         }
@@ -381,7 +381,7 @@
     @Override
     public byte getVersion()
     {
-        return ( handshake == null ) ? version : handshake.getProcolVersion();
+        return ( handshake == null ) ? version : handshake.getProtocolVersion();
     }
 
     @Override
