diff --git a/curator-recipes/src/test/java/com/netflix/curator/framework/recipes/locks/TestInterProcessSemaphore.java b/curator-recipes/src/test/java/com/netflix/curator/framework/recipes/locks/TestInterProcessSemaphore.java
index daccfea..a6509fc 100644
--- a/curator-recipes/src/test/java/com/netflix/curator/framework/recipes/locks/TestInterProcessSemaphore.java
+++ b/curator-recipes/src/test/java/com/netflix/curator/framework/recipes/locks/TestInterProcessSemaphore.java
@@ -230,7 +230,7 @@
             Assert.assertFalse(semaphore.acquire(1, TimeUnit.SECONDS));
 
             leases.remove(0).release();
-            Assert.assertNotNull(semaphore.acquire(3, TimeUnit.SECONDS));
+            Assert.assertTrue(semaphore.acquire(3, TimeUnit.SECONDS));
         }
         finally
         {
