diff --git a/OsmAnd/src/net/osmand/plus/osmo/OsMoTracker.java b/OsmAnd/src/net/osmand/plus/osmo/OsMoTracker.java
index a738df9..f1e58fa 100644
--- a/OsmAnd/src/net/osmand/plus/osmo/OsMoTracker.java
+++ b/OsmAnd/src/net/osmand/plus/osmo/OsMoTracker.java
@@ -39,7 +39,7 @@
 	}
 	
 	public String getSessionURL() {
-		if (!isEnabledTracker()) {
+		if (!isEnabledTracker() || sessionURL == null) {
 			return null;
 		}
 		return OsMoService.TRACK_URL + sessionURL;
