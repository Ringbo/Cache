diff --git a/src/tsd/RTPublisher.java b/src/tsd/RTPublisher.java
index 251192e..551267e 100644
--- a/src/tsd/RTPublisher.java
+++ b/src/tsd/RTPublisher.java
@@ -97,7 +97,7 @@
   public final Deferred<Object> sinkDataPoint(final String metric, 
       final long timestamp, final byte[] value, final Map<String, String> tags, 
       final byte[] tsuid, final short flags) {
-    if ((flags & Const.FLAG_FLOAT) == 0x0) {
+    if ((flags & Const.FLAG_FLOAT) != 0x0) {
       return publishDataPoint(metric, timestamp, 
           Internal.extractFloatingPointValue(value, 0, (byte) flags), 
           tags, tsuid);
