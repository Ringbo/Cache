diff --git a/OsmAnd/src/net/osmand/plus/FirstUsageFragment.java b/OsmAnd/src/net/osmand/plus/FirstUsageFragment.java
index 9e6acb5..6d256d4 100644
--- a/OsmAnd/src/net/osmand/plus/FirstUsageFragment.java
+++ b/OsmAnd/src/net/osmand/plus/FirstUsageFragment.java
@@ -26,7 +26,7 @@
 		View view = inflater.inflate(R.layout.first_usage_fragment, container, false);
 		final EditText editText = (EditText) view.findViewById(R.id.searchEditText);
 		Drawable searchIcon = ((MapActivity) getActivity()).getMyApplication().getIconsCache()
-				.getContentIcon(R.drawable.ic_action_search_dark);
+				.getIcon(R.drawable.ic_action_search_dark, true);
 		editText.setCompoundDrawablesWithIntrinsicBounds(searchIcon, null, null, null);
 		Button skipButton = (Button) view.findViewById(R.id.skip_button);
 		skipButton.setOnClickListener(new View.OnClickListener() {
