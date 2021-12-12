diff --git a/src/main/org/codehaus/groovy/classgen/asm/sc/StaticInvocationWriter.java b/src/main/org/codehaus/groovy/classgen/asm/sc/StaticInvocationWriter.java
index 778d740..640d775 100644
--- a/src/main/org/codehaus/groovy/classgen/asm/sc/StaticInvocationWriter.java
+++ b/src/main/org/codehaus/groovy/classgen/asm/sc/StaticInvocationWriter.java
@@ -59,7 +59,7 @@
 
 public class StaticInvocationWriter extends InvocationWriter {
     private static final ClassNode INVOKERHELPER_CLASSNODE = ClassHelper.make(InvokerHelper.class);
-    private static final Expression INVOKERHELER_RECEIVER = new ClassExpression(INVOKERHELPER_CLASSNODE);
+    private static final Expression INVOKERHELPER_RECEIVER = new ClassExpression(INVOKERHELPER_CLASSNODE);
     private static final MethodNode INVOKERHELPER_INVOKEMETHOD = INVOKERHELPER_CLASSNODE.getMethod(
             "invokeMethodSafe",
             new Parameter[]{
@@ -290,7 +290,7 @@
                     // replace call with an invoker helper call
                     ArrayExpression arr = new ArrayExpression(ClassHelper.OBJECT_TYPE, args.getExpressions());
                     MethodCallExpression mce = new MethodCallExpression(
-                            INVOKERHELER_RECEIVER,
+                            INVOKERHELPER_RECEIVER,
                             target.isStatic() ? "invokeStaticMethod" : "invokeMethodSafe",
                             new ArgumentListExpression(
                                     target.isStatic() ?
