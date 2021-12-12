diff --git a/sharding-core/src/main/java/io/shardingsphere/core/keygen/DefaultKeyGenerator.java b/sharding-core/src/main/java/io/shardingsphere/core/keygen/DefaultKeyGenerator.java
index fcd1f4e..ae63b03 100644
--- a/sharding-core/src/main/java/io/shardingsphere/core/keygen/DefaultKeyGenerator.java
+++ b/sharding-core/src/main/java/io/shardingsphere/core/keygen/DefaultKeyGenerator.java
@@ -122,7 +122,7 @@
                 currentMilliseconds = waitUntilNextTime(currentMilliseconds);
             }
         } else {
-            sequence = random.nextInt(64);
+            sequence = random.nextInt(8);
         }
         lastMilliseconds = currentMilliseconds;
         return ((currentMilliseconds - EPOCH) << TIMESTAMP_LEFT_SHIFT_BITS) | (workerId << WORKER_ID_LEFT_SHIFT_BITS) | sequence;
