diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/DeckPicker.java b/AnkiDroid/src/main/java/com/ichi2/anki/DeckPicker.java
index dcaadfd..c0dceb7 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/DeckPicker.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/DeckPicker.java
@@ -1094,7 +1094,7 @@
             Resources res = AnkiDroidApp.getAppResources();
             showSimpleNotification(res.getString(R.string.app_name), res.getString(messageResource));
         } else {
-            if (syncMessage.length() == 0) {
+            if (syncMessage == null || syncMessage.length() == 0) {
                 UIUtils.showSimpleSnackbar(this, messageResource, false);
             } else {
                 Resources res = AnkiDroidApp.getAppResources();
