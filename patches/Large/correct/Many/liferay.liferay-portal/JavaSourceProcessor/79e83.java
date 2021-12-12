diff --git a/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java b/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
index 689dd42..8c8c2ed 100644
--- a/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
+++ b/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
@@ -1808,7 +1808,8 @@
 						}
 
 						if ((diff == 2) && (previousLineLeadingTabCount > 0) &&
-							line.endsWith(StringPool.SEMICOLON)) {
+							line.endsWith(StringPool.SEMICOLON) &&
+							!previousLine.contains(StringPool.TAB + "try (")) {
 
 							line = StringUtil.replaceFirst(
 								line, StringPool.TAB, StringPool.BLANK);
