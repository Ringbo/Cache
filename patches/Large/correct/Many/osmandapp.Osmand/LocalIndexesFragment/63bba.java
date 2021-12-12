diff --git a/OsmAnd/src/net/osmand/plus/download/LocalIndexesFragment.java b/OsmAnd/src/net/osmand/plus/download/LocalIndexesFragment.java
index ae89d97..cdf9af7 100644
--- a/OsmAnd/src/net/osmand/plus/download/LocalIndexesFragment.java
+++ b/OsmAnd/src/net/osmand/plus/download/LocalIndexesFragment.java
@@ -454,7 +454,7 @@
 			return true;
 		}
 		selectedItems.add(child);
-		listAdapter.notifyDataSetInvalidated();
+		listAdapter.notifyDataSetChanged();
 		return true;
 	}
 	
