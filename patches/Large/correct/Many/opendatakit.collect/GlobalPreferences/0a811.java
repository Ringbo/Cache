diff --git a/src/org/odk/collect/android/prefs/GlobalPreferences.java b/src/org/odk/collect/android/prefs/GlobalPreferences.java
index 20042d3..2425b2a 100644
--- a/src/org/odk/collect/android/prefs/GlobalPreferences.java
+++ b/src/org/odk/collect/android/prefs/GlobalPreferences.java
@@ -60,21 +60,21 @@
         if (s.endsWith("/")) {
             s = s.substring(0, s.lastIndexOf("/"));
         }
-        etp.setText(s);
+        etp.setSummary(s);
     }
 
 
     private void updateUsername() {
         EditTextPreference etp =
                 (EditTextPreference) this.getPreferenceScreen().findPreference(KEY_USERNAME);
-        etp.setText(etp.getText());
+        etp.setSummary(etp.getText());
     }
 
 
     private void updatePassword() {
         EditTextPreference etp =
                 (EditTextPreference) this.getPreferenceScreen().findPreference(KEY_PASSWORD);
-        etp.setText(etp.getText());
+        etp.setSummary(etp.getText());
     }
 
 
