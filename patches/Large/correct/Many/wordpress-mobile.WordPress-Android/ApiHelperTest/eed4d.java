diff --git a/tests/java/org/wordpress/android/ApiHelperTest.java b/tests/java/org/wordpress/android/ApiHelperTest.java
index a4b797a..a1ec9b6 100644
--- a/tests/java/org/wordpress/android/ApiHelperTest.java
+++ b/tests/java/org/wordpress/android/ApiHelperTest.java
@@ -61,7 +61,7 @@
             @Override
             public void onFailure(ErrorType errorType, String errorMessage, Throwable throwable) {
                 countDownLatch.countDown();
-                assertTrue(true);
+                assertTrue(false);
             }
         }).execute(false);
         countDownLatch.await(5, TimeUnit.SECONDS);
