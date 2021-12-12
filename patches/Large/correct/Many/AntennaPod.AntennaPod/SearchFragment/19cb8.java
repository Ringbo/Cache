diff --git a/src/de/danoeh/antennapod/fragment/SearchFragment.java b/src/de/danoeh/antennapod/fragment/SearchFragment.java
index b3ade4d..b1411cf 100644
--- a/src/de/danoeh/antennapod/fragment/SearchFragment.java
+++ b/src/de/danoeh/antennapod/fragment/SearchFragment.java
@@ -160,7 +160,7 @@
     private final EventDistributor.EventListener contentUpdate = new EventDistributor.EventListener() {
         @Override
         public void update(EventDistributor eventDistributor, Integer arg) {
-            if ((arg & (EventDistributor.DOWNLOAD_QUEUED)) != 0) {
+            if ((arg & (EventDistributor.DOWNLOAD_QUEUED)) != 0 && feedItemDialog != null) {
                 feedItemDialog.updateMenuAppearance();
             }
             if ((arg & (EventDistributor.UNREAD_ITEMS_UPDATE
