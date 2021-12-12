diff --git a/src/com/ichi2/themes/Themes.java b/src/com/ichi2/themes/Themes.java
index bfa3761..87d37c5 100644
--- a/src/com/ichi2/themes/Themes.java
+++ b/src/com/ichi2/themes/Themes.java
@@ -157,7 +157,7 @@
 			((View) view.findViewById(R.id.studyoptions_global_bar)).setBackgroundResource(mProgressbarsYoungColor);
 
 			if (mCurrentTheme == THEME_WHITE) {
-		        setMargins(view.findViewById(R.id.studyoptions_mainframe), LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT, 4f, 0, 4f, 4f);
+		        setMargins(view.findViewById(R.id.studyoptions_mainframe), LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT, 4f, 4f, 4f, 4f);
 				setMargins(view.findViewById(R.id.studyoptions_deck_name), LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 0, 6f, 0, 2f);
 		        setMargins(view.findViewById(R.id.studyoptions_statistic_field), LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 0, 2f, 0, 12f);
 				setMargins(view.findViewById(R.id.studyoptions_bottom), LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT, 0, 0, 0, 8f);
