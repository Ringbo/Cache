diff --git a/src/main/java/org/elasticsearch/index/engine/robin/RobinEngine.java b/src/main/java/org/elasticsearch/index/engine/robin/RobinEngine.java
index 68dd3ee..a8c3129 100644
--- a/src/main/java/org/elasticsearch/index/engine/robin/RobinEngine.java
+++ b/src/main/java/org/elasticsearch/index/engine/robin/RobinEngine.java
@@ -690,7 +690,7 @@
         try {
             IndexSearcher searcher = manager.acquire();
             return newSearcher(source, searcher, manager);
-        } catch (IOException ex) {
+        } catch (Throwable ex) {
             logger.error("failed to acquire searcher, source {}", ex, source);
             throw new EngineException(shardId, ex.getMessage());
         }
