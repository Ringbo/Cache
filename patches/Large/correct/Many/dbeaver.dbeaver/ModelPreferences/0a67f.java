diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/ModelPreferences.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/ModelPreferences.java
index a6649fd..8ca837b 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/ModelPreferences.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/ModelPreferences.java
@@ -81,7 +81,7 @@
 
     private static void initializeDefaultPreferences(DBPPreferenceStore store) {
         // Common
-        PrefUtils.setDefaultPreferenceValue(store, QUERY_ROLLBACK_ON_ERROR, true);
+        PrefUtils.setDefaultPreferenceValue(store, QUERY_ROLLBACK_ON_ERROR, false);
 
         // SQL execution
         PrefUtils.setDefaultPreferenceValue(store, SCRIPT_STATEMENT_DELIMITER, SQLConstants.DEFAULT_STATEMENT_DELIMITER);
