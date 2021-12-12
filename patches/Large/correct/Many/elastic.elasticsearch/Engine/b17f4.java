diff --git a/core/src/main/java/org/elasticsearch/index/engine/Engine.java b/core/src/main/java/org/elasticsearch/index/engine/Engine.java
index 3c55834..bb7aa0e 100644
--- a/core/src/main/java/org/elasticsearch/index/engine/Engine.java
+++ b/core/src/main/java/org/elasticsearch/index/engine/Engine.java
@@ -671,7 +671,7 @@
                     closeNoLock("engine failed on: [" + reason + "]");
                 } finally {
                     if (failedEngine != null) {
-                        logger.debug("tried to fail engine but engine is already failed. ignoring. [{}]", reason, failure);
+                        logger.debug("tried to fail engine but engine is already failed. ignoring. [{}]", failure, reason);
                         return;
                     }
                     logger.warn("failed engine [{}]", failure, reason);
@@ -697,7 +697,7 @@
                 store.decRef();
             }
         } else {
-            logger.debug("tried to fail engine but could not acquire lock - engine should be failed by now [{}]", reason, failure);
+            logger.debug("tried to fail engine but could not acquire lock - engine should be failed by now [{}]", failure, reason);
         }
     }
 
