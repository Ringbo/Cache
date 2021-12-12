diff --git a/src/main/java/org/apache/ibatis/reflection/ExceptionUtil.java b/src/main/java/org/apache/ibatis/reflection/ExceptionUtil.java
index 73429dd..2f021cc 100644
--- a/src/main/java/org/apache/ibatis/reflection/ExceptionUtil.java
+++ b/src/main/java/org/apache/ibatis/reflection/ExceptionUtil.java
@@ -9,9 +9,9 @@
     Throwable unwrapped = wrapped;
     while (true) {
       if (unwrapped instanceof InvocationTargetException) {
-        unwrapped = ((InvocationTargetException) wrapped).getTargetException();
+        unwrapped = ((InvocationTargetException) unwrapped).getTargetException();
       } else if (unwrapped instanceof UndeclaredThrowableException) {
-        unwrapped = ((UndeclaredThrowableException) wrapped).getUndeclaredThrowable();
+        unwrapped = ((UndeclaredThrowableException) unwrapped).getUndeclaredThrowable();
       } else {
         return unwrapped;
       }
