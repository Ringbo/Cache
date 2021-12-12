diff --git a/python/src/com/jetbrains/python/debugger/array/NumpyArrayTable.java b/python/src/com/jetbrains/python/debugger/array/NumpyArrayTable.java
index b59c221..c809377 100644
--- a/python/src/com/jetbrains/python/debugger/array/NumpyArrayTable.java
+++ b/python/src/com/jetbrains/python/debugger/array/NumpyArrayTable.java
@@ -160,8 +160,8 @@
       final PyDebugValue value = getDebugValue();
       PyDebugValue parent = value.getParent();
       final PyDebugValue slicedValue =
-        new PyDebugValue(slice, value.getType(), null, value.getValue(), value.isContainer(), value.isErrorOnEval(),
-                         parent, value.getFrameAccessor());
+        new PyDebugValue(slice, value.getType(), null, value.getValue(), value.isContainer(), value.isReturnedVal(),
+                         value.isErrorOnEval(), parent, value.getFrameAccessor());
 
       final String format = getFormat().isEmpty() ? "%" : getFormat();
 
