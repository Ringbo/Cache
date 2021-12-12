diff --git a/src/com/ichi2/anki/Preferences.java b/src/com/ichi2/anki/Preferences.java
index ac53e07..cb364c3 100644
--- a/src/com/ichi2/anki/Preferences.java
+++ b/src/com/ichi2/anki/Preferences.java
@@ -614,7 +614,7 @@
     private void closePreferences() {
         finish();
         ActivityTransitionAnimation.slide(this, ActivityTransitionAnimation.FADE);
-        if (mCol != null) {
+        if (mCol != null && mCol.getDb()!= null) {
             mCol.save();
         }
     }
