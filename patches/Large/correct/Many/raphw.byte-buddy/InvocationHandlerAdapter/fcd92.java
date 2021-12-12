diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/InvocationHandlerAdapter.java b/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/InvocationHandlerAdapter.java
index 9b1fd59..15938d2 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/InvocationHandlerAdapter.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/implementation/InvocationHandlerAdapter.java
@@ -198,7 +198,7 @@
             throw new IllegalStateException("It is not possible to apply an invocation handler onto the static method " + instrumentedMethod);
         }
         MethodConstant.CanCache methodConstant = privileged
-                ? MethodConstant.of(instrumentedMethod.asDefined())
+                ? MethodConstant.ofPrivileged(instrumentedMethod.asDefined())
                 : MethodConstant.of(instrumentedMethod.asDefined());
         StackManipulation.Size stackSize = new StackManipulation.Compound(
                 preparingManipulation,
