diff --git a/src/com/ichi2/anki/Reviewer.java b/src/com/ichi2/anki/Reviewer.java
index f8efb93..35a9640 100644
--- a/src/com/ichi2/anki/Reviewer.java
+++ b/src/com/ichi2/anki/Reviewer.java
@@ -2051,7 +2051,7 @@
         mRelativeButtonSize = preferences.getInt("answerButtonSize", 100);
         mInputWorkaround = preferences.getBoolean("inputWorkaround", false);
         mPrefFixArabic = preferences.getBoolean("fixArabicText", false);
-        mPrefForceQuickUpdate = preferences.getBoolean("forceQuickUpdate", false);
+        mPrefForceQuickUpdate = preferences.getBoolean("forceQuickUpdate", true);
         mSpeakText = preferences.getBoolean("tts", false);
         mShowProgressBars = preferences.getBoolean("progressBars", true);
         mPrefFadeScrollbars = preferences.getBoolean("fadeScrollbars", false);
