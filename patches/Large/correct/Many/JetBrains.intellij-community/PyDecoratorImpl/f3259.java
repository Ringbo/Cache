diff --git a/python/src/com/jetbrains/python/psi/impl/PyDecoratorImpl.java b/python/src/com/jetbrains/python/psi/impl/PyDecoratorImpl.java
index f64b533..8cf43f1 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyDecoratorImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyDecoratorImpl.java
@@ -122,7 +122,7 @@
   @Override
   public <T extends PsiElement> T getArgument(int index, Class<T> argClass) {
     PyExpression[] args = getArguments();
-    return args.length >= index && argClass.isInstance(args[index]) ? argClass.cast(args[index]) : null;
+    return args.length > index && argClass.isInstance(args[index]) ? argClass.cast(args[index]) : null;
   }
 
   @Override
