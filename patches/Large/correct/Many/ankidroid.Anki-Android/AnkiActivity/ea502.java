diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/AnkiActivity.java b/AnkiDroid/src/main/java/com/ichi2/anki/AnkiActivity.java
index 57a75f4..02213c1 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/AnkiActivity.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/AnkiActivity.java
@@ -373,7 +373,7 @@
      */
     protected void showSnackbar(int mainTextResource, boolean shortLength, int actionTextResource,
                                 View.OnClickListener listener, View root) {
-        showSnackbar(mainTextResource,shortLength,actionTextResource,listener,root);
+        showSnackbar(mainTextResource,shortLength,actionTextResource,listener,root, null);
     }
     protected void showSnackbar(int mainTextResource, boolean shortLength, int actionTextResource,
                                 View.OnClickListener listener, View root, Snackbar.Callback callback) {
