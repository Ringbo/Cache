diff --git a/src/java/voldemort/server/VoldemortConfig.java b/src/java/voldemort/server/VoldemortConfig.java
index 0827628..d932576 100644
--- a/src/java/voldemort/server/VoldemortConfig.java
+++ b/src/java/voldemort/server/VoldemortConfig.java
@@ -158,7 +158,7 @@
         this.bdbFlushTransactions = props.getBoolean("bdb.flush.transactions", false);
         this.bdbDataDirectory = props.getString("bdb.data.directory", this.dataDirectory
                                                                       + File.separator + "bdb");
-        this.bdbMaxLogFileSize = props.getBytes("bdb.max.logfile.size", 1024 * 1024 * 1024);
+        this.bdbMaxLogFileSize = props.getBytes("bdb.max.logfile.size", 60 * 1024 * 1024);
         this.bdbBtreeFanout = props.getInt("bdb.btree.fanout", 512);
         this.bdbCheckpointBytes = props.getLong("bdb.checkpoint.interval.bytes", 20 * 1024 * 1024);
         this.bdbCheckpointMs = props.getLong("bdb.checkpoint.interval.ms", 30 * Time.MS_PER_SECOND);
@@ -401,7 +401,7 @@
 
     /**
      * The maximum size of a single .jdb log file in bytes. Given by
-     * "bdb.max.logfile.size" default: 1G
+     * "bdb.max.logfile.size" default: 60MB
      */
     public long getBdbMaxLogFileSize() {
         return this.bdbMaxLogFileSize;
