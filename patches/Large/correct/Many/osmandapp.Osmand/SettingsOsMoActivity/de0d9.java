diff --git a/OsmAnd/src/net/osmand/plus/osmo/SettingsOsMoActivity.java b/OsmAnd/src/net/osmand/plus/osmo/SettingsOsMoActivity.java
index c829ece..1024542 100644
--- a/OsmAnd/src/net/osmand/plus/osmo/SettingsOsMoActivity.java
+++ b/OsmAnd/src/net/osmand/plus/osmo/SettingsOsMoActivity.java
@@ -96,7 +96,7 @@
 				ShareDialog dlg = new ShareDialog(this);
 				dlg.setTitle(getString(R.string.osmo_tracker_id));
 				dlg.viewContent(ci.trackerId);
-				dlg.shareURLOrText(ci.trackerId, getString(R.string.osmo_tracker_id_share, ci.trackerId), null);
+				dlg.shareURLOrText(ci.trackerId, getString(R.string.osmo_tracker_id_share, ci.trackerId, ""), null);
 				dlg.showDialog();
 			}
 		}
