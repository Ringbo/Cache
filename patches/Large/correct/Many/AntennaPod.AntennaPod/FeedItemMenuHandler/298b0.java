diff --git a/app/src/main/java/de/danoeh/antennapod/menuhandler/FeedItemMenuHandler.java b/app/src/main/java/de/danoeh/antennapod/menuhandler/FeedItemMenuHandler.java
index a586660..fe1a091 100644
--- a/app/src/main/java/de/danoeh/antennapod/menuhandler/FeedItemMenuHandler.java
+++ b/app/src/main/java/de/danoeh/antennapod/menuhandler/FeedItemMenuHandler.java
@@ -72,10 +72,10 @@
         }
 
         boolean isInQueue = queueAccess.contains(selectedItem.getId());
-        if(queueAccess.size() == 0 || queueAccess.get(0) != selectedItem.getId()) {
+        if(queueAccess.size() == 0 || queueAccess.get(0) == selectedItem.getId()) {
             mi.setItemVisibility(R.id.move_to_top_item, false);
         }
-        if(queueAccess.size() == 0 || queueAccess.get(queueAccess.size()-1) != selectedItem.getId()) {
+        if(queueAccess.size() == 0 || queueAccess.get(queueAccess.size()-1) == selectedItem.getId()) {
             mi.setItemVisibility(R.id.move_to_bottom_item, false);
         }
         if (!isInQueue || isPlaying) {
