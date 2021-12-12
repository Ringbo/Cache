diff --git a/src/test/java/org/redisson/RedissonBucketTest.java b/src/test/java/org/redisson/RedissonBucketTest.java
index 54404a7..7ed1bba 100755
--- a/src/test/java/org/redisson/RedissonBucketTest.java
+++ b/src/test/java/org/redisson/RedissonBucketTest.java
@@ -157,7 +157,7 @@
         bucket.set(value);
         Assert.assertEquals(value, bucket.get());
 
-        Assert.assertTrue(bucket.exists());
+        Assert.assertTrue(bucket.isExists());
     }
 
     @Test
@@ -168,11 +168,11 @@
         bucket.set(value);
         Assert.assertEquals(value, bucket.get());
 
-        Assert.assertTrue(bucket.exists());
+        Assert.assertTrue(bucket.isExists());
 
         bucket.delete();
 
-        Assert.assertFalse(bucket.exists());
+        Assert.assertFalse(bucket.isExists());
     }
 
     @Test
