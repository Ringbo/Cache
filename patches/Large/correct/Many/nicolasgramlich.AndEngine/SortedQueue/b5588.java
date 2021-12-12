diff --git a/src/org/andengine/util/adt/queue/SortedQueue.java b/src/org/andengine/util/adt/queue/SortedQueue.java
index 8dc570e..23d9e63 100644
--- a/src/org/andengine/util/adt/queue/SortedQueue.java
+++ b/src/org/andengine/util/adt/queue/SortedQueue.java
@@ -38,7 +38,7 @@
 		if(this.isEmpty()) {
 			return null;
 		} else {
-			return this.removeFirst();
+			return this.get(0);
 		}
 	}
 
