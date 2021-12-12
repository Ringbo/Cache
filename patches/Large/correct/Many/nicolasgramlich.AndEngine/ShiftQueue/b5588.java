diff --git a/src/org/andengine/util/adt/queue/ShiftQueue.java b/src/org/andengine/util/adt/queue/ShiftQueue.java
index 61dba84..f0e0387 100644
--- a/src/org/andengine/util/adt/queue/ShiftQueue.java
+++ b/src/org/andengine/util/adt/queue/ShiftQueue.java
@@ -42,7 +42,7 @@
 		if(this.isEmpty()) {
 			return null;
 		} else {
-			return this.removeFirst();
+			return this.get(0);
 		}
 	}
 
