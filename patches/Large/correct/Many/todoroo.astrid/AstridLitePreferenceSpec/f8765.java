diff --git a/astrid/src/com/todoroo/astrid/utility/AstridLitePreferenceSpec.java b/astrid/src/com/todoroo/astrid/utility/AstridLitePreferenceSpec.java
index 70d6a48..ac4a05e 100644
--- a/astrid/src/com/todoroo/astrid/utility/AstridLitePreferenceSpec.java
+++ b/astrid/src/com/todoroo/astrid/utility/AstridLitePreferenceSpec.java
@@ -116,7 +116,7 @@
         setPreference(prefs, editor, r, R.string.p_show_menu_friends, false, ifUnset);
         setPreference(prefs, editor, r, R.string.p_show_featured_lists, false, ifUnset);
         setPreference(prefs, editor, r, R.string.p_show_menu_sync, false, ifUnset);
-        setPreference(prefs, editor, r, R.string.p_show_menu_sort, false, ifUnset);
+        setPreference(prefs, editor, r, R.string.p_show_menu_sort, true, ifUnset);
         setPreference(prefs, editor, r, R.string.p_show_menu_addons, false, ifUnset);
 
         setPreference(prefs, editor, r, R.string.p_show_quickadd_controls, false, ifUnset);
