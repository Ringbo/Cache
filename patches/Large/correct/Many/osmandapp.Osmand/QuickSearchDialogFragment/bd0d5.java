diff --git a/OsmAnd/src/net/osmand/plus/search/QuickSearchDialogFragment.java b/OsmAnd/src/net/osmand/plus/search/QuickSearchDialogFragment.java
index 416c205..3917365 100644
--- a/OsmAnd/src/net/osmand/plus/search/QuickSearchDialogFragment.java
+++ b/OsmAnd/src/net/osmand/plus/search/QuickSearchDialogFragment.java
@@ -265,7 +265,7 @@
 
 			@Override
 			public int getSearchPriority(SearchPhrase p) {
-				if(!p.isNoSelectedType()) {
+				if(!p.isNoSelectedType() || p.getLastWord().isEmpty()) {
 					return -1;
 				}
 				return SEARCH_FAVORITE_API_PRIORITY;
