diff --git a/core/src/main/java/org/elasticsearch/indices/recovery/RecoveriesCollection.java b/core/src/main/java/org/elasticsearch/indices/recovery/RecoveriesCollection.java
index 24f87ee..8494939 100644
--- a/core/src/main/java/org/elasticsearch/indices/recovery/RecoveriesCollection.java
+++ b/core/src/main/java/org/elasticsearch/indices/recovery/RecoveriesCollection.java
@@ -238,7 +238,7 @@
                 return;
             }
             lastSeenAccessTime = accessTime;
-            logger.trace("[monitor] rescheduling check for [{}]. last access time is [{}]", lastSeenAccessTime);
+            logger.trace("[monitor] rescheduling check for [{}]. last access time is [{}]", recoveryId, lastSeenAccessTime);
             threadPool.schedule(checkInterval, ThreadPool.Names.GENERIC, this);
         }
     }
