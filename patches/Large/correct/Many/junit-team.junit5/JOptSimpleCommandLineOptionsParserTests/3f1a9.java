diff --git a/platform-tests/src/test/java/org/junit/platform/console/options/JOptSimpleCommandLineOptionsParserTests.java b/platform-tests/src/test/java/org/junit/platform/console/options/JOptSimpleCommandLineOptionsParserTests.java
index 908fe4e..e83b215 100644
--- a/platform-tests/src/test/java/org/junit/platform/console/options/JOptSimpleCommandLineOptionsParserTests.java
+++ b/platform-tests/src/test/java/org/junit/platform/console/options/JOptSimpleCommandLineOptionsParserTests.java
@@ -64,7 +64,7 @@
 			() -> assertParses("disable ansi", CommandLineOptions::isAnsiColorOutputDisabled, "--disable-ansi-colors"),
 			() -> assertParses("help", CommandLineOptions::isDisplayHelp, "-h", "--help"),
 			() -> assertParses("hide details", CommandLineOptions::isHideDetails, "--hide-details"),
-			() -> assertParses("scan class path", CommandLineOptions::isScanClasspath, "--scan-class-path", "-a", "--all")
+			() -> assertParses("scan class path", CommandLineOptions::isScanClasspath, "--scan-class-path")
 		);
 		// @formatter:on
 	}
