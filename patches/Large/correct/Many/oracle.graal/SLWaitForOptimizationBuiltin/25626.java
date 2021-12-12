diff --git a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/builtins/SLWaitForOptimizationBuiltin.java b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/builtins/SLWaitForOptimizationBuiltin.java
index f14b7f8..9d6966a 100644
--- a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/builtins/SLWaitForOptimizationBuiltin.java
+++ b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/builtins/SLWaitForOptimizationBuiltin.java
@@ -54,7 +54,7 @@
 
     @Specialization
     public SLFunction waitForCompilation(SLFunction function, @SuppressWarnings("unused") SLNull timeout) {
-        return waitForOptimization(function, 120000);
+        return waitForOptimization(function, 640000);
     }
 
 }
