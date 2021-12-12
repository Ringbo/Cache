diff --git a/server/src/main/java/com/metamx/druid/master/SegmentReplicantLookup.java b/server/src/main/java/com/metamx/druid/master/SegmentReplicantLookup.java
index 41553b4..5607872 100644
--- a/server/src/main/java/com/metamx/druid/master/SegmentReplicantLookup.java
+++ b/server/src/main/java/com/metamx/druid/master/SegmentReplicantLookup.java
@@ -52,7 +52,7 @@
 
         // Also account for queued segments
         for (DataSegment segment : serverHolder.getPeon().getSegmentsToLoad()) {
-          Integer numReplicants = segmentsInCluster.get(segment.getIdentifier(), server.getTier());
+          Integer numReplicants = loadingSegments.get(segment.getIdentifier(), server.getTier());
           if (numReplicants == null) {
             numReplicants = 0;
           }
