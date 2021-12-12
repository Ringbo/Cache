diff --git a/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticCompGraph.java b/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticCompGraph.java
index d32ba16..d8d7c83 100644
--- a/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticCompGraph.java
+++ b/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticCompGraph.java
@@ -97,7 +97,7 @@
         Collection<IterationListener> iterationListeners = cg.getListeners();
         if (iterationListeners != null && iterationListeners.size() > 0) {
             for (IterationListener listener : iterationListeners) {
-                listener.iterationDone(cg, iterationCount);
+                listener.iterationDone(cg, iterationCount, epochCount);
             }
         }
         cgConf.setIterationCount(iterationCount + 1);
