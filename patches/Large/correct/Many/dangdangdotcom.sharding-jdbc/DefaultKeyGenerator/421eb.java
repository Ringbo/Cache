diff --git a/sharding-core/src/main/java/io/shardingsphere/core/keygen/DefaultKeyGenerator.java b/sharding-core/src/main/java/io/shardingsphere/core/keygen/DefaultKeyGenerator.java
index a379c87..cedb29c 100644
--- a/sharding-core/src/main/java/io/shardingsphere/core/keygen/DefaultKeyGenerator.java
+++ b/sharding-core/src/main/java/io/shardingsphere/core/keygen/DefaultKeyGenerator.java
@@ -134,7 +134,7 @@
             return false;
         }
         long timeDifferenceMilliseconds = lastMilliseconds - currentMilliseconds;
-        Preconditions.checkState(timeDifferenceMilliseconds > maxTolerateTimeDifferenceMilliseconds, 
+        Preconditions.checkState(timeDifferenceMilliseconds < maxTolerateTimeDifferenceMilliseconds, 
                 "Clock is moving backwards, last time is %d milliseconds, current time is %d milliseconds", lastMilliseconds, currentMilliseconds);
         Thread.sleep(timeDifferenceMilliseconds);
         return true;
