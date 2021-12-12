diff --git a/astrid/src/com/todoroo/astrid/dao/MetadataDao.java b/astrid/src/com/todoroo/astrid/dao/MetadataDao.java
index bd0bd30..7781879 100644
--- a/astrid/src/com/todoroo/astrid/dao/MetadataDao.java
+++ b/astrid/src/com/todoroo/astrid/dao/MetadataDao.java
@@ -73,7 +73,7 @@
             item.setValue(Metadata.CREATION_DATE, DateUtilities.now());
 
         boolean state = super.persist(item);
-        if(Preferences.getBoolean(AstridPreferences.P_FIRST_LIST, false)) {
+        if(Preferences.getBoolean(AstridPreferences.P_FIRST_LIST, true)) {
             if (state && item.getValue(Metadata.KEY).equals(TagService.KEY)) {
                 StatisticsService.reportEvent(StatisticsConstants.USER_FIRST_LIST);
                 Preferences.setBoolean(AstridPreferences.P_FIRST_LIST, false);
