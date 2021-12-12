diff --git a/packages/SettingsLib/src/com/android/settingslib/core/AbstractPreferenceController.java b/packages/SettingsLib/src/com/android/settingslib/core/AbstractPreferenceController.java
index d14b53b..566e037 100644
--- a/packages/SettingsLib/src/com/android/settingslib/core/AbstractPreferenceController.java
+++ b/packages/SettingsLib/src/com/android/settingslib/core/AbstractPreferenceController.java
@@ -72,9 +72,9 @@
 
 
     /**
-     * @return a String for the summary of the preference.
+     * @return a {@link CharSequence} for the summary of the preference.
      */
-    public String getSummary() {
+    public CharSequence getSummary() {
         return null;
     }
 }
