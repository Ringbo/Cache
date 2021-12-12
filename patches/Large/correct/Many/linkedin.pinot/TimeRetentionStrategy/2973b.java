diff --git a/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/strategy/TimeRetentionStrategy.java b/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/strategy/TimeRetentionStrategy.java
index ad6aa8a..54e9c69 100644
--- a/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/strategy/TimeRetentionStrategy.java
+++ b/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/strategy/TimeRetentionStrategy.java
@@ -66,16 +66,16 @@
         return false;
       }
 
-      long endsMills = segmentTimeUnit.toMillis(segmentZKMetadata.getEndTime());
+      long endsMillis = segmentTimeUnit.toMillis(segmentZKMetadata.getEndTime());
 
       // Check that the date in the segment is between 1971 and 2071, as a sanity check for misconfigured time units.
-      if (!TimeUtils.timeValueInValidRange(segmentZKMetadata.getEndTime())) {
+      if (!TimeUtils.timeValueInValidRange(endsMillis)) {
         LOGGER.warn("Skipping purge check for segment {}, timestamp {} {} fails sanity check.",
             segmentZKMetadata.getSegmentName(), segmentZKMetadata.getEndTime(), segmentZKMetadata.getTimeUnit());
         return false;
       }
 
-      Duration segmentTimeUntilNow = new Duration(endsMills, System.currentTimeMillis());
+      Duration segmentTimeUntilNow = new Duration(endsMillis, System.currentTimeMillis());
       if (_retentionDuration.isShorterThan(segmentTimeUntilNow)) {
         return true;
       }
