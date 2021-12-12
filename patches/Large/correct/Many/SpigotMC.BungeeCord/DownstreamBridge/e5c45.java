diff --git a/proxy/src/main/java/net/md_5/bungee/connection/DownstreamBridge.java b/proxy/src/main/java/net/md_5/bungee/connection/DownstreamBridge.java
index 5a4cc43..ba414d1 100644
--- a/proxy/src/main/java/net/md_5/bungee/connection/DownstreamBridge.java
+++ b/proxy/src/main/java/net/md_5/bungee/connection/DownstreamBridge.java
@@ -153,10 +153,10 @@
         if ( team.mode == 0 )
         {
             t = new Team( team.name );
-            con.serverSentScoreboard.addTeam( team );
+            con.serverSentScoreboard.addTeam( t );
         } else
         {
-            con.serverSentScoreboard.getTeam( team.name );
+            t = con.serverSentScoreboard.getTeam( team.name );
         }
         
         if ( t != null )
