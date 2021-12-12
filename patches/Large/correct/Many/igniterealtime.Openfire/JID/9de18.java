diff --git a/src/java/org/xmpp/packet/JID.java b/src/java/org/xmpp/packet/JID.java
index 9214786..248543c 100644
--- a/src/java/org/xmpp/packet/JID.java
+++ b/src/java/org/xmpp/packet/JID.java
@@ -578,7 +578,7 @@
 		public void put(K entry) {
 			synchronized (entry) {
 				// add value to the cache
-				if (cachedValues.put(entry, NULL) != null) {
+				if (cachedValues.put(entry, NULL) == null) {
 					// ensure that queue doesn't contain duplicates.
 					fifoQueue.offer(entry);
 				}
