diff --git a/src/main/java/reactor/core/publisher/FluxCreate.java b/src/main/java/reactor/core/publisher/FluxCreate.java
index dfe1344..c35d594 100644
--- a/src/main/java/reactor/core/publisher/FluxCreate.java
+++ b/src/main/java/reactor/core/publisher/FluxCreate.java
@@ -134,7 +134,7 @@
 			}
 			else {
 				Queue<T> q = queue;
-				synchronized (q) {
+				synchronized (this) {
 					q.offer(t);
 				}
 				if (WIP.getAndIncrement(this) != 0) {
