diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaLineBreakCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaLineBreakCheck.java
index b79f99f..775a851 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaLineBreakCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaLineBreakCheck.java
@@ -369,9 +369,9 @@
 					matcher.start(8));
 			}
 
-			String firstTrailingNonWhitespace = matcher.group(12);
+			String firstTrailingNonWhitespace = matcher.group(13);
 
-			String trailingWhitespace = matcher.group(11);
+			String trailingWhitespace = matcher.group(12);
 
 			if (!trailingWhitespace.contains("\n") &&
 				!firstTrailingNonWhitespace.equals("}")) {
@@ -874,7 +874,7 @@
 	private final Pattern _classOrEnumPattern = Pattern.compile(
 		"(\n(\t*)(private|protected|public) ((abstract|static) )*" +
 			"(class|enum|interface) ([\\s\\S]*?)\\{)((.*)\\})?" +
-				"(\\Z|\n(\\s*)(\\S))");
+				"([ \t]*(\\Z|\n)(\\s*)(\\S))");
 	private final Pattern _incorrectLineBreakInsideChainPattern1 =
 		Pattern.compile("\n(\t*)\\).*?\\((.+)");
 	private final Pattern _incorrectLineBreakInsideChainPattern2 =
