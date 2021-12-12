diff --git a/src/main/java/org/elasticsearch/index/engine/internal/InternalEngine.java b/src/main/java/org/elasticsearch/index/engine/internal/InternalEngine.java
index f3ed299..5c7159d 100644
--- a/src/main/java/org/elasticsearch/index/engine/internal/InternalEngine.java
+++ b/src/main/java/org/elasticsearch/index/engine/internal/InternalEngine.java
@@ -1307,7 +1307,7 @@
                     return;
                 }
                 try {
-                    logger.warn("failed engine [{}]", reason, failure);
+                    logger.warn("failed engine [{}]", failure, reason);
                     // we must set a failure exception, generate one if not supplied
                     failedEngine = failure;
                     for (FailedEngineListener listener : failedEngineListeners) {
