diff --git a/components/camel-opentracing/src/test/java/org/apache/camel/opentracing/decorators/KafkaSpanDecoratorTest.java b/components/camel-opentracing/src/test/java/org/apache/camel/opentracing/decorators/KafkaSpanDecoratorTest.java
index 2c51def..0b731b3 100644
--- a/components/camel-opentracing/src/test/java/org/apache/camel/opentracing/decorators/KafkaSpanDecoratorTest.java
+++ b/components/camel-opentracing/src/test/java/org/apache/camel/opentracing/decorators/KafkaSpanDecoratorTest.java
@@ -92,7 +92,7 @@
 
     @Test
     public void testPrePartitionAsIntegerHeaderAndOffsetAsLongHeader() {
-        Long testOffset = 4875454l;
+        Long testOffset = 4875454L;
         Integer testPartition = 0;
 
         Endpoint endpoint = Mockito.mock(Endpoint.class);
