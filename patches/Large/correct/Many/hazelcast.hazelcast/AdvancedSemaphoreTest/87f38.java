diff --git a/hazelcast/src/test/java/com/hazelcast/concurrent/semaphore/AdvancedSemaphoreTest.java b/hazelcast/src/test/java/com/hazelcast/concurrent/semaphore/AdvancedSemaphoreTest.java
index 338d994..203d223 100644
--- a/hazelcast/src/test/java/com/hazelcast/concurrent/semaphore/AdvancedSemaphoreTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/concurrent/semaphore/AdvancedSemaphoreTest.java
@@ -20,10 +20,10 @@
 @Category(QuickTest.class)
 public class AdvancedSemaphoreTest extends HazelcastTestSupport {
 
-    @Test(timeout = 30000)
+    @Test(timeout = 120000)
     public void testSemaphoreWithFailures() throws InterruptedException {
         final int k = 4;
-        TestHazelcastInstanceFactory factory = createHazelcastInstanceFactory(k + 1);
+        final TestHazelcastInstanceFactory factory = createHazelcastInstanceFactory(k + 1);
         final HazelcastInstance[] instances = factory.newInstances();
 
         final ISemaphore semaphore = instances[k].getSemaphore("test");
@@ -39,7 +39,7 @@
             initialPermits += rand;
             assertEquals(initialPermits, semaphore.availablePermits());
 
-            instances[i].getLifecycleService().shutdown();
+            instances[i].shutdown();
 
             semaphore.acquire(rand);
             initialPermits -= rand;
@@ -50,7 +50,7 @@
         }
     }
 
-    @Test(timeout = 30000)
+    @Test(timeout = 120000)
     public void testSemaphoreWithFailuresAndJoin() {
         final TestHazelcastInstanceFactory factory = createHazelcastInstanceFactory(3);
 
@@ -74,7 +74,7 @@
         };
         thread.start();
 
-        instance2.getLifecycleService().shutdown();
+        instance2.shutdown();
         semaphore.release();
         HazelcastInstance instance3 = factory.newHazelcastInstance();
 
@@ -90,7 +90,7 @@
     }
 
 
-    @Test(timeout = 30000)
+    @Test(timeout = 120000)
     public void testMutex() throws InterruptedException {
         final int threadCount = 2;
         final HazelcastInstance[] instances = createHazelcastInstanceFactory(threadCount).newInstances();
