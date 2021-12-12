diff --git a/OsmAnd/src/net/osmand/plus/activities/actions/StartGPSStatus.java b/OsmAnd/src/net/osmand/plus/activities/actions/StartGPSStatus.java
index e7b91b5..ca61fc5 100644
--- a/OsmAnd/src/net/osmand/plus/activities/actions/StartGPSStatus.java
+++ b/OsmAnd/src/net/osmand/plus/activities/actions/StartGPSStatus.java
@@ -157,7 +157,7 @@
 			// if (g.activity.length() == 0) {
 				PackageManager pm = mapActivity.getPackageManager();
 				try {
-					String appName = !g.paidAppName.isEmpty() && 
+					String appName = !g.paidAppName.equals("") &&
 							g.installed(mapActivity, g.paidAppName) ? g.paidAppName : g.appName;
 					intent = pm.getLaunchIntentForPackage(appName);
 				} catch (RuntimeException e) {
