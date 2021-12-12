diff --git a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/state/CommandApplicationProcess.java b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/state/CommandApplicationProcess.java
index 3f86d82..6eb3e9b 100644
--- a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/state/CommandApplicationProcess.java
+++ b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/core/state/CommandApplicationProcess.java
@@ -171,7 +171,7 @@
         }
     }
 
-    synchronized long lastApplied()
+    public synchronized long lastApplied()
     {
         return lastApplied;
     }
