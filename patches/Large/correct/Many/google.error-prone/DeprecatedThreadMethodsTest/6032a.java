diff --git a/core/src/test/java/com/google/errorprone/bugpatterns/threadsafety/DeprecatedThreadMethodsTest.java b/core/src/test/java/com/google/errorprone/bugpatterns/threadsafety/DeprecatedThreadMethodsTest.java
index 20234ea..4e26f9c 100644
--- a/core/src/test/java/com/google/errorprone/bugpatterns/threadsafety/DeprecatedThreadMethodsTest.java
+++ b/core/src/test/java/com/google/errorprone/bugpatterns/threadsafety/DeprecatedThreadMethodsTest.java
@@ -107,7 +107,7 @@
 
   @Test
   public void destroyThread() {
-    assumeFalse(RuntimeVersion.isAtLeast12()); // destroy was removed in 11
+    assumeFalse(RuntimeVersion.isAtLeast11()); // destroy was removed in 11
     compilationHelper
         .addSourceLines(
             "Test.java",
