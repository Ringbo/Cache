diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/ByteBuddyOnTimerInvokerFactory.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/ByteBuddyOnTimerInvokerFactory.java
index 786857a..123808c 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/ByteBuddyOnTimerInvokerFactory.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/ByteBuddyOnTimerInvokerFactory.java
@@ -239,7 +239,7 @@
       StackManipulation pushDelegate =
           new StackManipulation.Compound(
               MethodVariableAccess.REFERENCE.loadFrom(0),
-              FieldAccess.forField(delegateField).getter());
+              FieldAccess.forField(delegateField).read());
 
       StackManipulation pushExtraContextFactory = MethodVariableAccess.REFERENCE.loadFrom(1);
 
@@ -295,7 +295,7 @@
                                   .getDeclaredFields()
                                   .filter(ElementMatchers.named(FN_DELEGATE_FIELD_NAME))
                                   .getOnly())
-                          .putter(),
+                          .write(),
                       // Return void.
                       MethodReturn.VOID)
                   .apply(methodVisitor, implementationContext);
