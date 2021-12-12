diff --git a/okhttp/src/main/java/okhttp3/internal/platform/OptionalMethod.java b/okhttp/src/main/java/okhttp3/internal/platform/OptionalMethod.java
index b7b1717..c26132f 100644
--- a/okhttp/src/main/java/okhttp3/internal/platform/OptionalMethod.java
+++ b/okhttp/src/main/java/okhttp3/internal/platform/OptionalMethod.java
@@ -42,7 +42,7 @@
    * @param methodName the name of the method
    * @param methodParams the method parameter types
    */
-  public OptionalMethod(Class<?> returnType, String methodName, Class... methodParams) {
+  OptionalMethod(Class<?> returnType, String methodName, Class... methodParams) {
     this.returnType = returnType;
     this.methodName = methodName;
     this.methodParams = methodParams;
