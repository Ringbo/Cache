diff --git a/common/buildcraft/core/lib/utils/PathFindingSearch.java b/common/buildcraft/core/lib/utils/PathFindingSearch.java
index 86e775e..2b76552 100644
--- a/common/buildcraft/core/lib/utils/PathFindingSearch.java
+++ b/common/buildcraft/core/lib/utils/PathFindingSearch.java
@@ -52,7 +52,7 @@
 	@Override
 	public void iterate() {
 		if (pathFinders.size() < 5 && blockIter.hasNext()) {
-			iterateSearch(PATH_ITERATIONS * 50);
+			iterateSearch(PATH_ITERATIONS * 10);
 		}
 		iteratePathFind(PATH_ITERATIONS);
 	}
