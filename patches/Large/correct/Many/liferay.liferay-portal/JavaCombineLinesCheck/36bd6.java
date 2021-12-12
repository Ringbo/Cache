diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaCombineLinesCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaCombineLinesCheck.java
index 39e635d..1883628 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaCombineLinesCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaCombineLinesCheck.java
@@ -532,7 +532,8 @@
 
 				if ((previousLine.endsWith(" =") ||
 					 previousLine.endsWith(" ->")) &&
-					line.endsWith(StringPool.OPEN_PARENTHESIS)) {
+					line.endsWith(StringPool.OPEN_PARENTHESIS) &&
+					!line.matches(".* [<=>]+ .*")) {
 
 					int level = getLevel(line);
 
