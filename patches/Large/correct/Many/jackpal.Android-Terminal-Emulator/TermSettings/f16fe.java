diff --git a/src/jackpal/androidterm/util/TermSettings.java b/src/jackpal/androidterm/util/TermSettings.java
index cd76ade..47c8704 100644
--- a/src/jackpal/androidterm/util/TermSettings.java
+++ b/src/jackpal/androidterm/util/TermSettings.java
@@ -165,7 +165,7 @@
         mActionBarMode = readIntPref(ACTIONBAR_KEY, mActionBarMode, ACTION_BAR_MODE_MAX);
         // mCursorStyle = readIntPref(CURSORSTYLE_KEY, mCursorStyle, 2);
         // mCursorBlink = readIntPref(CURSORBLINK_KEY, mCursorBlink, 1);
-        mFontSize = readIntPref(FONTSIZE_KEY, mFontSize, 20);
+        mFontSize = readIntPref(FONTSIZE_KEY, mFontSize, 288);
         mColorId = readIntPref(COLOR_KEY, mColorId, COLOR_SCHEMES.length - 1);
         mUTF8ByDefault = readBooleanPref(UTF8_KEY, mUTF8ByDefault);
         mBackKeyAction = readIntPref(BACKACTION_KEY, mBackKeyAction, BACK_KEY_MAX);
