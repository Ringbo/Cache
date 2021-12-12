diff --git a/src/main/org/codehaus/groovy/classgen/asm/BinaryExpressionMultiTypeDispatcher.java b/src/main/org/codehaus/groovy/classgen/asm/BinaryExpressionMultiTypeDispatcher.java
index 14b7f9a..ad38ac8 100644
--- a/src/main/org/codehaus/groovy/classgen/asm/BinaryExpressionMultiTypeDispatcher.java
+++ b/src/main/org/codehaus/groovy/classgen/asm/BinaryExpressionMultiTypeDispatcher.java
@@ -301,7 +301,7 @@
         operandStack.load(ClassHelper.int_TYPE, subscriptValueId);
         operandStack.swap();
         bew.arraySet(false);
-        operandStack.remove(2);
+        operandStack.remove(3); // 3 operands, the array, the index and the value!
 
         // load return value
         operandStack.load(rightType, resultValueId);
