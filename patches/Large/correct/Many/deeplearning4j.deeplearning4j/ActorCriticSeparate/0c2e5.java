diff --git a/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticSeparate.java b/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticSeparate.java
index 548b188..4cec230 100644
--- a/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticSeparate.java
+++ b/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticSeparate.java
@@ -112,7 +112,7 @@
         Collection<IterationListener> valueIterationListeners = valueNet.getListeners();
         if (valueIterationListeners != null && valueIterationListeners.size() > 0) {
             for (IterationListener listener : valueIterationListeners) {
-                listener.iterationDone(valueNet, valueIterationCount);
+                listener.iterationDone(valueNet, valueIterationCount, valueEpochCount);
             }
         }
         valueConf.setIterationCount(valueIterationCount + 1);
@@ -125,7 +125,7 @@
         Collection<IterationListener> policyIterationListeners = policyNet.getListeners();
         if (policyIterationListeners != null && policyIterationListeners.size() > 0) {
             for (IterationListener listener : policyIterationListeners) {
-                listener.iterationDone(policyNet, policyIterationCount);
+                listener.iterationDone(policyNet, policyIterationCount, policyEpochCount);
             }
         }
         policyConf.setIterationCount(policyIterationCount + 1);
