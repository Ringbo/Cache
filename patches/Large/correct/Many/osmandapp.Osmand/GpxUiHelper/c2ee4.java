diff --git a/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java b/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
index 7c52cd7..6280149 100644
--- a/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
+++ b/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
@@ -637,7 +637,7 @@
 					}
 				});
 			}
-			dlg.getListView().addFooterView(footerView);
+			dlg.getListView().addFooterView(footerView, null, false);
 		}
 		dlg.getListView().setOnItemClickListener(new OnItemClickListener() {
 			@Override
