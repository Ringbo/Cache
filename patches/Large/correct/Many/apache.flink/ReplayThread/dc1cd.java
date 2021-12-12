diff --git a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/checkpointing/ReplayThread.java b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/checkpointing/ReplayThread.java
index 0f15fb2..0a5158c 100644
--- a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/checkpointing/ReplayThread.java
+++ b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/checkpointing/ReplayThread.java
@@ -110,7 +110,7 @@
 			final Iterator<ReplayOutputBroker> it = this.outputBrokerMap.values().iterator();
 			while (it.hasNext()) {
 
-				if (it.next().hasFinished()) {
+				if (!it.next().hasFinished()) {
 					finished = false;
 				}
 			}
