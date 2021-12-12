diff --git a/guava-tests/test/com/google/common/base/CharMatcherTest.java b/guava-tests/test/com/google/common/base/CharMatcherTest.java
index 228d91e..2e52a6e 100644
--- a/guava-tests/test/com/google/common/base/CharMatcherTest.java
+++ b/guava-tests/test/com/google/common/base/CharMatcherTest.java
@@ -198,7 +198,7 @@
   }
 
   @GwtIncompatible("NullPointerTester")
-  private void doTestNull(CharMatcher matcher) throws Exception {
+  private static void doTestNull(CharMatcher matcher) throws Exception {
     NullPointerTester tester = new NullPointerTester();
     tester.testAllPublicInstanceMethods(matcher);
   }
