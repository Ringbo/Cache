diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/ShareMenuFragment.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/ShareMenuFragment.java
index 5bf5d96..bc19c75 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/ShareMenuFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/ShareMenuFragment.java
@@ -126,7 +126,7 @@
 	public void dismissMenu() {
 		menu.getMapActivity().getSupportFragmentManager().popBackStackImmediate(TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
 		if (menu.getMapActivity().getContextMenu().isVisible()) {
-			menu.getMapActivity().getContextMenu().hide(false);
+			menu.getMapActivity().getContextMenu().close();
 		}
 	}
 }
