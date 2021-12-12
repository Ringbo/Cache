diff --git a/OsmAnd/src/net/osmand/plus/firstusage/FirstUsageWizardFragment.java b/OsmAnd/src/net/osmand/plus/firstusage/FirstUsageWizardFragment.java
index b2fee4e..e352bb0 100644
--- a/OsmAnd/src/net/osmand/plus/firstusage/FirstUsageWizardFragment.java
+++ b/OsmAnd/src/net/osmand/plus/firstusage/FirstUsageWizardFragment.java
@@ -682,7 +682,7 @@
 				}
 				for (BinaryMapDataObject o : mapDataObjects) {
 					String fullName = osmandRegions.getFullName(o);
-					if (fullName.length() > selectedFullName.length()) {
+					if (fullName != null && fullName.length() > selectedFullName.length()) {
 						selectedFullName = fullName;
 					}
 				}
