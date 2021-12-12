diff --git a/portal-service/src/com/liferay/portal/kernel/util/KMPSearch.java b/portal-service/src/com/liferay/portal/kernel/util/KMPSearch.java
index fb8d9a8..19e2d8a 100644
--- a/portal-service/src/com/liferay/portal/kernel/util/KMPSearch.java
+++ b/portal-service/src/com/liferay/portal/kernel/util/KMPSearch.java
@@ -210,7 +210,11 @@
 		int j = 0;
 
 		while (i < length && j < patternLength) {
-			if ((j == -1) || (text.charAt(i + offset) == pattern.charAt(j))) {
+			if ((j == -1) ||
+				(text.charAt(i + offset) == pattern.charAt(j)) ||
+				(text.charAt(i + offset) == Character.toUpperCase(
+					pattern.charAt(j)))) {
+
 				i++;
 				j++;
 			}
