diff --git a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/debug/TraceCompilationFailureListener.java b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/debug/TraceCompilationFailureListener.java
index 16642e7..ee3d2c5 100644
--- a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/debug/TraceCompilationFailureListener.java
+++ b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/debug/TraceCompilationFailureListener.java
@@ -46,7 +46,7 @@
         }
     }
 
-    public static final boolean isPermanentBailout(Throwable t) {
+    public static boolean isPermanentBailout(Throwable t) {
         return !(t instanceof BailoutException) || ((BailoutException) t).isPermanent();
     }
 
