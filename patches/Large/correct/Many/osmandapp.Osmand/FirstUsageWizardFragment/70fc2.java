diff --git a/OsmAnd/src/net/osmand/plus/firstusage/FirstUsageWizardFragment.java b/OsmAnd/src/net/osmand/plus/firstusage/FirstUsageWizardFragment.java
index 6a85bc8..22f63e6 100644
--- a/OsmAnd/src/net/osmand/plus/firstusage/FirstUsageWizardFragment.java
+++ b/OsmAnd/src/net/osmand/plus/firstusage/FirstUsageWizardFragment.java
@@ -727,7 +727,7 @@
 			activity.getSupportFragmentManager()
 					.beginTransaction()
 					.replace(R.id.fragmentContainer, fragment, FirstUsageWizardFragment.TAG)
-					.commit();
+					.commitAllowingStateLoss();
 		}
 	}
 
