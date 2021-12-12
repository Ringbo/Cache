diff --git a/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java b/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java
index 1427dca..416a4c8 100644
--- a/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java
@@ -180,7 +180,7 @@
 			}
 			String version = Version.getFullVersion(getOsmandApplication()) + " " + releasedate;
 			ShowArticleOnTouchListener listener = new ShowArticleOnTouchListener(
-					"feature_articles/about.html", getActivity(), name);
+					"feature_articles/about.html", getActivity(), version);
 
 			arrayList.add(new HelpMenuItem(getActivity().getString(R.string.shared_string_about), version, listener));
 			return arrayList;
