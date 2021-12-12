diff --git a/core/src/test/java/com/google/errorprone/bugpatterns/threadsafety/DeprecatedThreadMethodsTest.java b/core/src/test/java/com/google/errorprone/bugpatterns/threadsafety/DeprecatedThreadMethodsTest.java
index 4e26f9c..6a9acc2 100644
--- a/core/src/test/java/com/google/errorprone/bugpatterns/threadsafety/DeprecatedThreadMethodsTest.java
+++ b/core/src/test/java/com/google/errorprone/bugpatterns/threadsafety/DeprecatedThreadMethodsTest.java
@@ -64,7 +64,7 @@
 
   @Test
   public void stopThrowableThread() {
-    assumeFalse(RuntimeVersion.isAtLeast12()); // stop(Throwable) was removed in 11
+    assumeFalse(RuntimeVersion.isAtLeast11()); // stop(Throwable) was removed in 11
     compilationHelper
         .addSourceLines(
             "Test.java",
