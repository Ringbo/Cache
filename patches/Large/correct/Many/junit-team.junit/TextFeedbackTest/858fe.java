diff --git a/junit/tests/runner/TextFeedbackTest.java b/junit/tests/runner/TextFeedbackTest.java
index 232143c..a6f7f4f 100644
--- a/junit/tests/runner/TextFeedbackTest.java
+++ b/junit/tests/runner/TextFeedbackTest.java
@@ -79,7 +79,7 @@
 	
 	public void testError() {
 		String expected= expected(new String[]{".E", "Time: 0", "Errors here", "", "FAILURES!!!", "Tests run: 1,  Failures: 0,  Errors: 1", ""});
-		ResultPrinter printer= new ResultPrinter(new PrintStream(output)) {
+		ResultPrinter printer= new TestResultPrinter(new PrintStream(output)) {
 			public void printErrors(TestResult result) {
 				getWriter().println("Errors here");
 			}
