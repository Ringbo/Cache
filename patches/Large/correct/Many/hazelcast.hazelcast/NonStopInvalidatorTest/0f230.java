diff --git a/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/NonStopInvalidatorTest.java b/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/NonStopInvalidatorTest.java
index 2a8637e..5f7e91a 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/NonStopInvalidatorTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/NonStopInvalidatorTest.java
@@ -33,7 +33,7 @@
 public class NonStopInvalidatorTest extends AbstractInvalidatorTest {
 
     @Override
-    Invalidator createInvalidator(NodeEngineImpl nodeEngine) {
+    public Invalidator createInvalidator(NodeEngineImpl nodeEngine) {
         return new NonStopInvalidator(MapService.SERVICE_NAME, TRUE_FILTER, nodeEngine);
     }
 }
