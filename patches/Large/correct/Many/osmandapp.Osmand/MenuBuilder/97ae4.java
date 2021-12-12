diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuBuilder.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuBuilder.java
index ff4f0ab..7d53141 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuBuilder.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuBuilder.java
@@ -693,7 +693,7 @@
 	}
 
 	public void addPlainMenuItem(int iconId, String text, boolean needLinks, boolean isUrl, OnClickListener onClickListener) {
-		plainMenuItems.add(new PlainMenuItem(iconId, text, null, needLinks, isUrl, false, null, onClickListener));
+		plainMenuItems.add(new PlainMenuItem(iconId, null, text, needLinks, isUrl, false, null, onClickListener));
 	}
 
 	public void addPlainMenuItem(int iconId, String buttonText, String text, boolean needLinks, boolean isUrl, OnClickListener onClickListener) {
@@ -703,7 +703,7 @@
 	public void addPlainMenuItem(int iconId, String text, boolean needLinks, boolean isUrl,
 								 boolean collapsable, CollapsableView collapsableView,
 								 OnClickListener onClickListener) {
-		plainMenuItems.add(new PlainMenuItem(iconId, text, null, needLinks, isUrl, collapsable, collapsableView, onClickListener));
+		plainMenuItems.add(new PlainMenuItem(iconId, null, text, needLinks, isUrl, collapsable, collapsableView, onClickListener));
 	}
 
 	public void clearPlainMenuItems() {
