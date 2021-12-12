diff --git a/src/main/java/com/metaweb/gridworks/browsing/facets/NumericBinIndex.java b/src/main/java/com/metaweb/gridworks/browsing/facets/NumericBinIndex.java
index b34d3b4..ded39d4 100644
--- a/src/main/java/com/metaweb/gridworks/browsing/facets/NumericBinIndex.java
+++ b/src/main/java/com/metaweb/gridworks/browsing/facets/NumericBinIndex.java
@@ -44,9 +44,9 @@
 			}
 		}
 		
-		if (getMin() >= getMax()) {
+		if (_min >= _max) {
 			_step = 0;
-			_bins = new int[0];
+			_bins = new int[1];
 			return;
 		}
 		
