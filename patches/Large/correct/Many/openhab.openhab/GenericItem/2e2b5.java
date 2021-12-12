diff --git a/bundles/core/org.openhab.core/src/main/java/org/openhab/core/items/GenericItem.java b/bundles/core/org.openhab.core/src/main/java/org/openhab/core/items/GenericItem.java
index 9512de6..acf2ea5 100644
--- a/bundles/core/org.openhab.core/src/main/java/org/openhab/core/items/GenericItem.java
+++ b/bundles/core/org.openhab.core/src/main/java/org/openhab/core/items/GenericItem.java
@@ -117,7 +117,7 @@
 		notifyListeners(oldState, state);
 	}
 
-	private void notifyListeners(State oldState, State newState) {
+	private synchronized void notifyListeners(State oldState, State newState) {
 		// if nothing has changed, we do not need to send notifications
 		if(oldState.equals(newState)) return;
 		
