diff --git a/storm-core/src/jvm/backtype/storm/messaging/netty/Context.java b/storm-core/src/jvm/backtype/storm/messaging/netty/Context.java
index 8f2b17f..f592aff 100644
--- a/storm-core/src/jvm/backtype/storm/messaging/netty/Context.java
+++ b/storm-core/src/jvm/backtype/storm/messaging/netty/Context.java
@@ -63,7 +63,7 @@
                     Executors.newCachedThreadPool(workerFactory));
         }
         
-        int otherWorkers = Utils.getInt(storm_conf.get(Config.TOPOLOGY_WORKERS)) - 1;
+        int otherWorkers = Utils.getInt(storm_conf.get(Config.TOPOLOGY_WORKERS), 1) - 1;
         int poolSize = Math.min(Math.max(1, otherWorkers), MAX_CLIENT_SCHEDULER_THREAD_POOL_SIZE);
         clientScheduleService = Executors.newScheduledThreadPool(poolSize, new NettyRenameThreadFactory("client-schedule-service"));
     }
