diff --git a/OsmAnd/src/net/osmand/plus/liveupdates/LiveUpdatesFragment.java b/OsmAnd/src/net/osmand/plus/liveupdates/LiveUpdatesFragment.java
index f7a2488..68b355f 100644
--- a/OsmAnd/src/net/osmand/plus/liveupdates/LiveUpdatesFragment.java
+++ b/OsmAnd/src/net/osmand/plus/liveupdates/LiveUpdatesFragment.java
@@ -238,7 +238,7 @@
 	}
 
 	public void notifyLiveUpdatesChanged() {
-		if (adapter != null) {
+		if (adapter != null && getMyApplication() != null && getActivity() != null) {
 			adapter.notifyLiveUpdatesChanged();
 		}
 	}
