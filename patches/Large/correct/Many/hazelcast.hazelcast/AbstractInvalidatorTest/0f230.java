diff --git a/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/AbstractInvalidatorTest.java b/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/AbstractInvalidatorTest.java
index 3ddb54b..4154e17 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/AbstractInvalidatorTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/invalidation/AbstractInvalidatorTest.java
@@ -28,7 +28,7 @@
 import static com.hazelcast.internal.nearcache.NearCacheTestUtils.getBaseConfig;
 import static org.mockito.Mockito.mock;
 
-abstract class AbstractInvalidatorTest extends HazelcastTestSupport {
+public abstract class AbstractInvalidatorTest extends HazelcastTestSupport {
 
     private Invalidator invalidator;
     private Data key;
@@ -42,7 +42,7 @@
         key = mock(Data.class);
     }
 
-    abstract Invalidator createInvalidator(NodeEngineImpl nodeEngine);
+    public abstract Invalidator createInvalidator(NodeEngineImpl nodeEngine);
 
     @Test(expected = NullPointerException.class)
     public void testInvalidate_withInvalidKey() {
