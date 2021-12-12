diff --git a/src/main/java/com/google/devtools/build/lib/skyframe/ActionExecutionFunction.java b/src/main/java/com/google/devtools/build/lib/skyframe/ActionExecutionFunction.java
index 7398cd3..657ea76 100644
--- a/src/main/java/com/google/devtools/build/lib/skyframe/ActionExecutionFunction.java
+++ b/src/main/java/com/google/devtools/build/lib/skyframe/ActionExecutionFunction.java
@@ -387,7 +387,8 @@
           try {
             state.discoveredInputs = skyframeActionExecutor.discoverInputs(action,
                 perActionFileCache, metadataHandler, env);
-            Preconditions.checkState(state.discoveredInputs != null);
+            Preconditions.checkState(state.discoveredInputs != null,
+                "discoverInputs() returned null on action %s", action);
           } catch (MissingDepException e) {
             Preconditions.checkState(env.valuesMissing(), action);
             return null;
