diff --git a/src/java/voldemort/server/VoldemortConfig.java b/src/java/voldemort/server/VoldemortConfig.java
index d7b586d..f0cdedc 100644
--- a/src/java/voldemort/server/VoldemortConfig.java
+++ b/src/java/voldemort/server/VoldemortConfig.java
@@ -461,7 +461,7 @@
         this.enablePruneJob = props.getBoolean("enable.prunejob", true);
         this.enableSlopPurgeJob = props.getBoolean("enable.slop.purge.job", true);
         this.enableJmxClusterName = props.getBoolean("enable.jmx.clustername", false);
-        this.enableQuotaLimiting = props.getBoolean("enable.quota.limiting", false);
+        this.enableQuotaLimiting = props.getBoolean("enable.quota.limiting", true);
 
         this.gossipIntervalMs = props.getInt("gossip.interval.ms", 30 * 1000);
 
