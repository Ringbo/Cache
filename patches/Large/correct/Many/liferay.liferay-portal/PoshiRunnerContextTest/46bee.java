diff --git a/modules/test/poshi-runner/test/unit/com/liferay/poshi/runner/PoshiRunnerContextTest.java b/modules/test/poshi-runner/test/unit/com/liferay/poshi/runner/PoshiRunnerContextTest.java
index 574dcc1..3a50027 100644
--- a/modules/test/poshi-runner/test/unit/com/liferay/poshi/runner/PoshiRunnerContextTest.java
+++ b/modules/test/poshi-runner/test/unit/com/liferay/poshi/runner/PoshiRunnerContextTest.java
@@ -140,7 +140,7 @@
 	}
 
 	@Test
-	public void testGetPathLocator() {
+	public void testGetPathLocator() throws Exception {
 		String locator = PoshiRunnerContext.getPathLocator(
 			"Action1#TEST_TITLE");
 
