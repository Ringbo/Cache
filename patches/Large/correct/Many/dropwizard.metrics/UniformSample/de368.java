diff --git a/src/main/java/com/yammer/metrics/core/UniformSample.java b/src/main/java/com/yammer/metrics/core/UniformSample.java
index 9d30d2d..1303b41 100644
--- a/src/main/java/com/yammer/metrics/core/UniformSample.java
+++ b/src/main/java/com/yammer/metrics/core/UniformSample.java
@@ -50,7 +50,7 @@
 	@Override
 	public void update(long value) {
 		final long c = count.incrementAndGet();
-		if (c < values.length()) {
+		if (c <= values.length()) {
 			values.set((int) c - 1, value);
 		} else {
 			final int r = (int) (Math.abs(RANDOM.nextLong()) % c);
