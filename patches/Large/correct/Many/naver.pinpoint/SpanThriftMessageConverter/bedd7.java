diff --git a/profiler/src/main/java/com/navercorp/pinpoint/profiler/context/thrift/SpanThriftMessageConverter.java b/profiler/src/main/java/com/navercorp/pinpoint/profiler/context/thrift/SpanThriftMessageConverter.java
index 4920e05..41b11df 100644
--- a/profiler/src/main/java/com/navercorp/pinpoint/profiler/context/thrift/SpanThriftMessageConverter.java
+++ b/profiler/src/main/java/com/navercorp/pinpoint/profiler/context/thrift/SpanThriftMessageConverter.java
@@ -204,7 +204,7 @@
         if (spanEvent.getDepth() != -1) {
             tSpanEvent.setDepth(spanEvent.getDepth());
         }
-        if (spanEvent.getNextSpanId() == -1) {
+        if (spanEvent.getNextSpanId() != -1) {
             tSpanEvent.setNextSpanId(spanEvent.getNextSpanId());
         }
 
