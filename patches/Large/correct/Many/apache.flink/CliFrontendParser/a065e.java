diff --git a/flink-clients/src/main/java/org/apache/flink/client/cli/CliFrontendParser.java b/flink-clients/src/main/java/org/apache/flink/client/cli/CliFrontendParser.java
index 4e081fd..07d409e 100644
--- a/flink-clients/src/main/java/org/apache/flink/client/cli/CliFrontendParser.java
+++ b/flink-clients/src/main/java/org/apache/flink/client/cli/CliFrontendParser.java
@@ -339,7 +339,7 @@
 	public static InfoOptions parseInfoCommand(String[] args) throws CliArgsException {
 		try {
 			PosixParser parser = new PosixParser();
-			CommandLine line = parser.parse(INFO_OPTIONS, args, false);
+			CommandLine line = parser.parse(INFO_OPTIONS, args, true);
 			return new InfoOptions(line);
 		}
 		catch (ParseException e) {
