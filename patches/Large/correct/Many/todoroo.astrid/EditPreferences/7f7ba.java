diff --git a/astrid/src/com/todoroo/astrid/activity/EditPreferences.java b/astrid/src/com/todoroo/astrid/activity/EditPreferences.java
index 79a26a3..9371fd9 100644
--- a/astrid/src/com/todoroo/astrid/activity/EditPreferences.java
+++ b/astrid/src/com/todoroo/astrid/activity/EditPreferences.java
@@ -296,7 +296,7 @@
                 preference.setEnabled(false);
                 preference.setSummary(R.string.EPr_theme_desc_unsupported);
             } else {
-                int index = 0;
+                int index = 1;
                 if(value != null)
                     index = AndroidUtilities.indexOf(r.getStringArray(R.array.EPr_theme_settings), (String)value);
                 preference.setSummary(getString(R.string.EPr_theme_desc,
