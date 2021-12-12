diff --git a/src/org/andengine/engine/handler/runnable/RunnableHandler.java b/src/org/andengine/engine/handler/runnable/RunnableHandler.java
index dd1babe..e82e4e0 100644
--- a/src/org/andengine/engine/handler/runnable/RunnableHandler.java
+++ b/src/org/andengine/engine/handler/runnable/RunnableHandler.java
@@ -45,7 +45,7 @@
 	}
 
 	@Override
-	public void reset() {
+	public synchronized void reset() {
 		this.mRunnables.clear();
 	}
 
