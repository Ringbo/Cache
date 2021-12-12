diff --git a/smalivm/src/main/java/org/cf/smalivm/opcode/InvokeOp.java b/smalivm/src/main/java/org/cf/smalivm/opcode/InvokeOp.java
index 579edc8..f26d1f2 100644
--- a/smalivm/src/main/java/org/cf/smalivm/opcode/InvokeOp.java
+++ b/smalivm/src/main/java/org/cf/smalivm/opcode/InvokeOp.java
@@ -146,7 +146,7 @@
 
             SmaliClassManager classManager = vm.getClassManager();
             if (classManager.isLocalMethod(targetMethod)) {
-                ExecutionContext calleeContext = buildLocalCalleeContext(methodDescriptor, ectx);
+                ExecutionContext calleeContext = buildLocalCalleeContext(targetMethod, ectx);
                 if (classManager.methodHasImplementation(targetMethod)) {
                     executeLocalMethod(targetMethod, ectx, calleeContext);
                 } else {
