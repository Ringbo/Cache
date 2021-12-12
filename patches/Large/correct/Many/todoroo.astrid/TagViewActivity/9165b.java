diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewActivity.java b/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewActivity.java
index c94b0ff..e2186d5 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewActivity.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewActivity.java
@@ -478,7 +478,8 @@
 
     @Override
     protected Task quickAddTask(String title, boolean selectNewTask) {
-        if(tagData.getValue(TagData.NAME).length() == 0) {
+        if(!tagData.containsNonNullValue(TagData.NAME) ||
+                tagData.getValue(TagData.NAME).length() == 0) {
             DialogUtilities.okDialog(this, getString(R.string.tag_no_title_error), null);
             return null;
         }
