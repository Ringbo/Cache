diff --git a/src/test/java/org/redisson/RedissonBucketReactiveTest.java b/src/test/java/org/redisson/RedissonBucketReactiveTest.java
index 8ac537b..95193d4 100644
--- a/src/test/java/org/redisson/RedissonBucketReactiveTest.java
+++ b/src/test/java/org/redisson/RedissonBucketReactiveTest.java
@@ -76,7 +76,7 @@
         sync(bucket.set(value));
         Assert.assertEquals(value, sync(bucket.get()));
 
-        Assert.assertTrue(sync(bucket.exists()));
+        Assert.assertTrue(sync(bucket.isExists()));
     }
 
     @Test
@@ -87,11 +87,11 @@
         sync(bucket.set(value));
         Assert.assertEquals(value, sync(bucket.get()));
 
-        Assert.assertTrue(sync(bucket.exists()));
+        Assert.assertTrue(sync(bucket.isExists()));
 
         bucket.delete();
 
-        Assert.assertFalse(sync(bucket.exists()));
+        Assert.assertFalse(sync(bucket.isExists()));
     }
 
     @Test
