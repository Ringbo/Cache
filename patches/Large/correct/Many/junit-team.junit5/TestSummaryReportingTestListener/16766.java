diff --git a/junit-console/src/main/java/org/junit/gen5/console/TestSummaryReportingTestListener.java b/junit-console/src/main/java/org/junit/gen5/console/TestSummaryReportingTestListener.java
index 5196d38..330ed15 100644
--- a/junit-console/src/main/java/org/junit/gen5/console/TestSummaryReportingTestListener.java
+++ b/junit-console/src/main/java/org/junit/gen5/console/TestSummaryReportingTestListener.java
@@ -82,7 +82,7 @@
 			+ "[%10d tests successful]\n"
 			+ "[%10d tests failed    ]\n",
 			msg, (this.timeFinished - this.timeStarted), this.testsFound.get(), this.testsStarted.get(),
-			this.testsSkipped.get(), this.testsAborted.get(), this.testsFailed.get(), this.testsSucceeded.get()));
+			this.testsSkipped.get(), this.testsAborted.get(), this.testsSucceeded.get(), this.testsFailed.get()));
 		// @formatter:on
 	}
 
