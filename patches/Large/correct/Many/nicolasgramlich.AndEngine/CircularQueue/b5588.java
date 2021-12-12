diff --git a/src/org/andengine/util/adt/queue/CircularQueue.java b/src/org/andengine/util/adt/queue/CircularQueue.java
index 5533934..5cec43b 100644
--- a/src/org/andengine/util/adt/queue/CircularQueue.java
+++ b/src/org/andengine/util/adt/queue/CircularQueue.java
@@ -42,7 +42,7 @@
 		if(this.isEmpty()) {
 			return null;
 		} else {
-			return this.removeFirst();
+			return this.get(0);
 		}
 	}
 
