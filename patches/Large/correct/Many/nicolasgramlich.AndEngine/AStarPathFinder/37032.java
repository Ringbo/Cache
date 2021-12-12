diff --git a/src/org/andengine/util/algorithm/path/astar/AStarPathFinder.java b/src/org/andengine/util/algorithm/path/astar/AStarPathFinder.java
index 2379319..534fc78 100644
--- a/src/org/andengine/util/algorithm/path/astar/AStarPathFinder.java
+++ b/src/org/andengine/util/algorithm/path/astar/AStarPathFinder.java
@@ -66,7 +66,7 @@
 
 		final LongSparseArray<Node> visitedNodes = new LongSparseArray<Node>();
 		final LongSparseArray<Node> openNodes = new LongSparseArray<Node>();
-		final IQueue<Node> sortedOpenNodes = new UniqueQueue<Node>(new SortedQueue<Node>(new ShiftList<Node>()));
+		final IQueue<Node> sortedOpenNodes = new SortedQueue<Node>(new ShiftList<Node>());
 
 		final boolean allowDiagonalMovement = pAllowDiagonal;
 
