diff --git a/src/test/java/io/vertx/core/logging/Recording.java b/src/test/java/io/vertx/core/logging/Recording.java
index c393db4..6fb83cc 100644
--- a/src/test/java/io/vertx/core/logging/Recording.java
+++ b/src/test/java/io/vertx/core/logging/Recording.java
@@ -74,7 +74,7 @@
     long now = System.currentTimeMillis();
     StringBuilder acc = new StringBuilder(get());
     while (!predicate.test(acc.toString())) {
-      Assert.assertTrue(System.currentTimeMillis() - now < 5000);
+      Assert.assertTrue("Was not expecting this output " + acc, System.currentTimeMillis() - now < 5000);
       try {
         Thread.sleep(1);
       } catch (InterruptedException e) {
