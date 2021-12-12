diff --git a/indexing-service/src/main/java/io/druid/indexing/firehose/IngestSegmentFirehoseFactory.java b/indexing-service/src/main/java/io/druid/indexing/firehose/IngestSegmentFirehoseFactory.java
index ca496d3..94adbc0 100644
--- a/indexing-service/src/main/java/io/druid/indexing/firehose/IngestSegmentFirehoseFactory.java
+++ b/indexing-service/src/main/java/io/druid/indexing/firehose/IngestSegmentFirehoseFactory.java
@@ -177,7 +177,7 @@
       } else {
         Set<String> metricsSet = new HashSet<>();
         for (TimelineObjectHolder<String, DataSegment> timelineObjectHolder : timeLineSegments) {
-          metricsSet.addAll(timelineObjectHolder.getObject().getChunk(0).getObject().getDimensions());
+          metricsSet.addAll(timelineObjectHolder.getObject().getChunk(0).getObject().getMetrics());
         }
         metricsList = Lists.newArrayList(metricsSet);
       }
