diff --git a/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunner.java b/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunner.java
index fafe6f6..b12766c 100644
--- a/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunner.java
+++ b/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunner.java
@@ -37,7 +37,7 @@
 public class PoshiRunner {
 
 	@Parameters(name = "{0}")
-	public static List<String> getList() throws PoshiRunnerException {
+	public static List<String> getList() throws Exception {
 		List<String> classCommandNames = new ArrayList<>();
 
 		String testName = PropsValues.TEST_NAME;
@@ -62,7 +62,7 @@
 		return classCommandNames;
 	}
 
-	public PoshiRunner(String classCommandName) throws PoshiRunnerException {
+	public PoshiRunner(String classCommandName) throws Exception {
 		LoggerUtil.startLogger();
 
 		SeleniumUtil.startSelenium();
@@ -87,7 +87,7 @@
 	}
 
 	private void _runClassCommandName(String classCommandName)
-		throws PoshiRunnerException {
+		throws Exception {
 
 		Element rootElement = PoshiRunnerContext.getTestcaseRootElement(
 			_testClassName);
@@ -116,15 +116,15 @@
 		}
 	}
 
-	private void _runCommand() throws PoshiRunnerException {
+	private void _runCommand() throws Exception {
 		_runClassCommandName(_testClassCommandName);
 	}
 
-	private void _runSetUp() throws PoshiRunnerException {
+	private void _runSetUp() throws Exception {
 		_runClassCommandName(_testClassName + "#set-up");
 	}
 
-	private void _runTearDown() throws PoshiRunnerException {
+	private void _runTearDown() throws Exception {
 		try {
 			_runClassCommandName(_testClassName + "#tear-down");
 		}
