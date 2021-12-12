diff --git a/projects/com.oracle.truffle.llvm.asm.amd64/src/com/oracle/truffle/llvm/asm/amd64/AsmFactory.java b/projects/com.oracle.truffle.llvm.asm.amd64/src/com/oracle/truffle/llvm/asm/amd64/AsmFactory.java
index 37ec94e..51003a7 100644
--- a/projects/com.oracle.truffle.llvm.asm.amd64/src/com/oracle/truffle/llvm/asm/amd64/AsmFactory.java
+++ b/projects/com.oracle.truffle.llvm.asm.amd64/src/com/oracle/truffle/llvm/asm/amd64/AsmFactory.java
@@ -1802,7 +1802,7 @@
         LLVMExpressionNode stackPointer = LLVMArgNodeGen.create(0);
         FrameSlot stackSlot = frameDescriptor.addFrameSlot(LLVMStack.FRAME_ID);
         stackSlot.setKind(FrameSlotKind.Object);
-        arguments.add(LLVMWriteAddressNodeGen.create(stackPointer, frameDescriptor.findFrameSlot(LLVMStack.FRAME_ID), sourceSection));
+        arguments.add(LLVMWriteAddressNodeGen.create(stackPointer, frameDescriptor.findFrameSlot(LLVMStack.FRAME_ID), sourceLocation));
 
         arguments.add(LLVMWriteAddressNodeGen.create(stackPointer, getRegisterSlot("rsp"), null));
 
@@ -2125,7 +2125,7 @@
                 LLVMExpressionNode register = LLVMAMD64ReadRegisterNodeGen.create(frame);
                 LLVMExpressionNode out = null;
                 if (type instanceof PointerType || info.getType() instanceof PointerType) {
-                    return LLVMAMD64WriteAddressRegisterNodeGen.create(from, frame);
+                    return LLVMAMD64WriteAddressRegisterNodeGen.create(sourceLocation, from, frame);
                 }
                 switch (((PrimitiveType) type).getPrimitiveKind()) {
                     case I8:
