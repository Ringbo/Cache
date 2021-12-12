diff --git a/src/main/org/codehaus/groovy/classgen/asm/OperandStack.java b/src/main/org/codehaus/groovy/classgen/asm/OperandStack.java
index dcf1ac3..fdda319 100644
--- a/src/main/org/codehaus/groovy/classgen/asm/OperandStack.java
+++ b/src/main/org/codehaus/groovy/classgen/asm/OperandStack.java
@@ -345,7 +345,7 @@
         }
 
         MethodVisitor mv = controller.getMethodVisitor();
-        if (primTarget && !primTop && ClassHelper.getWrapper(targetType).equals(top)) {
+        if (primTarget && !ClassHelper.boolean_TYPE.equals(targetType) && !primTop && ClassHelper.getWrapper(targetType).equals(top)) {
             BytecodeHelper.doCastToPrimitive(mv, top, targetType);
         } else {
             top = stack.get(size-1);
