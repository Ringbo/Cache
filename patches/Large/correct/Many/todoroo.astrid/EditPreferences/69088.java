diff --git a/astrid/src/com/todoroo/astrid/activity/EditPreferences.java b/astrid/src/com/todoroo/astrid/activity/EditPreferences.java
index 4f15ef6..a32386d 100644
--- a/astrid/src/com/todoroo/astrid/activity/EditPreferences.java
+++ b/astrid/src/com/todoroo/astrid/activity/EditPreferences.java
@@ -546,13 +546,13 @@
         else if (booleanPreference(preference, value, R.string.p_autoIdea,
                 R.string.EPr_ideaAuto_desc_disabled, R.string.EPr_ideaAuto_desc_enabled));
         else if (booleanPreference(preference, value, R.string.p_field_missed_calls,
-                    R.string.MCA_missed_calls_pref_desc_enabled, R.string.MCA_missed_calls_pref_desc_disabled));
+                    R.string.MCA_missed_calls_pref_desc_disabled, R.string.MCA_missed_calls_pref_desc_enabled));
         else if (booleanPreference(preference, value, R.string.p_use_contact_picker,
-                    R.string.EPr_use_contact_picker_desc_enabled, R.string.EPr_use_contact_picker_desc_disabled));
+                    R.string.EPr_use_contact_picker_desc_disabled, R.string.EPr_use_contact_picker_desc_enabled));
         else if (booleanPreference(preference, value, R.string.p_third_party_addons,
                     R.string.EPr_third_party_addons_desc_enabled, R.string.EPr_third_party_addons_desc_disabled));
         else if (booleanPreference(preference, value, R.string.p_end_at_deadline,
-                    R.string.EPr_cal_start_at_due_time, R.string.EPr_cal_end_at_due_time));
+                    R.string.EPr_cal_end_at_due_time, R.string.EPr_cal_start_at_due_time));
         else if (r.getString(R.string.p_swipe_lists_enabled).equals(preference.getKey())) {
             preference.setOnPreferenceChangeListener(new SetResultOnPreferenceChangeListener(RESULT_CODE_PERFORMANCE_PREF_CHANGED) {
                 @Override
