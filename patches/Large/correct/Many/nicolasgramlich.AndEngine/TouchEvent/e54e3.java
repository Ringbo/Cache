diff --git a/src/org/anddev/andengine/input/touch/TouchEvent.java b/src/org/anddev/andengine/input/touch/TouchEvent.java
index 1dabca4..c36225f 100644
--- a/src/org/anddev/andengine/input/touch/TouchEvent.java
+++ b/src/org/anddev/andengine/input/touch/TouchEvent.java
@@ -53,11 +53,11 @@
 	}
 
 	public void recycle() {
-		TOUCHEVENT_POOL.recylePoolItem(this);
+		TOUCHEVENT_POOL.recyclePoolItem(this);
 	}
 
 	public static void recycle(final TouchEvent pTouchEvent) {
-		TOUCHEVENT_POOL.recylePoolItem(pTouchEvent);
+		TOUCHEVENT_POOL.recyclePoolItem(pTouchEvent);
 	}
 
 	// ===========================================================
