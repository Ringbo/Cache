diff --git a/redisson/src/main/java/org/redisson/RedissonBloomFilter.java b/redisson/src/main/java/org/redisson/RedissonBloomFilter.java
index 010f0c8..590a5bb 100644
--- a/redisson/src/main/java/org/redisson/RedissonBloomFilter.java
+++ b/redisson/src/main/java/org/redisson/RedissonBloomFilter.java
@@ -124,7 +124,7 @@
                 List<Boolean> result = (List<Boolean>) executorService.execute();
 
                 for (Boolean val : result.subList(1, result.size()-1)) {
-                    if (val) {
+                    if (!val) {
                         return true;
                     }
                 }
