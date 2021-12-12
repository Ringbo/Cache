diff --git a/core/java/com/android/internal/os/SamplingProfilerIntegration.java b/core/java/com/android/internal/os/SamplingProfilerIntegration.java
index df0fcd9..6429aa4 100644
--- a/core/java/com/android/internal/os/SamplingProfilerIntegration.java
+++ b/core/java/com/android/internal/os/SamplingProfilerIntegration.java
@@ -106,7 +106,7 @@
         }
 
         ThreadGroup group = Thread.currentThread().getThreadGroup();
-        SamplingProfiler.ThreadSet threadSet = SamplingProfiler.newThreadGroupTheadSet(group);
+        SamplingProfiler.ThreadSet threadSet = SamplingProfiler.newThreadGroupThreadSet(group);
         samplingProfiler = new SamplingProfiler(samplingProfilerDepth, threadSet);
         samplingProfiler.start(samplingProfilerMilliseconds);
         startMillis = System.currentTimeMillis();
