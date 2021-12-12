diff --git a/common/buildcraft/core/utils/concurrency/PathFindingSearch.java b/common/buildcraft/core/utils/concurrency/PathFindingSearch.java
index 445fa76..23e0cb4 100644
--- a/common/buildcraft/core/utils/concurrency/PathFindingSearch.java
+++ b/common/buildcraft/core/utils/concurrency/PathFindingSearch.java
@@ -53,7 +53,7 @@
 	@Override
 	public void iterate() {
 		if (pathFinders.size() < 5 && blockIter.hasNext()) {
-			iterateSearch(PATH_ITERATIONS * 50);
+			iterateSearch(PATH_ITERATIONS * 10);
 		}
 		iteratePathFind(PATH_ITERATIONS);
 	}
