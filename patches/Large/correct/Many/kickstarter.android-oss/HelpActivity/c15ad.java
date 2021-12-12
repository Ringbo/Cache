diff --git a/app/src/main/java/com/kickstarter/ui/activities/HelpActivity.java b/app/src/main/java/com/kickstarter/ui/activities/HelpActivity.java
index 5d49508..44e6fba 100644
--- a/app/src/main/java/com/kickstarter/ui/activities/HelpActivity.java
+++ b/app/src/main/java/com/kickstarter/ui/activities/HelpActivity.java
@@ -116,7 +116,7 @@
   @Override
   public void webViewOnPageStarted(final @NonNull KSWebViewClient webViewClient, final @Nullable String url) {
     final AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
-    animation.setDuration(300l);
+    animation.setDuration(300L);
     animation.setFillAfter(true);
     loadingIndicatorView.startAnimation(animation);
   }
@@ -124,7 +124,7 @@
   @Override
   public void webViewOnPageFinished(final @NonNull KSWebViewClient webViewClient, final @Nullable String url) {
     final AlphaAnimation animation = new AlphaAnimation(1.0f, 0.0f);
-    animation.setDuration(300l);
+    animation.setDuration(300L);
     animation.setFillAfter(true);
     loadingIndicatorView.startAnimation(animation);
   }
