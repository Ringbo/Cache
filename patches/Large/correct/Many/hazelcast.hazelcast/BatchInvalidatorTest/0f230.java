diff --git a/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/BatchInvalidatorTest.java b/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/BatchInvalidatorTest.java
index a877423..901c849 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/BatchInvalidatorTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/BatchInvalidatorTest.java
@@ -33,7 +33,7 @@
 public class BatchInvalidatorTest extends AbstractInvalidatorTest {
 
     @Override
-    Invalidator createInvalidator(NodeEngineImpl nodeEngine) {
+    public Invalidator createInvalidator(NodeEngineImpl nodeEngine) {
         return new BatchInvalidator(MapService.SERVICE_NAME, 100, 10, TRUE_FILTER, nodeEngine);
     }
 }
