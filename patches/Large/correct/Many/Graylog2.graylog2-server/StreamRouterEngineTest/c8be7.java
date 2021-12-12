diff --git a/graylog2-server/src/test/java/org/graylog2/streams/StreamRouterEngineTest.java b/graylog2-server/src/test/java/org/graylog2/streams/StreamRouterEngineTest.java
index caea4e5..3ab81c7 100644
--- a/graylog2-server/src/test/java/org/graylog2/streams/StreamRouterEngineTest.java
+++ b/graylog2-server/src/test/java/org/graylog2/streams/StreamRouterEngineTest.java
@@ -517,7 +517,7 @@
         when(message.getField(eq(dummyField))).thenReturn(dummyValue);
         when(message.getFieldNames()).thenReturn(Sets.newHashSet(dummyField));
 
-        final StreamRouterEngine engine = newEngine(Lists.newArrayList(stream1));
+        final StreamRouterEngine engine = newEngine(Lists.newArrayList(stream1, stream2));
 
         final List<Stream> result = engine.match(message);
 
