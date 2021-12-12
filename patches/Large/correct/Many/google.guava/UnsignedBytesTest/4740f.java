diff --git a/android/guava-tests/test/com/google/common/primitives/UnsignedBytesTest.java b/android/guava-tests/test/com/google/common/primitives/UnsignedBytesTest.java
index 2724581..eac9422 100644
--- a/android/guava-tests/test/com/google/common/primitives/UnsignedBytesTest.java
+++ b/android/guava-tests/test/com/google/common/primitives/UnsignedBytesTest.java
@@ -233,8 +233,23 @@
     try {
       Class.forName(unsafeComparatorClassName());
       return true;
-    } catch (ExceptionInInitializerError | ClassNotFoundException tolerable) {
-      // probably running on Android
+    } catch (Error | ClassNotFoundException tolerable) {
+      /*
+       * We're probably running on Android.
+       *
+       * A note on exception types:
+       *
+       * Android API level 10 throws ExceptionInInitializerError the first time and
+       * ClassNotFoundException thereafter.
+       *
+       * Android API level 26 and JVM8 both let our Error propagate directly the first time and
+       * throw NoClassDefFoundError thereafter. This is the proper behavior according to the spec.
+       * See https://docs.oracle.com/javase/specs/jls/se8/html/jls-12.html#jls-12.4.2 (steps #11 and
+       * #5).
+       *
+       * Note that that "first time" might happen in a test other than
+       * testLexicographicalComparatorChoice!
+       */
       return false;
     }
   }
