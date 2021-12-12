diff --git a/astrid/plugin-src/com/todoroo/astrid/tags/TagFilterExposer.java b/astrid/plugin-src/com/todoroo/astrid/tags/TagFilterExposer.java
index 8dc7a8c..376ee26 100644
--- a/astrid/plugin-src/com/todoroo/astrid/tags/TagFilterExposer.java
+++ b/astrid/plugin-src/com/todoroo/astrid/tags/TagFilterExposer.java
@@ -76,7 +76,7 @@
                 filter.color = Color.GRAY;
         }
 
-        TagData tagData = PluginServices.getTagDataService().getTag(tag.tag, TagData.ID, TagData.MEMBER_COUNT);
+        TagData tagData = PluginServices.getTagDataService().getTag(tag.tag, TagData.ID, TagData.USER_ID, TagData.MEMBER_COUNT);
         int deleteIntentLabel;
         if (tagData.getValue(TagData.MEMBER_COUNT) > 0 && tagData.getValue(TagData.USER_ID) != 0)
             deleteIntentLabel = R.string.tag_cm_leave;
