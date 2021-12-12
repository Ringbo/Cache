diff --git a/src/main/java/com/yammer/metrics/core/ExponentiallyDecayingSample.java b/src/main/java/com/yammer/metrics/core/ExponentiallyDecayingSample.java
index 69c6395..f41eacc 100644
--- a/src/main/java/com/yammer/metrics/core/ExponentiallyDecayingSample.java
+++ b/src/main/java/com/yammer/metrics/core/ExponentiallyDecayingSample.java
@@ -113,7 +113,7 @@
 		final double priority = weight(timestamp - startTime) / random;
 		final long newCount = count.incrementAndGet();
 
-		if (newCount < reservoirSize) {
+		if (newCount <= reservoirSize) {
 			values.put(new Value(newCount, value, priority));
 		} else {
 			if (values.peek().priority < priority) {
