diff --git a/presto-main/src/test/java/com/facebook/presto/operator/aggregation/TestStateCompiler.java b/presto-main/src/test/java/com/facebook/presto/operator/aggregation/TestStateCompiler.java
index 0f1b40d..1630216 100644
--- a/presto-main/src/test/java/com/facebook/presto/operator/aggregation/TestStateCompiler.java
+++ b/presto-main/src/test/java/com/facebook/presto/operator/aggregation/TestStateCompiler.java
@@ -255,7 +255,7 @@
                 field.setAccessible(true);
                 if (type == BlockBigArray.class || type == BooleanBigArray.class || type == SliceBigArray.class ||
                         type == ByteBigArray.class || type == DoubleBigArray.class || type == LongBigArray.class || type == IntBigArray.class) {
-                    MethodHandle sizeOf = Reflection.methodHandle(type, "sizeOf", null);
+                    MethodHandle sizeOf = Reflection.methodHandle(type, "sizeOf");
                     retainedSize += (long) sizeOf.invokeWithArguments(field.get(state));
                 }
             }
@@ -283,7 +283,7 @@
                         continue;
                     }
                     bigArrayField.setAccessible(true);
-                    MethodHandle sizeOf = Reflection.methodHandle(bigArrayField.getType(), "sizeOf", null);
+                    MethodHandle sizeOf = Reflection.methodHandle(bigArrayField.getType(), "sizeOf");
                     overhead += (long) sizeOf.invokeWithArguments(bigArrayField.get(stateField.get(state)));
                 }
             }
