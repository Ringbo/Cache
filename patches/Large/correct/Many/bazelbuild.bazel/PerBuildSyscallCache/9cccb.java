diff --git a/src/main/java/com/google/devtools/build/lib/skyframe/PerBuildSyscallCache.java b/src/main/java/com/google/devtools/build/lib/skyframe/PerBuildSyscallCache.java
index d9eb450..5df1957 100644
--- a/src/main/java/com/google/devtools/build/lib/skyframe/PerBuildSyscallCache.java
+++ b/src/main/java/com/google/devtools/build/lib/skyframe/PerBuildSyscallCache.java
@@ -82,7 +82,7 @@
       }
       CacheBuilder<Object, Object> readdirCacheBuilder = CacheBuilder.newBuilder();
       if (maxReaddirs != UNSET) {
-        readdirCacheBuilder = readdirCacheBuilder.maximumSize(maxStats);
+        readdirCacheBuilder = readdirCacheBuilder.maximumSize(maxReaddirs);
       }
       if (concurrencyLevel != UNSET) {
         statCacheBuilder = statCacheBuilder.concurrencyLevel(concurrencyLevel);
