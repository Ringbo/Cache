diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/constants/CompileTimeConstantResolver.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/constants/CompileTimeConstantResolver.java
index 0005fec..e1bb1c3 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/constants/CompileTimeConstantResolver.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/constants/CompileTimeConstantResolver.java
@@ -132,7 +132,7 @@
         }
         else if (JetTypeChecker.INSTANCE.isSubtypeOf(builtIns.getFloatType(), expectedType)) {
             try {
-                return new DoubleValue(Float.parseFloat(text));
+                return new FloatValue(Float.parseFloat(text));
             }
             catch (NumberFormatException e) {
                 return OUT_OF_RANGE;
