diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
index c60648e..b251092 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
@@ -1492,7 +1492,7 @@
 			boolean progressVisible = menu.getTitleProgressController() != null && menu.getTitleProgressController().visible;
 			updateButtonsAndProgress();
 			if (wasProgressVisible != progressVisible) {
-				runLayoutListener();
+				refreshTitle();
 			}
 		}
 	}
