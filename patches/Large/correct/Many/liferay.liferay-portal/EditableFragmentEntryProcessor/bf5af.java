diff --git a/modules/apps/web-experience/fragment/fragment-entry-processor/fragment-entry-processor-editable/src/main/java/com/liferay/fragment/entry/processor/editable/EditableFragmentEntryProcessor.java b/modules/apps/web-experience/fragment/fragment-entry-processor/fragment-entry-processor-editable/src/main/java/com/liferay/fragment/entry/processor/editable/EditableFragmentEntryProcessor.java
index 81605a6..b678e41 100644
--- a/modules/apps/web-experience/fragment/fragment-entry-processor/fragment-entry-processor-editable/src/main/java/com/liferay/fragment/entry/processor/editable/EditableFragmentEntryProcessor.java
+++ b/modules/apps/web-experience/fragment/fragment-entry-processor/fragment-entry-processor-editable/src/main/java/com/liferay/fragment/entry/processor/editable/EditableFragmentEntryProcessor.java
@@ -84,7 +84,7 @@
 		EditableElementParser editableElementParser,
 		Map<String, Object> properties) {
 
-		String editableTagName = (String)properties.get("editable.tag.name");
+		String editableTagName = (String)properties.get("type");
 
 		_editableElementParsers.put(editableTagName, editableElementParser);
 	}
@@ -93,7 +93,7 @@
 		EditableElementParser editableElementParser,
 		Map<String, Object> properties) {
 
-		String editableTagName = (String)properties.get("editable.tag.name");
+		String editableTagName = (String)properties.get("type");
 
 		_editableElementParsers.remove(editableTagName);
 	}
@@ -160,7 +160,7 @@
 
 	private void _replaceEditableValue(Element element, String value) {
 		EditableElementParser editableTagParser =
-			_editableElementParsers.get(element.getName());
+			_editableElementParsers.get(element.attributeValue("type"));
 
 		if (editableTagParser == null) {
 			return;
