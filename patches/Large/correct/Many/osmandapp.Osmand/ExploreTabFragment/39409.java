diff --git a/OsmAnd/src/net/osmand/plus/wikivoyage/explore/ExploreTabFragment.java b/OsmAnd/src/net/osmand/plus/wikivoyage/explore/ExploreTabFragment.java
index b6f46e7..7c50143 100644
--- a/OsmAnd/src/net/osmand/plus/wikivoyage/explore/ExploreTabFragment.java
+++ b/OsmAnd/src/net/osmand/plus/wikivoyage/explore/ExploreTabFragment.java
@@ -21,7 +21,7 @@
 	@Override
 	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
 		OsmandApplication app = getMyApplication();
-		boolean nightMode = app.getDaynightHelper().isNightModeForMapControls();
+		boolean nightMode = app.getDaynightHelper().isNightMode();
 
 		final View mainView = inflater.inflate(R.layout.fragment_explore_tab, container, false);
 
