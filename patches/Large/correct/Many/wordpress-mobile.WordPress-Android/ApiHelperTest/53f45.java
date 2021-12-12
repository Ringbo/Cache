diff --git a/WordPress/src/androidTest/java/org/wordpress/android/util/ApiHelperTest.java b/WordPress/src/androidTest/java/org/wordpress/android/util/ApiHelperTest.java
index 60a2c64..8390545 100644
--- a/WordPress/src/androidTest/java/org/wordpress/android/util/ApiHelperTest.java
+++ b/WordPress/src/androidTest/java/org/wordpress/android/util/ApiHelperTest.java
@@ -51,7 +51,7 @@
         XMLRPCFactoryTest.setPrefixAllInstances("malformed-software-version");
         final CountDownLatch countDownLatch = new CountDownLatch(1);
         Blog dummyBlog = new Blog("", "", "");
-        new ApiHelper.RefreshBlogContentTask(mTargetContext, dummyBlog, new GenericCallback() {
+        new ApiHelper.RefreshBlogContentTask(dummyBlog, new GenericCallback() {
             @Override
             public void onSuccess() {
                 assertTrue(true);
@@ -72,7 +72,7 @@
         XMLRPCFactoryTest.setPrefixAllInstances("empty");
         final CountDownLatch countDownLatch = new CountDownLatch(1);
         Blog dummyBlog = new Blog("", "", "");
-        new ApiHelper.RefreshBlogContentTask(mTargetContext, dummyBlog, new GenericCallback() {
+        new ApiHelper.RefreshBlogContentTask(dummyBlog, new GenericCallback() {
             @Override
             public void onSuccess() {
                 assertTrue(false);
