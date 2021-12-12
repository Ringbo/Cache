diff --git a/java/debugger/impl/src/com/intellij/debugger/ui/breakpoints/MethodBreakpoint.java b/java/debugger/impl/src/com/intellij/debugger/ui/breakpoints/MethodBreakpoint.java
index 97e0c33..61e9bf9 100644
--- a/java/debugger/impl/src/com/intellij/debugger/ui/breakpoints/MethodBreakpoint.java
+++ b/java/debugger/impl/src/com/intellij/debugger/ui/breakpoints/MethodBreakpoint.java
@@ -193,7 +193,7 @@
       Method lambdaMethod = MethodBytecodeUtil.getLambdaMethod(classType, debugProcess.getVirtualMachineProxy());
       if (lambdaMethod != null &&
           !breakpoint
-            .matchingMethods(StreamEx.of(((ClassType)classType).interfaces()).flatCollection(ReferenceType::methods), debugProcess)
+            .matchingMethods(StreamEx.of(((ClassType)classType).interfaces()).flatCollection(ReferenceType::allMethods), debugProcess)
             .findFirst().isPresent()) {
         return;
       }
