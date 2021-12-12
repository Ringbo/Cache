diff --git a/dropwizard-hibernate/src/test/java/io/dropwizard/hibernate/UnitOfWorkApplicationListenerTest.java b/dropwizard-hibernate/src/test/java/io/dropwizard/hibernate/UnitOfWorkApplicationListenerTest.java
index e5b7cfd..1bffdf7 100644
--- a/dropwizard-hibernate/src/test/java/io/dropwizard/hibernate/UnitOfWorkApplicationListenerTest.java
+++ b/dropwizard-hibernate/src/test/java/io/dropwizard/hibernate/UnitOfWorkApplicationListenerTest.java
@@ -271,7 +271,7 @@
         when(uriInfo.getMatchedResourceMethod()).thenReturn(resourceMethod);
     }
 
-    private boolean methodDefinedOnInterface(String methodName, Method[] methods) {
+    private static boolean methodDefinedOnInterface(String methodName, Method[] methods) {
         for (Method method : methods) {
             if (method.getName().equals(methodName)) {
                 return true;
