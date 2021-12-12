diff --git a/OsmAnd/src/net/osmand/plus/osmo/OsMoPlugin.java b/OsmAnd/src/net/osmand/plus/osmo/OsMoPlugin.java
index 0b24bde..94c3a12 100644
--- a/OsmAnd/src/net/osmand/plus/osmo/OsMoPlugin.java
+++ b/OsmAnd/src/net/osmand/plus/osmo/OsMoPlugin.java
@@ -49,7 +49,7 @@
 		service = new OsMoService(app);
 		tracker = new OsMoTracker(service, app.getSettings().OSMO_SAVE_TRACK_INTERVAL,
 				app.getSettings().OSMO_AUTO_SEND_LOCATIONS);
-		new OsMoControlDevice(app, service);
+		new OsMoControlDevice(app, service, tracker);
 		groups = new OsMoGroups(service, tracker, app.getSettings());
 		this.app = app;
 		ApplicationMode.regWidget("osmo_control", (ApplicationMode[])null);
