diff --git a/hazelcast/src/test/java/com/hazelcast/cache/CacheBasicAbstractTest.java b/hazelcast/src/test/java/com/hazelcast/cache/CacheBasicAbstractTest.java
index 8336bec..3234b0d 100644
--- a/hazelcast/src/test/java/com/hazelcast/cache/CacheBasicAbstractTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/cache/CacheBasicAbstractTest.java
@@ -821,9 +821,9 @@
     // https://github.com/hazelcast/hazelcast/issues/7236
     @Test
     public void expiryTimeShouldNotBeChangedOnUpdateWhenCreatedExpiryPolicyIsUsed() {
-        final int CRETAED_EXPIRY_TIME_IN_MSEC = 1000;
+        final int CREATED_EXPIRY_TIME_IN_MSEC = 100;
 
-        Duration duration = new Duration(TimeUnit.MILLISECONDS, CRETAED_EXPIRY_TIME_IN_MSEC);
+        Duration duration = new Duration(TimeUnit.MILLISECONDS, CREATED_EXPIRY_TIME_IN_MSEC);
         CacheConfig<Integer, String> cacheConfig = new CacheConfig<Integer, String>();
         cacheConfig.setExpiryPolicyFactory(CreatedExpiryPolicy.factoryOf(duration));
 
@@ -831,7 +831,7 @@
         cache.put(1, "value");
         cache.put(1, "value");
 
-        sleepAtLeastMillis(CRETAED_EXPIRY_TIME_IN_MSEC + 1);
+        sleepAtLeastMillis(CREATED_EXPIRY_TIME_IN_MSEC + 1);
 
         assertNull(cache.get(1));
     }
