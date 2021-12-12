diff --git a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/TimeseriesLifecycleTypeTests.java b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/TimeseriesLifecycleTypeTests.java
index 511aa56..2f0c2f8 100644
--- a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/TimeseriesLifecycleTypeTests.java
+++ b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/TimeseriesLifecycleTypeTests.java
@@ -60,7 +60,7 @@
         Map<String, LifecycleAction> actions = VALID_HOT_ACTIONS
             .stream().map(this::getTestAction).collect(Collectors.toMap(LifecycleAction::getWriteableName, Function.identity()));
         if (randomBoolean()) {
-            invalidAction = getTestAction(randomFrom("allocate", "forcemerge", "delete", "replicas", "shrink"));
+            invalidAction = getTestAction(randomFrom("allocate", "forcemerge", "delete", "shrink"));
             actions.put(invalidAction.getWriteableName(), invalidAction);
         }
         Map<String, Phase> hotPhase = Collections.singletonMap("hot",
@@ -123,7 +123,7 @@
         Map<String, LifecycleAction> actions = VALID_DELETE_ACTIONS
             .stream().map(this::getTestAction).collect(Collectors.toMap(LifecycleAction::getWriteableName, Function.identity()));
         if (randomBoolean()) {
-            invalidAction = getTestAction(randomFrom("allocate", "rollover", "replicas", "forcemerge", "shrink"));
+            invalidAction = getTestAction(randomFrom("allocate", "rollover", "forcemerge", "shrink"));
             actions.put(invalidAction.getWriteableName(), invalidAction);
         }
         Map<String, Phase> deletePhase = Collections.singletonMap("delete",
