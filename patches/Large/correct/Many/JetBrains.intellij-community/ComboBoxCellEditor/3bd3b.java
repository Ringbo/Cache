diff --git a/J2EE/source/com/intellij/javaee/module/view/ComboBoxCellEditor.java b/J2EE/source/com/intellij/javaee/module/view/ComboBoxCellEditor.java
index 56dd830..0b9ad9d 100644
--- a/J2EE/source/com/intellij/javaee/module/view/ComboBoxCellEditor.java
+++ b/J2EE/source/com/intellij/javaee/module/view/ComboBoxCellEditor.java
@@ -25,7 +25,7 @@
   }
 
   public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
-    String servletName = (String)value;
+    String currentValue = (String)value;
     final JComboBox component = (JComboBox)super.getTableCellEditorComponent(table, value, isSelected, row, column);
     component.setBorder(null);
     component.removeAllItems();
@@ -34,16 +34,16 @@
     for (int i = 0; i < items.size(); i++) {
       final String item = items.get(i);
       component.addItem(item);
-      if (Comparing.equal(item, servletName)) {
+      if (Comparing.equal(item, currentValue)) {
         selected = i;
       }
     }
     if (selected == -1) {
       component.setEditable(true);
-      component.setSelectedItem(servletName);
+      component.setSelectedItem(currentValue);
       component.setEditable(false);
     } else {
-      component.setSelectedItem(selected);
+      component.setSelectedIndex(selected);
     }
     component.setEditable(isComboboxEditable());
     return component;
