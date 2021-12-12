diff --git a/sdk/src/main/java/com/google/cloud/dataflow/sdk/util/common/worker/StateSampler.java b/sdk/src/main/java/com/google/cloud/dataflow/sdk/util/common/worker/StateSampler.java
index e258aec..1f71bd1 100644
--- a/sdk/src/main/java/com/google/cloud/dataflow/sdk/util/common/worker/StateSampler.java
+++ b/sdk/src/main/java/com/google/cloud/dataflow/sdk/util/common/worker/StateSampler.java
@@ -210,7 +210,7 @@
         Counter<Long> counter = counterSetMutator.addCounter(
             Counter.longs(counterName, Counter.AggregationKind.SUM));
         state = countersByState.size();
-        statesByName.put(name, state);
+        statesByName.put(counterName, state);
         countersByState.add(counter);
         kindsByState.put(state, kind);
       }
