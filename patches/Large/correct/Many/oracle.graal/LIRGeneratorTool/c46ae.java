diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/spi/LIRGeneratorTool.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/spi/LIRGeneratorTool.java
index 993a283..2b6542e 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/spi/LIRGeneratorTool.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/spi/LIRGeneratorTool.java
@@ -85,7 +85,7 @@
     public abstract void emitMembar(int barriers);
     public abstract void emitDeoptimizeOnOverflow(DeoptimizationAction action, DeoptimizationReason reason, Object deoptInfo);
     public abstract void emitDeoptimize(DeoptimizationAction action, DeoptimizationReason reason, Object deoptInfo, long leafGraphId);
-    public abstract Value emitCall(Object target, CallingConvention cc, boolean canTrap, Value... args);
+    public abstract Value emitCall(RuntimeCall callTarget, CallingConvention cc, boolean canTrap, Value... args);
 
     public abstract void emitIf(IfNode i);
     public abstract void emitConditional(ConditionalNode i);
