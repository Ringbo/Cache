diff --git a/OsmAnd/src/net/osmand/plus/dialogs/ConfigureMapMenu.java b/OsmAnd/src/net/osmand/plus/dialogs/ConfigureMapMenu.java
index 46d82fc..e2193cc 100644
--- a/OsmAnd/src/net/osmand/plus/dialogs/ConfigureMapMenu.java
+++ b/OsmAnd/src/net/osmand/plus/dialogs/ConfigureMapMenu.java
@@ -556,7 +556,7 @@
 				final OsmandSettings.CommonPreference<String> pref = view.getApplication().getSettings()
 						.getCustomRenderProperty(p.getAttrName());
 				String descr;
-				if(Algorithms.isEmpty(pref.get())) {
+				if(!Algorithms.isEmpty(pref.get())) {
 					descr = SettingsActivity.getStringPropertyValue(activity, pref.get());
 				} else {
 					descr = SettingsActivity.getStringPropertyValue(view.getContext(),
