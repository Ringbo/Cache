diff --git a/app/src/main/java/com/kickstarter/ui/activities/WebViewActivity.java b/app/src/main/java/com/kickstarter/ui/activities/WebViewActivity.java
index 610e7d7..1f4ca02 100644
--- a/app/src/main/java/com/kickstarter/ui/activities/WebViewActivity.java
+++ b/app/src/main/java/com/kickstarter/ui/activities/WebViewActivity.java
@@ -55,7 +55,7 @@
   @Override
   public void webViewOnPageStarted(final @NonNull KSWebViewClient webViewClient, final @Nullable String url) {
     final AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
-    animation.setDuration(300l);
+    animation.setDuration(300L);
     animation.setFillAfter(true);
     loadingIndicatorView.startAnimation(animation);
   }
@@ -63,7 +63,7 @@
   @Override
   public void webViewOnPageFinished(final @NonNull KSWebViewClient webViewClient, final @Nullable String url) {
     final AlphaAnimation animation = new AlphaAnimation(1.0f, 0.0f);
-    animation.setDuration(300l);
+    animation.setDuration(300L);
     animation.setFillAfter(true);
     loadingIndicatorView.startAnimation(animation);
   }
