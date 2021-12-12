diff --git a/src/main/java/com/google/devtools/build/lib/actions/ActionCacheChecker.java b/src/main/java/com/google/devtools/build/lib/actions/ActionCacheChecker.java
index c9c1ecb..1861988 100644
--- a/src/main/java/com/google/devtools/build/lib/actions/ActionCacheChecker.java
+++ b/src/main/java/com/google/devtools/build/lib/actions/ActionCacheChecker.java
@@ -224,7 +224,7 @@
       // Remove old records from the cache if they used different key.
       String execPath = output.getExecPathString();
       if (!key.equals(execPath)) {
-        actionCache.remove(key);
+        actionCache.remove(execPath);
       }
       if (!metadataHandler.artifactOmitted(output)) {
         // Output files *must* exist and be accessible after successful action execution.
