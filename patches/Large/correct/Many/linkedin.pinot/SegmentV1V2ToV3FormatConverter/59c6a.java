diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/converter/SegmentV1V2ToV3FormatConverter.java b/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/converter/SegmentV1V2ToV3FormatConverter.java
index 6e2b936..240c875 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/converter/SegmentV1V2ToV3FormatConverter.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/converter/SegmentV1V2ToV3FormatConverter.java
@@ -172,7 +172,7 @@
       throws IOException {
 
     PinotDataBuffer oldBuffer = reader.getIndexFor(column, indexType);
-    Preconditions.checkState(oldBuffer.size() > 0 && oldBuffer.size() < Integer.MAX_VALUE,
+    Preconditions.checkState(oldBuffer.size() >= 0 && oldBuffer.size() < Integer.MAX_VALUE,
         "Buffer sizes of greater than 2GB is not supported. segment: " + reader.toString() +
             ", column: " + column);
     PinotDataBuffer newDictBuffer =
