diff --git a/graal/com.oracle.graal.compiler.hsail/src/com/oracle/graal/compiler/hsail/HSAILNodeLIRBuilder.java b/graal/com.oracle.graal.compiler.hsail/src/com/oracle/graal/compiler/hsail/HSAILNodeLIRBuilder.java
index 638e6cb..1abb6bb 100644
--- a/graal/com.oracle.graal.compiler.hsail/src/com/oracle/graal/compiler/hsail/HSAILNodeLIRBuilder.java
+++ b/graal/com.oracle.graal.compiler.hsail/src/com/oracle/graal/compiler/hsail/HSAILNodeLIRBuilder.java
@@ -47,12 +47,12 @@
 
     @Override
     protected void emitDirectCall(DirectCallTargetNode callTarget, Value result, Value[] parameters, Value[] temps, LIRFrameState callState) {
-        throw GraalInternalError.unimplemented();
+        throw GraalInternalError.unimplemented(MetaUtil.format("direct call to %H.%n(%p)", callTarget.target()));
     }
 
     @Override
     protected void emitIndirectCall(IndirectCallTargetNode callTarget, Value result, Value[] parameters, Value[] temps, LIRFrameState callState) {
-        throw GraalInternalError.unimplemented();
+        throw GraalInternalError.unimplemented(MetaUtil.format("direct call to %H.%n(%p)", callTarget.target()));
     }
 
     @Override
