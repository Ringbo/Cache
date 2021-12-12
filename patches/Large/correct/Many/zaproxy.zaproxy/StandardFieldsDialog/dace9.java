diff --git a/src/org/zaproxy/zap/view/StandardFieldsDialog.java b/src/org/zaproxy/zap/view/StandardFieldsDialog.java
index de84ec5..5d9fb0d 100644
--- a/src/org/zaproxy/zap/view/StandardFieldsDialog.java
+++ b/src/org/zaproxy/zap/view/StandardFieldsDialog.java
@@ -425,7 +425,7 @@
 	}
 
 	public void addComboField(int tabIndex, String fieldLabel, String[] choices, String value) {
-		this.addComboField(fieldLabel, choices, value, false);
+		this.addComboField(tabIndex, fieldLabel, choices, value, false);
 	}
 
 	public void addComboField(int tabIndex, String fieldLabel, String[] choices, String value, boolean editable) {
