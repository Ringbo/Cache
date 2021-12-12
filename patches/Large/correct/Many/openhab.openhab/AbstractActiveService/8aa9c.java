diff --git a/bundles/core/org.openhab.core/src/main/java/org/openhab/core/service/AbstractActiveService.java b/bundles/core/org.openhab.core/src/main/java/org/openhab/core/service/AbstractActiveService.java
index 1e1c8ac..09d9807 100644
--- a/bundles/core/org.openhab.core/src/main/java/org/openhab/core/service/AbstractActiveService.java
+++ b/bundles/core/org.openhab.core/src/main/java/org/openhab/core/service/AbstractActiveService.java
@@ -161,7 +161,7 @@
 		
 		@Override
 		public void run() {
-			logger.debug(getName() + " has been started");
+			logger.info(getName() + " has been started");
 			
 			while (!shutdown) {
 				try {
