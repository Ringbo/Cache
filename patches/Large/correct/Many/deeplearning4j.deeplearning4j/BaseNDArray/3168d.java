diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
index 7554905..0339598 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
@@ -4935,7 +4935,7 @@
     }
     
     protected void autoProcessScalarCall() {
-        if (Nd4j.getExecutioner().getProfilingMode() != OpExecutioner.ProfilingMode.DISABLED)
+        if (Nd4j.getExecutioner().getProfilingMode() != OpExecutioner.ProfilingMode.DISABLED && Nd4j.getExecutioner().getProfilingMode() != OpExecutioner.ProfilingMode.SCOPE_PANIC)
             OpProfiler.getInstance().processScalarCall();
     }
 
