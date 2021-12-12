diff --git a/OsmAnd/src/net/osmand/plus/osmedit/OsmBugsLayer.java b/OsmAnd/src/net/osmand/plus/osmedit/OsmBugsLayer.java
index cd2bb2e..b00b996 100644
--- a/OsmAnd/src/net/osmand/plus/osmedit/OsmBugsLayer.java
+++ b/OsmAnd/src/net/osmand/plus/osmedit/OsmBugsLayer.java
@@ -77,7 +77,7 @@
 	public OsmBugsLayer(MapActivity activity, OsmEditingPlugin plugin){
 		this.activity = activity;
 		this.plugin = plugin;
-		local = new OsmBugsLocalUtil(activity);
+		local = new OsmBugsLocalUtil(activity, plugin.getDBBug());
 		remote = new OsmBugsRemoteUtil(activity.getMyApplication());
 	}
 	
