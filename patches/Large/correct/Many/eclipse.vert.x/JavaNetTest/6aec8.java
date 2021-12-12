diff --git a/vertx-testsuite/src/test/java/org/vertx/java/tests/core/net/JavaNetTest.java b/vertx-testsuite/src/test/java/org/vertx/java/tests/core/net/JavaNetTest.java
index 5eeea03..90940ce 100644
--- a/vertx-testsuite/src/test/java/org/vertx/java/tests/core/net/JavaNetTest.java
+++ b/vertx-testsuite/src/test/java/org/vertx/java/tests/core/net/JavaNetTest.java
@@ -439,7 +439,7 @@
 
   @Test
   public void testListenOnWildcardPort() throws Exception {
-    startTest(getMethodName(), false);
+    startTest(getMethodName());
   }
 
   @Test
