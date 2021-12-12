diff --git a/src/test/java/org/redisson/RedissonBucketTest.java b/src/test/java/org/redisson/RedissonBucketTest.java
index 7bcb0cc..e528380 100755
--- a/src/test/java/org/redisson/RedissonBucketTest.java
+++ b/src/test/java/org/redisson/RedissonBucketTest.java
@@ -20,7 +20,7 @@
         RBucket<String> bucket = redisson.getBucket("test1");
         bucket.set("someValue", 1, TimeUnit.SECONDS);
 
-        Thread.sleep(1000);
+        Thread.sleep(1100);
 
         Assert.assertNull(bucket.get());
     }
@@ -42,10 +42,10 @@
         RMap<String, String> map = redisson.getMap("test2");
         map.fastPut("1", "2");
 
-        Queue<String> keys = redisson.findKeysByPattern("test?");
+        Collection<String> keys = redisson.findKeysByPattern("test?");
         MatcherAssert.assertThat(keys, Matchers.containsInAnyOrder("test1", "test2"));
 
-        Queue<String> keys2 = redisson.findKeysByPattern("test");
+        Collection<String> keys2 = redisson.findKeysByPattern("test");
         MatcherAssert.assertThat(keys2, Matchers.empty());
     }
 
