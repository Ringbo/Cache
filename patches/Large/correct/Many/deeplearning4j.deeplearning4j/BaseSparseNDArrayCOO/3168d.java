diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseSparseNDArrayCOO.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseSparseNDArrayCOO.java
index 222de47..7c0f9bf 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseSparseNDArrayCOO.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseSparseNDArrayCOO.java
@@ -230,7 +230,7 @@
         if (i < 0)
             i += rank();
         if (isScalar()) {
-            if (Nd4j.getExecutioner().getProfilingMode() != OpExecutioner.ProfilingMode.DISABLED)
+            if (Nd4j.getExecutioner().getProfilingMode() != OpExecutioner.ProfilingMode.DISABLED && Nd4j.getExecutioner().getProfilingMode() != OpExecutioner.ProfilingMode.SCOPE_PANIC)
                 OpProfiler.getInstance().processScalarCall();
 
             addOrUpdate(new int[] {0, 0}, value);
@@ -608,7 +608,7 @@
             throw new IllegalArgumentException("Unable to get linear index >= " + length());
         }
 
-        if (Nd4j.getExecutioner().getProfilingMode() != OpExecutioner.ProfilingMode.DISABLED)
+        if (Nd4j.getExecutioner().getProfilingMode() != OpExecutioner.ProfilingMode.DISABLED && Nd4j.getExecutioner().getProfilingMode() != OpExecutioner.ProfilingMode.SCOPE_PANIC)
             OpProfiler.getInstance().processScalarCall();
 
         if (i == 0)
