diff --git a/src/main/java/reactor/core/publisher/ReplayProcessor.java b/src/main/java/reactor/core/publisher/ReplayProcessor.java
index 39b9f12..ca68261 100644
--- a/src/main/java/reactor/core/publisher/ReplayProcessor.java
+++ b/src/main/java/reactor/core/publisher/ReplayProcessor.java
@@ -602,7 +602,7 @@
 
 		@Override
 		public int capacity() {
-			return size;
+			return limit;
 		}
 
 		@Override
