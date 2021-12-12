diff --git a/core/src/main/java/de/danoeh/antennapod/core/storage/PodDBAdapter.java b/core/src/main/java/de/danoeh/antennapod/core/storage/PodDBAdapter.java
index 0cceebd..5b7f5f7 100644
--- a/core/src/main/java/de/danoeh/antennapod/core/storage/PodDBAdapter.java
+++ b/core/src/main/java/de/danoeh/antennapod/core/storage/PodDBAdapter.java
@@ -1151,7 +1151,7 @@
      * The returned cursor uses the FEEDITEM_SEL_FI_SMALL selection.
      */
     public final Cursor getNewItemsCursor() {
-        String[] args = new String[] {
+        Object[] args = new String[] {
                 SEL_FI_SMALL_STR,
                 TABLE_NAME_FEED_ITEMS,
                 TABLE_NAME_FEEDS,
