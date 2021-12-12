diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
index 9a6b0b6..3d3a0a3 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
@@ -720,7 +720,7 @@
 				Drawable leftIcon = leftTitleButtonController.getLeftIcon();
 				if (leftIcon != null) {
 					leftTitleButton.setCompoundDrawablesWithIntrinsicBounds(leftIcon, null, null, null);
-					leftTitleButton.setCompoundDrawablePadding(dpToPx(4f));
+					leftTitleButton.setCompoundDrawablePadding(dpToPx(8f));
 				}
 
 				if (leftTitleButtonController.needRightText) {
@@ -742,7 +742,7 @@
 
 				Drawable leftIcon = rightTitleButtonController.getLeftIcon();
 				rightTitleButton.setCompoundDrawablesWithIntrinsicBounds(leftIcon, null, null, null);
-				rightTitleButton.setCompoundDrawablePadding(dpToPx(4f));
+				rightTitleButton.setCompoundDrawablePadding(dpToPx(8f));
 			} else {
 				rightTitleButton.setVisibility(View.GONE);
 			}
@@ -755,7 +755,7 @@
 
 				Drawable leftIcon = topRightTitleButtonController.getLeftIcon();
 				topRightTitleButton.setCompoundDrawablesWithIntrinsicBounds(leftIcon, null, null, null);
-				topRightTitleButton.setCompoundDrawablePadding(dpToPx(4f));
+				topRightTitleButton.setCompoundDrawablePadding(dpToPx(8f));
 			} else {
 				topRightTitleButton.setVisibility(View.GONE);
 			}
@@ -769,7 +769,7 @@
 				Drawable leftIcon = leftSubtitleButtonController.getLeftIcon();
 				if (leftIcon != null) {
 					leftSubtitleButton.setCompoundDrawablesWithIntrinsicBounds(leftIcon, null, null, null);
-					leftSubtitleButton.setCompoundDrawablePadding(dpToPx(4f));
+					leftSubtitleButton.setCompoundDrawablePadding(dpToPx(8f));
 				}
 			} else {
 				leftSubtitleButton.setVisibility(View.GONE);
@@ -802,7 +802,7 @@
 				Drawable leftIcon = leftDownloadButtonController.getLeftIcon();
 				if (leftIcon != null) {
 					leftDownloadButton.setCompoundDrawablesWithIntrinsicBounds(leftIcon, null, null, null);
-					leftDownloadButton.setCompoundDrawablePadding(dpToPx(4f));
+					leftDownloadButton.setCompoundDrawablePadding(dpToPx(8f));
 				}
 			} else {
 				leftDownloadButton.setVisibility(View.GONE);
@@ -816,7 +816,7 @@
 
 				Drawable leftIcon = rightDownloadButtonController.getLeftIcon();
 				rightDownloadButton.setCompoundDrawablesWithIntrinsicBounds(leftIcon, null, null, null);
-				rightDownloadButton.setCompoundDrawablePadding(dpToPx(4f));
+				rightDownloadButton.setCompoundDrawablePadding(dpToPx(8f));
 			} else {
 				rightDownloadButton.setVisibility(View.GONE);
 			}
