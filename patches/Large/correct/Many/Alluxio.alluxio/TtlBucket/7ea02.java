diff --git a/core/server/master/src/main/java/alluxio/master/file/meta/TtlBucket.java b/core/server/master/src/main/java/alluxio/master/file/meta/TtlBucket.java
index dba7abc..5144c22 100644
--- a/core/server/master/src/main/java/alluxio/master/file/meta/TtlBucket.java
+++ b/core/server/master/src/main/java/alluxio/master/file/meta/TtlBucket.java
@@ -30,7 +30,7 @@
 public final class TtlBucket implements Comparable<TtlBucket> {
   /** The time interval of this bucket is the same as ttl checker's interval. */
   private static long sTtlIntervalMs =
-      Configuration.getInt(PropertyKey.MASTER_TTL_CHECKER_INTERVAL_MS);
+      Configuration.getMs(PropertyKey.MASTER_TTL_CHECKER_INTERVAL_MS);
   /**
    * Each bucket has a time to live interval, this value is the start of the interval, interval
    * value is the same as the configuration of {@link PropertyKey#MASTER_TTL_CHECKER_INTERVAL_MS}.
