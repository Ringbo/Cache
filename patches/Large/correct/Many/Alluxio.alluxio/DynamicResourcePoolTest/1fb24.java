diff --git a/core/common/src/test/java/alluxio/resource/DynamicResourcePoolTest.java b/core/common/src/test/java/alluxio/resource/DynamicResourcePoolTest.java
index da8a3f1..9522e96 100644
--- a/core/common/src/test/java/alluxio/resource/DynamicResourcePoolTest.java
+++ b/core/common/src/test/java/alluxio/resource/DynamicResourcePoolTest.java
@@ -55,7 +55,7 @@
 
     @Override
     protected boolean shouldGc(ResourceInternal<Resource> resourceInternal) {
-      return System.currentTimeMillis() - resourceInternal.getLastAccessTimeMs()
+      return mClock.millis() - resourceInternal.getLastAccessTimeMs()
           >= (long) mGcThresholdInSecs * (long) Constants.SECOND_MS;
     }
 
@@ -201,7 +201,7 @@
     resourceList.add(pool.acquire());
 
     pool.release(resourceList.get(0));
-    manualClock.addTimeMs(1020);
+    manualClock.addTimeMs(1001);
 
     // Sleep 1 second to make sure the GC has run.
     Thread.sleep(1000);
