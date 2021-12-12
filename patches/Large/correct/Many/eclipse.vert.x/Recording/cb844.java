diff --git a/src/test/java/io/vertx/core/logging/Recording.java b/src/test/java/io/vertx/core/logging/Recording.java
index 6fb83cc..c393db4 100644
--- a/src/test/java/io/vertx/core/logging/Recording.java
+++ b/src/test/java/io/vertx/core/logging/Recording.java
@@ -74,7 +74,7 @@
     long now = System.currentTimeMillis();
     StringBuilder acc = new StringBuilder(get());
     while (!predicate.test(acc.toString())) {
-      Assert.assertTrue("Was not expecting this output " + acc, System.currentTimeMillis() - now < 5000);
+      Assert.assertTrue(System.currentTimeMillis() - now < 5000);
       try {
         Thread.sleep(1);
       } catch (InterruptedException e) {
