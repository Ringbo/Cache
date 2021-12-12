diff --git a/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/io/InputGate.java b/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/io/InputGate.java
index 9b09257..e60e95c 100644
--- a/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/io/InputGate.java
+++ b/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/io/InputGate.java
@@ -632,7 +632,7 @@
 		if (this.channelToReadFrom == -1) {
 
 			if (this.isClosed()) {
-				return false;
+				return true;
 			}
 
 			synchronized (this.availableChannels) {
