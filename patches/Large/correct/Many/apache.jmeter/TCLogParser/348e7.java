diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/util/accesslog/TCLogParser.java b/src/protocol/http/org/apache/jmeter/protocol/http/util/accesslog/TCLogParser.java
index 9a30b1b..b78be1c 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/util/accesslog/TCLogParser.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/util/accesslog/TCLogParser.java
@@ -275,7 +275,7 @@
 				// parameters.
 				line = FILTER.filter(cleanedLine);
 				if (line != null) {
-					createUrl(cleanedLine, el);
+					createUrl(line, el);
 				}
 			} else {
 				log.debug("Line was filtered");
@@ -470,7 +470,7 @@
 	 * @return NVPair
 	 */
 	protected NVPair parseOneParameter(String parameter) {
-		String name = null;
+		String name = ""; // avoid possible NPE when trimming the name
 		String value = null;
 		try {
 			StringTokenizer param = this.tokenize(parameter, "=");
