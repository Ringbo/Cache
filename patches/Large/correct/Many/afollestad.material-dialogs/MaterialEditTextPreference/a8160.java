diff --git a/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialEditTextPreference.java b/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialEditTextPreference.java
index 35d4646..39bc10b 100644
--- a/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialEditTextPreference.java
+++ b/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialEditTextPreference.java
@@ -76,7 +76,7 @@
 
 		// Set up our builder
 		Builder mBuilder = new MaterialDialog.Builder(getContext())
-				.title(getTitle())
+				.title(getDialogTitle())
 				.icon(getDialogIcon())
 				.positiveText(getPositiveButtonText())
 				.negativeText(getNegativeButtonText())
