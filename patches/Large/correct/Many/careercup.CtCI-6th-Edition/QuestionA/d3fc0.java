diff --git a/Java/Ch 16. Moderate/Q16_18_Pattern_Matcher/QuestionA.java b/Java/Ch 16. Moderate/Q16_18_Pattern_Matcher/QuestionA.java
index d538c8e..c901c53 100644
--- a/Java/Ch 16. Moderate/Q16_18_Pattern_Matcher/QuestionA.java
+++ b/Java/Ch 16. Moderate/Q16_18_Pattern_Matcher/QuestionA.java
@@ -7,7 +7,7 @@
 		if (pattern.length() == 0) return value.length() == 0;
 		int size = value.length();
 		
-		for (int mainSize = 0; mainSize < size; mainSize++) {
+		for (int mainSize = 0; mainSize <= size; mainSize++) {
 			String main = value.substring(0, mainSize);
 			for (int altStart = mainSize; altStart <= size; altStart++) {
 				for (int altEnd = altStart; altEnd <= size; altEnd++) {
