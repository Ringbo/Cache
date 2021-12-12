diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/TagSettingsActivity.java b/astrid/plugin-src/com/todoroo/astrid/actfm/TagSettingsActivity.java
index 2346be3..66f4849 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/TagSettingsActivity.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/TagSettingsActivity.java
@@ -201,7 +201,7 @@
         imm.hideSoftInputFromWindow(tagName.getWindowToken(), 0);
 
         if (isNewTag) {
-            Intent intent = new Intent(this, TagViewActivity.class);
+            Intent intent = new Intent(this, TagViewWrapperActivity.class);
             intent.putExtra(TagViewActivity.EXTRA_TAG_NAME, newName);
             intent.putExtra(TagViewActivity.TOKEN_FILTER, TagFilterExposer.filterFromTagData(this, tagData));
             super.finish();
