diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/broadcast/BroadcastVariableMaterialization.java b/flink-runtime/src/main/java/org/apache/flink/runtime/broadcast/BroadcastVariableMaterialization.java
index 86e0111..eb7e311 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/broadcast/BroadcastVariableMaterialization.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/broadcast/BroadcastVariableMaterialization.java
@@ -137,7 +137,7 @@
 				while ((element = readerIterator.next(element)) != null);
 				
 				synchronized (materializationMonitor) {
-					while (!this.materialized) {
+					while (!this.materialized && !disposed) {
 						materializationMonitor.wait();
 					}
 				}
@@ -209,7 +209,7 @@
 			throw new IllegalStateException("The Broadcast Variable has been disposed");
 		}
 		
-		synchronized (this) {
+		synchronized (references) {
 			if (transformed != null) {
 				if (transformed instanceof List) {
 					@SuppressWarnings("unchecked")
@@ -233,7 +233,7 @@
 			throw new IllegalStateException("The Broadcast Variable has been disposed");
 		}
 		
-		synchronized (this) {
+		synchronized (references) {
 			if (transformed == null) {
 				transformed = initializer.initializeBroadcastVariable(data);
 				data = null;
