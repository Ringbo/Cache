diff --git a/lottie/src/main/java/com/airbnb/lottie/LottieComposition.java b/lottie/src/main/java/com/airbnb/lottie/LottieComposition.java
index 7fdadc4..be56c32 100644
--- a/lottie/src/main/java/com/airbnb/lottie/LottieComposition.java
+++ b/lottie/src/main/java/com/airbnb/lottie/LottieComposition.java
@@ -129,7 +129,8 @@
       return loader;
     }
 
-    static LottieComposition fromFileSync(Context context, String fileName) {
+    @SuppressWarnings("WeakerAccess")
+    public static LottieComposition fromFileSync(Context context, String fileName) {
       InputStream stream;
       try {
         stream = context.getAssets().open(fileName);
