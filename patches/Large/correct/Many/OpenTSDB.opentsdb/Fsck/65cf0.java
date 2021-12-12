diff --git a/src/tools/Fsck.java b/src/tools/Fsck.java
index 8347000..fe97bf2 100644
--- a/src/tools/Fsck.java
+++ b/src/tools/Fsck.java
@@ -618,7 +618,7 @@
       boolean has_milliseconds = false;
       boolean has_duplicates = false;
       boolean has_uncorrected_value_error = false;
-      long timestamp = Long.MIN_VALUE;
+      long timestamp = Long.MAX_VALUE;
 
       for (final Map.Entry<Long, ArrayList<DP>> time_map : datapoints.entrySet()) {
         if (key == null) {
@@ -676,7 +676,7 @@
         }
 
         unique_columns.put(dp_to_keep.kv.qualifier(), dp_to_keep.kv.value());
-        timestamp = Math.max(timestamp, dp_to_keep.kv.timestamp());
+        timestamp = Math.min(timestamp, dp_to_keep.kv.timestamp());
         valid_datapoints.getAndIncrement();
         has_uncorrected_value_error |= Internal.isFloat(dp_to_keep.qualifier()) ?
             fsckFloat(dp_to_keep) : fsckInteger(dp_to_keep);
