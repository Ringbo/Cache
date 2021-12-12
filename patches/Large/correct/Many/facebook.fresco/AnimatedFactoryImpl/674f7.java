diff --git a/animated-base/src/main/java/com/facebook/imagepipeline/animated/factory/AnimatedFactoryImpl.java b/animated-base/src/main/java/com/facebook/imagepipeline/animated/factory/AnimatedFactoryImpl.java
index 373098c..40d85ce 100644
--- a/animated-base/src/main/java/com/facebook/imagepipeline/animated/factory/AnimatedFactoryImpl.java
+++ b/animated-base/src/main/java/com/facebook/imagepipeline/animated/factory/AnimatedFactoryImpl.java
@@ -54,7 +54,7 @@
       PlatformBitmapFactory platformBitmapFactory,
       ExecutorSupplier executorSupplier) {
     this.mContext = context;
-    this.mPlatformBitmapFactory = mPlatformBitmapFactory;
+    this.mPlatformBitmapFactory = platformBitmapFactory;
     this.mExecutorSupplier = executorSupplier;
   }
 
