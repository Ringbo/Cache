diff --git a/spring-boot/src/main/java/org/springframework/boot/json/BasicJsonParser.java b/spring-boot/src/main/java/org/springframework/boot/json/BasicJsonParser.java
index ec43e0c..9b0b40a 100644
--- a/spring-boot/src/main/java/org/springframework/boot/json/BasicJsonParser.java
+++ b/spring-boot/src/main/java/org/springframework/boot/json/BasicJsonParser.java
@@ -93,14 +93,14 @@
 	}
 
 	private static String trimTrailingCharacter(String string, char c) {
-		if (string.length() >= 0 && string.charAt(string.length() - 1) == c) {
+		if (string.length() > 0 && string.charAt(string.length() - 1) == c) {
 			return string.substring(0, string.length() - 1);
 		}
 		return string;
 	}
 
 	private static String trimLeadingCharacter(String string, char c) {
-		if (string.length() >= 0 && string.charAt(0) == c) {
+		if (string.length() > 0 && string.charAt(0) == c) {
 			return string.substring(1);
 		}
 		return string;
