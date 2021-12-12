diff --git a/api/src/main/java/net/md_5/bungee/api/AbstractReconnectHandler.java b/api/src/main/java/net/md_5/bungee/api/AbstractReconnectHandler.java
index 678f82b..2adcd57 100644
--- a/api/src/main/java/net/md_5/bungee/api/AbstractReconnectHandler.java
+++ b/api/src/main/java/net/md_5/bungee/api/AbstractReconnectHandler.java
@@ -35,7 +35,7 @@
 
         String forced = con.getListener().getForcedHosts().get( con.getVirtualHost().getHostString() );
 
-        if ( forced == null || con.getListener().isForceDefault() )
+        if ( forced == null && con.getListener().isForceDefault() )
         {
             forced = con.getListener().getDefaultServer();
         }
