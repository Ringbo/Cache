diff --git a/external/storm-hbase/src/main/java/org/apache/storm/hbase/bolt/HBaseBolt.java b/external/storm-hbase/src/main/java/org/apache/storm/hbase/bolt/HBaseBolt.java
index 34e2eba..d470892 100644
--- a/external/storm-hbase/src/main/java/org/apache/storm/hbase/bolt/HBaseBolt.java
+++ b/external/storm-hbase/src/main/java/org/apache/storm/hbase/bolt/HBaseBolt.java
@@ -78,13 +78,13 @@
             conf = new Config();
         }
 
-        if (conf.containsKey("topology.message.timeout.secs") && tickTupleInterval == 0) {
+        if (conf.containsKey("topology.message.timeout.secs") && flushIntervalSecs == 0) {
             Integer topologyTimeout = Integer.parseInt(conf.get("topology.message.timeout.secs").toString());
             flushIntervalSecs = (int)(Math.floor(topologyTimeout / 2));
-            LOG.debug("Setting flush interval to [" + flushIntervalSecs + "] based on topology.message.timeout.secs");
+            LOG.debug("Setting flush interval to [{}] based on topology.message.timeout.secs", flushIntervalSecs);
         }
 
-        LOG.info("Enabling tick tuple with interval [" + flushIntervalSecs + "]");
+        LOG.info("Enabling tick tuple with interval [{}]", flushIntervalSecs);
         conf.put(Config.TOPOLOGY_TICK_TUPLE_FREQ_SECS, flushIntervalSecs);
         return conf;
     }
