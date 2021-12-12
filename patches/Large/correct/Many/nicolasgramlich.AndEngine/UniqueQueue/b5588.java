diff --git a/src/org/andengine/util/adt/queue/UniqueQueue.java b/src/org/andengine/util/adt/queue/UniqueQueue.java
index d46522e..94ebfd3 100644
--- a/src/org/andengine/util/adt/queue/UniqueQueue.java
+++ b/src/org/andengine/util/adt/queue/UniqueQueue.java
@@ -38,7 +38,7 @@
 		if(this.isEmpty()) {
 			return null;
 		} else {
-			return this.removeFirst();
+			return this.get(0);
 		}
 	}
 
