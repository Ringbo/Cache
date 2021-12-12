diff --git a/caffeine/src/jmh/java/com/github/benmanes/caffeine/profiler/CacheProfiler.java b/caffeine/src/jmh/java/com/github/benmanes/caffeine/profiler/CacheProfiler.java
index e69ce0b..27a37d2 100644
--- a/caffeine/src/jmh/java/com/github/benmanes/caffeine/profiler/CacheProfiler.java
+++ b/caffeine/src/jmh/java/com/github/benmanes/caffeine/profiler/CacheProfiler.java
@@ -38,7 +38,7 @@
   CacheProfiler() {
     System.setProperty(Tracer.TRACING_ENABLED, "false");
     map = type.create(MAX_SIZE, NUM_THREADS);
-    reads = false;
+    reads = true;
   }
 
   @Override
