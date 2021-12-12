diff --git a/sdks/java/io/jms/src/test/java/org/apache/beam/sdk/io/jms/JmsIOTest.java b/sdks/java/io/jms/src/test/java/org/apache/beam/sdk/io/jms/JmsIOTest.java
index 46b8532..9dad9e6 100644
--- a/sdks/java/io/jms/src/test/java/org/apache/beam/sdk/io/jms/JmsIOTest.java
+++ b/sdks/java/io/jms/src/test/java/org/apache/beam/sdk/io/jms/JmsIOTest.java
@@ -471,11 +471,11 @@
    * A utility method which decorates an existing object with a proxy instance adhering to a given interface, with the
    * specified method name having its return value transformed by the provided function.
    */
-  private <T, U, V> T proxyMethod(
+  private <T, MethodArgT, MethodResultT> T proxyMethod(
       T target,
       Class<? super T> proxyInterface,
       String methodName,
-      Function<U, V> resultTransformer) {
+      Function<MethodArgT, MethodResultT> resultTransformer) {
     return (T)
         Proxy.newProxyInstance(
             this.getClass().getClassLoader(),
@@ -483,7 +483,7 @@
             (proxy, method, args) -> {
               Object result = method.invoke(target, args);
               if (method.getName().equals(methodName)) {
-                result = resultTransformer.apply((U) result);
+                result = resultTransformer.apply((MethodArgT) result);
               }
               return result;
             });
