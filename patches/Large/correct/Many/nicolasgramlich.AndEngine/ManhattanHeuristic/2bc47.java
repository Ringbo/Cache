diff --git a/src/org/andengine/util/algorithm/path/astar/ManhattanHeuristic.java b/src/org/andengine/util/algorithm/path/astar/ManhattanHeuristic.java
index 2e8fe85..66f3b50 100644
--- a/src/org/andengine/util/algorithm/path/astar/ManhattanHeuristic.java
+++ b/src/org/andengine/util/algorithm/path/astar/ManhattanHeuristic.java
@@ -32,7 +32,7 @@
 
 	@Override
 	public float getExpectedRestCost(final IPathFinderMap<T> pPathFinderMap, final T pEntity, final int pFromX, final int pFromY, final int pToX, final int pToY) {
-		return Math.abs(pFromX - pToX) + Math.abs(pToX - pToY);
+		return Math.abs(pFromX - pToX) + Math.abs(pFromY - pToY);
 	}
 
 	// ===========================================================
