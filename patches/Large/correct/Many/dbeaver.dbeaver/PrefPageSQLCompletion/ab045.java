diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/preferences/PrefPageSQLCompletion.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/preferences/PrefPageSQLCompletion.java
index 465d583..2d8ed08 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/preferences/PrefPageSQLCompletion.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/preferences/PrefPageSQLCompletion.java
@@ -123,7 +123,7 @@
         {
             Composite foldingGroup = UIUtils.createControlGroup(composite, "Folding", 2, GridData.FILL_HORIZONTAL, 0);
 
-            csUseGlobalSearch = UIUtils.createCheckbox(foldingGroup, "Folding enabled", "Use folding in SQL scripts.", false, 2);
+            csFoldingEnabled = UIUtils.createCheckbox(foldingGroup, "Folding enabled", "Use folding in SQL scripts.", false, 2);
         }
         return composite;
     }
@@ -144,7 +144,7 @@
 
             csUseGlobalSearch.setSelection(store.getBoolean(SQLPreferenceConstants.USE_GLOBAL_ASSISTANT));
 
-            csUseGlobalSearch.setSelection(store.getBoolean(SQLPreferenceConstants.FOLDING_ENABLED));
+            csFoldingEnabled.setSelection(store.getBoolean(SQLPreferenceConstants.FOLDING_ENABLED));
         } catch (Exception e) {
             log.warn(e);
         }
@@ -164,7 +164,7 @@
             store.setValue(SQLPreferenceConstants.INSERT_SPACE_AFTER_PROPOSALS, csInsertSpace.getSelection());
             store.setValue(SQLPreferenceConstants.USE_GLOBAL_ASSISTANT, csUseGlobalSearch.getSelection());
 
-            store.setValue(SQLPreferenceConstants.FOLDING_ENABLED, csUseGlobalSearch.getSelection());
+            store.setValue(SQLPreferenceConstants.FOLDING_ENABLED, csFoldingEnabled.getSelection());
         } catch (Exception e) {
             log.warn(e);
         }
