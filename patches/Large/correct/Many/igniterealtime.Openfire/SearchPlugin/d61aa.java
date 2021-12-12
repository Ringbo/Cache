diff --git a/src/plugins/search/src/java/org/jivesoftware/wildfire/plugin/SearchPlugin.java b/src/plugins/search/src/java/org/jivesoftware/wildfire/plugin/SearchPlugin.java
index 6e9664f..0f9a9cb 100644
--- a/src/plugins/search/src/java/org/jivesoftware/wildfire/plugin/SearchPlugin.java
+++ b/src/plugins/search/src/java/org/jivesoftware/wildfire/plugin/SearchPlugin.java
@@ -136,7 +136,7 @@
             field = new XFormFieldImpl("search");
             field.setType(FormField.TYPE_TEXT_SINGLE);
             field.setLabel("Search");
-            field.setRequired(false);
+            field.setRequired(true);
             searchForm.addField(field);
             
             for (String searchField : searchFields) {
