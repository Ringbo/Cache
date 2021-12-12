diff --git a/src/main/java/com/google/devtools/build/skyframe/SkyFunctionException.java b/src/main/java/com/google/devtools/build/skyframe/SkyFunctionException.java
index 71b4710..09d2c4c 100644
--- a/src/main/java/com/google/devtools/build/skyframe/SkyFunctionException.java
+++ b/src/main/java/com/google/devtools/build/skyframe/SkyFunctionException.java
@@ -94,7 +94,7 @@
     return (Exception) super.getCause();
   }
 
-  static <E extends Throwable> void validateExceptionType(Class<E> exceptionClass) {
+  static <E extends Exception> void validateExceptionType(Class<E> exceptionClass) {
     if (exceptionClass.equals(ValueOrExceptionUtils.BottomException.class)) {
       return;
     }
