diff --git a/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/interop/convert/ToPointer.java b/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/interop/convert/ToPointer.java
index 0b7298e..7286aad 100644
--- a/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/interop/convert/ToPointer.java
+++ b/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/interop/convert/ToPointer.java
@@ -88,42 +88,42 @@
     }
 
     @Specialization
-    protected Object fromInt(int value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected LLVMBoxedPrimitive fromInt(int value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return new LLVMBoxedPrimitive(value);
     }
 
     @Specialization
-    protected Object fromChar(char value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected LLVMBoxedPrimitive fromChar(char value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return new LLVMBoxedPrimitive(value);
     }
 
     @Specialization
-    protected Object fromLong(long value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected LLVMBoxedPrimitive fromLong(long value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return new LLVMBoxedPrimitive(value);
     }
 
     @Specialization
-    protected Object fromByte(byte value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected LLVMBoxedPrimitive fromByte(byte value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return new LLVMBoxedPrimitive(value);
     }
 
     @Specialization
-    protected Object fromShort(short value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected LLVMBoxedPrimitive fromShort(short value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return new LLVMBoxedPrimitive(value);
     }
 
     @Specialization
-    protected Object fromFloat(float value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected LLVMBoxedPrimitive fromFloat(float value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return new LLVMBoxedPrimitive(value);
     }
 
     @Specialization
-    protected Object fromDouble(double value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected LLVMBoxedPrimitive fromDouble(double value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return new LLVMBoxedPrimitive(value);
     }
 
     @Specialization
-    protected Object fromBoolean(boolean value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
+    protected LLVMBoxedPrimitive fromBoolean(boolean value, @SuppressWarnings("unused") LLVMInteropType.Structured type) {
         return new LLVMBoxedPrimitive(value);
     }
 
