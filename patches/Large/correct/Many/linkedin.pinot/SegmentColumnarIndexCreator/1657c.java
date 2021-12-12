diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/segment/creator/impl/SegmentColumnarIndexCreator.java b/pinot-core/src/main/java/com/linkedin/pinot/core/segment/creator/impl/SegmentColumnarIndexCreator.java
index 5d15521..8e048a4 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/segment/creator/impl/SegmentColumnarIndexCreator.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/segment/creator/impl/SegmentColumnarIndexCreator.java
@@ -208,7 +208,7 @@
       properties.setProperty(SEGMENT_START_TIME, config.getStartTime());
     }
     if (config.containsKey(SEGMENT_END_TIME)) {
-      properties.setProperty(SEGMENT_END_TIME, config.getStartTime());
+      properties.setProperty(SEGMENT_END_TIME, config.getEndTime());
     }
     if (config.containsKey(TIME_UNIT)) {
       properties.setProperty(TIME_UNIT, config.getTimeUnitForSegment());
