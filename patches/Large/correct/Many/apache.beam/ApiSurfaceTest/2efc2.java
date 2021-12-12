diff --git a/sdks/java/core/src/test/java/org/apache/beam/sdk/util/ApiSurfaceTest.java b/sdks/java/core/src/test/java/org/apache/beam/sdk/util/ApiSurfaceTest.java
index 1d2373e..0f3e2ff 100644
--- a/sdks/java/core/src/test/java/org/apache/beam/sdk/util/ApiSurfaceTest.java
+++ b/sdks/java/core/src/test/java/org/apache/beam/sdk/util/ApiSurfaceTest.java
@@ -107,7 +107,7 @@
     return anyOf((Iterable) ALLOWED_PACKAGES).matches(clazz);
   }
 
-  private static final Matcher<Class<?>> inPackage(String packageName) {
+  private static Matcher<Class<?>> inPackage(String packageName) {
     return new ClassInPackage(packageName);
   }
 
