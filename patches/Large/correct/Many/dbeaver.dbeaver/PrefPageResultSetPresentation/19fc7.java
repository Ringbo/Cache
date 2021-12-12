diff --git a/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/editors/data/preferences/PrefPageResultSetPresentation.java b/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/editors/data/preferences/PrefPageResultSetPresentation.java
index ebe27d9..5f50dad 100644
--- a/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/editors/data/preferences/PrefPageResultSetPresentation.java
+++ b/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/editors/data/preferences/PrefPageResultSetPresentation.java
@@ -217,7 +217,7 @@
             store.setValue(ResultSetPreferences.RESULT_TEXT_VALUE_FORMAT, textValueFormat.getSelection().name());
             store.setValue(ResultSetPreferences.RESULT_TEXT_SHOW_NULLS, showNulls.getSelection());
             store.setValue(ResultSetPreferences.RESULT_TEXT_DELIMITER_LEADING, textDelimiterLeading.getSelection());
-            store.setValue(ResultSetPreferences.RESULT_TEXT_DELIMITER_TRAILING, textDelimiterLeading.getSelection());
+            store.setValue(ResultSetPreferences.RESULT_TEXT_DELIMITER_TRAILING, textDelimiterTrailing.getSelection());
             store.setValue(ResultSetPreferences.RESULT_TEXT_EXTRA_SPACES, textExtraSpaces.getSelection());
         } catch (Exception e) {
             log.warn(e);
