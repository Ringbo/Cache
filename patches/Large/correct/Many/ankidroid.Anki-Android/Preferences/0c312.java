diff --git a/src/com/ichi2/anki/Preferences.java b/src/com/ichi2/anki/Preferences.java
index 37c326a..e391897 100644
--- a/src/com/ichi2/anki/Preferences.java
+++ b/src/com/ichi2/anki/Preferences.java
@@ -613,7 +613,7 @@
     private void closePreferences() {
         finish();
         ActivityTransitionAnimation.slide(this, ActivityTransitionAnimation.FADE);
-        if (mCol != null) {
+        if (mCol != null && mCol.getDb()!= null) {
             mCol.save();
         }
     }
