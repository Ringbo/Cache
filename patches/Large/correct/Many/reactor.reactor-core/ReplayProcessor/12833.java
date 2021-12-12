diff --git a/src/main/java/reactor/core/publisher/ReplayProcessor.java b/src/main/java/reactor/core/publisher/ReplayProcessor.java
index 5449e8a..39b9f12 100644
--- a/src/main/java/reactor/core/publisher/ReplayProcessor.java
+++ b/src/main/java/reactor/core/publisher/ReplayProcessor.java
@@ -365,7 +365,7 @@
 
 		@Override
 		public int capacity() {
-			return size;
+			return batchSize;
 		}
 
 		@Override
