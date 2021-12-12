diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/ByteBuddyDoFnInvokerFactory.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/ByteBuddyDoFnInvokerFactory.java
index 46b21d6..8e3a37c 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/ByteBuddyDoFnInvokerFactory.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/ByteBuddyDoFnInvokerFactory.java
@@ -427,7 +427,7 @@
                   // Push "this" (DoFnInvoker on top of the stack)
                   MethodVariableAccess.REFERENCE.loadFrom(0),
                   // Access this.delegate (DoFn on top of the stack)
-                  FieldAccess.forField(delegateField).getter(),
+                  FieldAccess.forField(delegateField).read(),
                   // Cast it to the more precise type
                   TypeCasting.to(doFnType),
                   // Run the beforeDelegation manipulations.
@@ -637,7 +637,7 @@
       StackManipulation pushDelegate =
           new StackManipulation.Compound(
               MethodVariableAccess.REFERENCE.loadFrom(0),
-              FieldAccess.forField(delegateField).getter());
+              FieldAccess.forField(delegateField).read());
 
       StackManipulation pushExtraContextFactory = MethodVariableAccess.REFERENCE.loadFrom(1);
 
