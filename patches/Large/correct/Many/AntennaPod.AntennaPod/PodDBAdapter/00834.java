diff --git a/core/src/main/java/de/danoeh/antennapod/core/storage/PodDBAdapter.java b/core/src/main/java/de/danoeh/antennapod/core/storage/PodDBAdapter.java
index 904a416..edb7598 100644
--- a/core/src/main/java/de/danoeh/antennapod/core/storage/PodDBAdapter.java
+++ b/core/src/main/java/de/danoeh/antennapod/core/storage/PodDBAdapter.java
@@ -1709,7 +1709,7 @@
                 db.execSQL("ALTER TABLE " + PodDBAdapter.TABLE_NAME_FEEDS
                         + " ADD COLUMN " + PodDBAdapter.KEY_AUTO_DELETE_ACTION + " INTEGER DEFAULT 0");
             }
-            if(oldVersion < 1030002) {
+            if(oldVersion < 1030005) {
                 db.execSQL("UPDATE FeedItems SET auto_download=0 WHERE " +
                         "(read=1 OR id IN (SELECT feeditem FROM FeedMedia WHERE position>0 OR downloaded=1)) " +
                         "AND id NOT IN (SELECT feeditem FROM Queue)");
