diff --git a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/GraalTruffleRuntime.java b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/GraalTruffleRuntime.java
index 46a2c37..b8bdf19 100644
--- a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/GraalTruffleRuntime.java
+++ b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/GraalTruffleRuntime.java
@@ -93,7 +93,7 @@
 
     @Override
     public MaterializedFrame createMaterializedFrame(Arguments arguments) {
-        return createMaterializedFrame(arguments);
+        return createMaterializedFrame(arguments, new FrameDescriptor());
     }
 
     @Override
