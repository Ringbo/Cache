diff --git a/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java b/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java
index d314709..970455e 100644
--- a/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java
+++ b/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java
@@ -266,7 +266,7 @@
 		FragmentManager fragmentManager = getSupportFragmentManager();
 		Fragment fragment = fragments.get(item);
 		if (new Integer(R.string.sherpafy_tours).equals(item)) {
-			if (fragment == null) {
+			if (fragment == null || fragment.getActivity() == null) {
 				fragment = new SherpafySelectToursFragment();
 				fragments.put(item, fragment);
 			} else {
