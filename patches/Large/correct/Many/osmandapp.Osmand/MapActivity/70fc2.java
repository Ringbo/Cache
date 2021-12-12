diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
index 4b86e46..b6abc00 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
@@ -281,7 +281,7 @@
 			FirstUsageWelcomeFragment.SHOW = false;
 			getSupportFragmentManager().beginTransaction()
 					.add(R.id.fragmentContainer, new FirstUsageWelcomeFragment(),
-							FirstUsageWelcomeFragment.TAG).commit();
+							FirstUsageWelcomeFragment.TAG).commitAllowingStateLoss();
 		}
 		mapActions.updateDrawerMenu();
 		drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
