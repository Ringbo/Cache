diff --git a/OsmAnd/src/net/osmand/plus/activities/SettingsNavigationActivity.java b/OsmAnd/src/net/osmand/plus/activities/SettingsNavigationActivity.java
index 9137258..67dbb6a 100644
--- a/OsmAnd/src/net/osmand/plus/activities/SettingsNavigationActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/SettingsNavigationActivity.java
@@ -174,7 +174,7 @@
 								p.getPossibleValueDescriptions(), svlss);
 					}
 					basePref.setTitle(SettingsBaseActivity.getRoutingStringPropertyName(this, p.getId(), p.getName()));
-					basePref.setSummary(SettingsBaseActivity.getRoutingStringPropertyName(this, p.getId(), p.getDescription()));
+					basePref.setSummary(SettingsBaseActivity.getRoutingStringPropertyDescription(this, p.getId(), p.getDescription()));
 					cat.addPreference(basePref);
 				}
 			}
