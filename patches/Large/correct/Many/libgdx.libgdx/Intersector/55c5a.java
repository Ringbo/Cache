diff --git a/gdx/src/com/badlogic/gdx/math/Intersector.java b/gdx/src/com/badlogic/gdx/math/Intersector.java
index 6221fb2..50f38e8 100644
--- a/gdx/src/com/badlogic/gdx/math/Intersector.java
+++ b/gdx/src/com/badlogic/gdx/math/Intersector.java
@@ -1056,13 +1056,13 @@
 
 		// set number of triangles
 		split.total = 3;
-		split.numFront = (r1 ? 1 : 0) + (r2 ? 1 : 0) + (r3 ? 1 : 0);
+		split.numFront = (r1 ? 0 : 1) + (r2 ? 0 : 1) + (r3 ? 0 : 1);
 		split.numBack = split.total - split.numFront;
 
 		// hard case, split the three edges on the plane
 		// determine which array to fill first, front or back, flip if we
 		// cross the plane
-		split.setSide(r1);
+		split.setSide(!r1);
 
 		// split first edge
 		int first = 0;
