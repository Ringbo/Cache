diff --git a/OsmAnd/src/net/osmand/plus/osmodroid/OsMoDroidPlugin.java b/OsmAnd/src/net/osmand/plus/osmodroid/OsMoDroidPlugin.java
index 88efedb..3b65265 100644
--- a/OsmAnd/src/net/osmand/plus/osmodroid/OsMoDroidPlugin.java
+++ b/OsmAnd/src/net/osmand/plus/osmodroid/OsMoDroidPlugin.java
@@ -221,9 +221,9 @@
 			@Override
 			public void onContextMenuClick(int itemId, int pos, boolean isChecked, DialogInterface dialog) {
 				if (off) {
-					init(app);
+					Activate(app);
 				} else {
-					shutdown(app);
+					Deactivate(app);
 				}
 			}
 		}).reg();
