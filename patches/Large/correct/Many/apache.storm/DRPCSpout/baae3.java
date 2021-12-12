diff --git a/src/jvm/backtype/storm/drpc/DRPCSpout.java b/src/jvm/backtype/storm/drpc/DRPCSpout.java
index 67d619b..9e3ea24 100644
--- a/src/jvm/backtype/storm/drpc/DRPCSpout.java
+++ b/src/jvm/backtype/storm/drpc/DRPCSpout.java
@@ -63,7 +63,7 @@
 
             int port = Utils.getInt(conf.get(Config.DRPC_INVOCATIONS_PORT));
             List<String> servers = (List<String>) conf.get(Config.DRPC_SERVERS);
-            if(servers.isEmpty()) {
+            if(servers == null || servers.isEmpty()) {
                 throw new RuntimeException("No DRPC servers configured for topology");   
             }
             if(numTasks < servers.size()) {
