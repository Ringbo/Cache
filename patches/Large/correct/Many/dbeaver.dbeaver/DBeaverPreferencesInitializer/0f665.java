diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/core/DBeaverPreferencesInitializer.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/core/DBeaverPreferencesInitializer.java
index 9ae3800..15f38a7 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/core/DBeaverPreferencesInitializer.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/core/DBeaverPreferencesInitializer.java
@@ -130,7 +130,7 @@
 
         PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.RESET_CURSOR_ON_EXECUTE, false);
         PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.BEEP_ON_QUERY_END, false);
-        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.REFRESH_DEFAULTS_AFTER_EXECUTE, true);
+        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.REFRESH_DEFAULTS_AFTER_EXECUTE, false);
 
         // Text editor default preferences
         PrefUtils.setDefaultPreferenceValue(store, AbstractTextEditor.PREFERENCE_TEXT_DRAG_AND_DROP_ENABLED, true);
