diff --git a/javamelody-core/src/test/java/net/bull/javamelody/TestSamplingProfiler.java b/javamelody-core/src/test/java/net/bull/javamelody/TestSamplingProfiler.java
index cf1f3d7..4d7261f 100644
--- a/javamelody-core/src/test/java/net/bull/javamelody/TestSamplingProfiler.java
+++ b/javamelody-core/src/test/java/net/bull/javamelody/TestSamplingProfiler.java
@@ -68,8 +68,8 @@
 	 */
 	@Test
 	public void testClassesInInclude() {
-		final SamplingProfiler samplingProfiler = new SamplingProfiler(null,
-				Arrays.asList("net.bull"));
+		final SamplingProfiler samplingProfiler = new SamplingProfiler(null, Arrays.asList(
+				"net.bull", "java"));
 		assertEmptyHotspots(samplingProfiler);
 		samplingProfiler.update();
 		samplingProfiler.clear();
@@ -135,7 +135,7 @@
 
 	private static void doSomeWorkAndTakeSample(SamplingProfiler samplingProfiler) {
 		final List<Thread> threads = new ArrayList<Thread>();
-		for (int i = 0; i < 5; i++) {
+		for (int i = 0; i < 10; i++) {
 			final Thread thread = new Thread(new DummyTask());
 			threads.add(thread);
 			thread.start();
@@ -153,7 +153,7 @@
 	static class DummyTask implements Runnable {
 		@Override
 		public void run() {
-			for (int i = 0; i < 1000000000; i++) {
+			for (int i = 0; i < 100000000; i++) {
 				Math.sqrt(i);
 			}
 		}
