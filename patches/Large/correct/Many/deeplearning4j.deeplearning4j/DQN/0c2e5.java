diff --git a/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/dqn/DQN.java b/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/dqn/DQN.java
index 6c5edde..d39a495 100644
--- a/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/dqn/DQN.java
+++ b/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/dqn/DQN.java
@@ -97,7 +97,7 @@
         Collection<IterationListener> iterationListeners = mln.getListeners();
         if (iterationListeners != null && iterationListeners.size() > 0) {
             for (IterationListener listener : iterationListeners) {
-                listener.iterationDone(mln, iterationCount);
+                listener.iterationDone(mln, iterationCount, epochCount);
             }
         }
         mlnConf.setIterationCount(iterationCount + 1);
