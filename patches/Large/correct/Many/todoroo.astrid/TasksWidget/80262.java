diff --git a/astrid/src/com/todoroo/astrid/widget/TasksWidget.java b/astrid/src/com/todoroo/astrid/widget/TasksWidget.java
index 098e9dd..b1f3a42 100644
--- a/astrid/src/com/todoroo/astrid/widget/TasksWidget.java
+++ b/astrid/src/com/todoroo/astrid/widget/TasksWidget.java
@@ -410,7 +410,7 @@
             long id = Preferences.getLong(WidgetConfigActivity.PREF_TAG_ID + widgetId, 0);
             TagData tagData = null;
             if (id > 0) {
-                tagData = tagDataService.fetchById(id, TagData.ID, TagData.NAME, TagData.TASK_COUNT, TagData.REMOTE_ID, TagData.PICTURE, TagData.USER_ID, TagData.MEMBER_COUNT, TagData.TAG_ORDERING);
+                tagData = tagDataService.fetchById(id, TagData.ID, TagData.NAME, TagData.TASK_COUNT, TagData.UUID, TagData.PICTURE, TagData.USER_ID, TagData.MEMBER_COUNT);
                 if (tagData != null && !tagData.getValue(TagData.NAME).equals(filter.title)) { // Tag has been renamed; rebuild filter
                     filter = TagFilterExposer.filterFromTagData(context, tagData);
                     Preferences.setString(WidgetConfigActivity.PREF_SQL + widgetId, filter.getSqlQuery());
@@ -428,7 +428,7 @@
                     }
                 }
             } else {
-                tagData = tagDataService.getTag(filter.title, TagData.ID, TagData.TAG_ORDERING);
+                tagData = tagDataService.getTag(filter.title, TagData.ID);
                 if (tagData != null)
                     Preferences.setLong(WidgetConfigActivity.PREF_TAG_ID + widgetId, tagData.getId());
             }
