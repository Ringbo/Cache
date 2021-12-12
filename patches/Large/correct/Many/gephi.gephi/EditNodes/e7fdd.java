diff --git a/modules/ToolsPlugin/src/main/java/org/gephi/ui/tools/plugin/edit/EditNodes.java b/modules/ToolsPlugin/src/main/java/org/gephi/ui/tools/plugin/edit/EditNodes.java
index eb8e22d..be38f86 100644
--- a/modules/ToolsPlugin/src/main/java/org/gephi/ui/tools/plugin/edit/EditNodes.java
+++ b/modules/ToolsPlugin/src/main/java/org/gephi/ui/tools/plugin/edit/EditNodes.java
@@ -152,7 +152,7 @@
                 PropertyEditor propEditor = PropertyEditorManager.findEditor(type);
                 if (ac.canChangeColumnData(column)) {
                     //Editable column, provide "set" method:
-                    if (propEditor != null) {//The type can be edited by default:
+                    if (propEditor != null && !type.isArray()) {//The type can be edited by default:
                         p = new PropertySupport.Reflection(wrap, type, "getValue" + type.getSimpleName(), "setValue" + type.getSimpleName());
                     } else {//Use the AttributeType as String:
                         p = new PropertySupport.Reflection(wrap, String.class, "getValueAsString", "setValueAsString");
