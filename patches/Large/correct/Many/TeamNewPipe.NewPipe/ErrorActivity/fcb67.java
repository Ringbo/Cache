diff --git a/app/src/main/java/org/schabi/newpipe/report/ErrorActivity.java b/app/src/main/java/org/schabi/newpipe/report/ErrorActivity.java
index a042128..1b60c59 100644
--- a/app/src/main/java/org/schabi/newpipe/report/ErrorActivity.java
+++ b/app/src/main/java/org/schabi/newpipe/report/ErrorActivity.java
@@ -96,7 +96,7 @@
     public static void reportError(final Context context, final List<Throwable> el,
                                    final Class returnActivity, View rootView, final ErrorInfo errorInfo) {
         if (rootView != null) {
-            Snackbar.make(rootView, R.string.error_snackbar_message, 15 * 1000)
+            Snackbar.make(rootView, R.string.error_snackbar_message, 3 * 1000)
                     .setActionTextColor(Color.YELLOW)
                     .setAction(R.string.error_snackbar_action, v ->
                             startErrorActivity(returnActivity, context, errorInfo, el)).show();
