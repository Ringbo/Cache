diff --git a/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialListPreference.java b/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialListPreference.java
index 7ebe8a0..f40eaf9 100644
--- a/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialListPreference.java
+++ b/library/src/main/java/com/afollestad/materialdialogs/prefs/MaterialListPreference.java
@@ -34,7 +34,7 @@
         int preselect = findIndexOfValue(getValue());
 
         mBuilder = new MaterialDialog.Builder(context)
-                .title(getTitle())
+                .title(getDialogTitle())
                 .icon(getDialogIcon())
                 .negativeText(getNegativeButtonText())
                 .items(getEntries())
