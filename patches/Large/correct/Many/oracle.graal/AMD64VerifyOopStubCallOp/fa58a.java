diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/target/AMD64VerifyOopStubCallOp.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/target/AMD64VerifyOopStubCallOp.java
index a741a2d..54666c3 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/target/AMD64VerifyOopStubCallOp.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/target/AMD64VerifyOopStubCallOp.java
@@ -49,7 +49,7 @@
         // r13: (in) object
         if (object != AMD64.r13) {
             masm.push(AMD64.r13);
-            masm.movl(AMD64.r13, object);
+            masm.movq(AMD64.r13, object);
         }
         AMD64Call.directCall(tasm, masm, HotSpotGraalRuntime.getInstance().getConfig().verifyOopStub, info);
         if (object != AMD64.r13) {
