diff --git a/collect_app/src/main/java/org/odk/collect/android/preferences/ServerPreferences.java b/collect_app/src/main/java/org/odk/collect/android/preferences/ServerPreferences.java
index 63fb0d7..4d03533 100644
--- a/collect_app/src/main/java/org/odk/collect/android/preferences/ServerPreferences.java
+++ b/collect_app/src/main/java/org/odk/collect/android/preferences/ServerPreferences.java
@@ -62,7 +62,7 @@
     }
 
     private void addPreferencesResource(CharSequence value) {
-        if (value.equals(getString(R.string.protocol_odk_default))) {
+        if (value == null || value.equals(getString(R.string.protocol_odk_default))) {
             setDefaultAggregatePaths();
             addAggregatePreferences();
         } else if (value.equals(getString(R.string.protocol_google_sheets))) {
