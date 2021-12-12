diff --git a/src/java/azkaban/utils/Utils.java b/src/java/azkaban/utils/Utils.java
index 257508a..44edfaa 100644
--- a/src/java/azkaban/utils/Utils.java
+++ b/src/java/azkaban/utils/Utils.java
@@ -322,7 +322,7 @@
 	public static ReadablePeriod parsePeriodString(String periodStr) {
 		ReadablePeriod period;
 		char periodUnit = periodStr.charAt(periodStr.length() - 1);
-		if (periodUnit == 'n') {
+		if (periodStr.equals("null") || periodUnit == 'n') {
 			return null;
 		}
 
