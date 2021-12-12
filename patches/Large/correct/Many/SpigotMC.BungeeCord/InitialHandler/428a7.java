diff --git a/src/main/java/net/md_5/bungee/InitialHandler.java b/src/main/java/net/md_5/bungee/InitialHandler.java
index 5977267..974a77c 100644
--- a/src/main/java/net/md_5/bungee/InitialHandler.java
+++ b/src/main/java/net/md_5/bungee/InitialHandler.java
@@ -57,7 +57,7 @@
                     }
 
                     // fire post auth event
-                    BungeeCord.instance.pluginManager.onHandshake(event);
+                    BungeeCord.instance.pluginManager.onLogin(event);
                     if (event.isCancelled())
                     {
                         throw new KickException(event.getCancelReason());
