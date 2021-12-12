diff --git a/sample/src/main/java/com/afollestad/materialdialogssample/MainActivity.java b/sample/src/main/java/com/afollestad/materialdialogssample/MainActivity.java
index de30ba8..67f86b4 100644
--- a/sample/src/main/java/com/afollestad/materialdialogssample/MainActivity.java
+++ b/sample/src/main/java/com/afollestad/materialdialogssample/MainActivity.java
@@ -648,7 +648,7 @@
   public void showShowCancelDismissCallbacks() {
     new MaterialDialog.Builder(this)
         .title(R.string.useGoogleLocationServices)
-        .content(R.string.useGoogleLocationServicesPrompt)
+        .content(R.string.useGoogleLocationServicesPrompt, true)
         .positiveText(R.string.agree)
         .negativeText(R.string.disagree)
         .neutralText(R.string.more_info)
