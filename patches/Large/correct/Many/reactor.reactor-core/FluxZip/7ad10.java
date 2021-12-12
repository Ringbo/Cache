diff --git a/src/main/java/reactor/core/publisher/FluxZip.java b/src/main/java/reactor/core/publisher/FluxZip.java
index 011bb84..04b115d 100644
--- a/src/main/java/reactor/core/publisher/FluxZip.java
+++ b/src/main/java/reactor/core/publisher/FluxZip.java
@@ -554,7 +554,7 @@
 		public long getPending() {
 			int nonEmpties = 0;
 			for(int i =0; i < subscribers.length; i++){
-				if(subscribers[i].queue != null && subscribers[i].queue .isEmpty()){
+				if(subscribers[i].queue != null && !subscribers[i].queue .isEmpty()){
 					nonEmpties++;
 				}
 			}
