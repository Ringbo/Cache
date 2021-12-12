diff --git a/plugins/properties/src/com/intellij/lang/properties/editor/ResourceBundleEditor.java b/plugins/properties/src/com/intellij/lang/properties/editor/ResourceBundleEditor.java
index 71a2a02..010b16a 100644
--- a/plugins/properties/src/com/intellij/lang/properties/editor/ResourceBundleEditor.java
+++ b/plugins/properties/src/com/intellij/lang/properties/editor/ResourceBundleEditor.java
@@ -163,7 +163,7 @@
         if (!arePropertiesEquivalent(selectedProperty, getSelectedProperty()) ||
             !Comparing.equal(selectedPropertiesFile, getSelectedPropertiesFile())) {
 
-          if (e.getOldLeadSelectionPath() != null) {
+          if (selectedProperty != null && e.getOldLeadSelectionPath() != null) {
             for (Map.Entry<PropertiesFile, Editor> entry : myEditors.entrySet()) {
               if (entry.getValue() == mySelectedEditor) {
                 writeEditorPropertyValue(selectedProperty.getName(), mySelectedEditor, entry.getKey());
