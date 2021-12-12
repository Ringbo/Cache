diff --git a/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/interop/LLVMDataEscapeNode.java b/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/interop/LLVMDataEscapeNode.java
index 8a0debe..88dbdf8 100644
--- a/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/interop/LLVMDataEscapeNode.java
+++ b/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/interop/LLVMDataEscapeNode.java
@@ -69,47 +69,47 @@
     public abstract Object executeWithType(Object escapingValue, LLVMInteropType.Structured type);
 
     @Specialization
-    protected Object escapingPrimitive(boolean escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected boolean escapingPrimitive(boolean escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return escapingValue;
     }
 
     @Specialization
-    protected Object escapingPrimitive(byte escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected byte escapingPrimitive(byte escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return escapingValue;
     }
 
     @Specialization
-    protected Object escapingPrimitive(short escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected short escapingPrimitive(short escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return escapingValue;
     }
 
     @Specialization
-    protected Object escapingPrimitive(char escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected char escapingPrimitive(char escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return escapingValue;
     }
 
     @Specialization
-    protected Object escapingPrimitive(int escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected int escapingPrimitive(int escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return escapingValue;
     }
 
     @Specialization
-    protected Object escapingPrimitive(long escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected long escapingPrimitive(long escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return escapingValue;
     }
 
     @Specialization
-    protected Object escapingPrimitive(float escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected float escapingPrimitive(float escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return escapingValue;
     }
 
     @Specialization
-    protected Object escapingPrimitive(double escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected double escapingPrimitive(double escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return escapingValue;
     }
 
     @Specialization
-    protected Object escapingString(String escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected String escapingString(String escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return escapingValue;
     }
 
@@ -205,17 +205,17 @@
     }
 
     @Specialization
-    protected TruffleObject escapingJavaByteArray(LLVMVirtualAllocationAddress address, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected LLVMVirtualAllocationAddressTruffleObject escapingJavaByteArray(LLVMVirtualAllocationAddress address, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return new LLVMVirtualAllocationAddressTruffleObject(address.copy());
     }
 
     @Specialization
-    protected Object escapingGlobal(LLVMGlobal escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected LLVMSharedGlobalVariable escapingGlobal(LLVMGlobal escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return new LLVMSharedGlobalVariable(escapingValue);
     }
 
     @Specialization(guards = "escapingValue == null")
-    protected Object escapingNull(@SuppressWarnings("unused") Object escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected LLVMTruffleObject escapingNull(@SuppressWarnings("unused") Object escapingValue, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return LLVMTruffleObject.createNullPointer();
     }
 
