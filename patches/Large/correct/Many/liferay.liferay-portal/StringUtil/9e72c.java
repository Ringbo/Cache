diff --git a/portal-service/src/com/liferay/portal/kernel/util/StringUtil.java b/portal-service/src/com/liferay/portal/kernel/util/StringUtil.java
index 7b3de04..0862808 100644
--- a/portal-service/src/com/liferay/portal/kernel/util/StringUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/util/StringUtil.java
@@ -3913,7 +3913,7 @@
 		int x = s.lastIndexOf(StringPool.OPEN_PARENTHESIS);
 		int y = s.lastIndexOf(StringPool.CLOSE_PARENTHESIS);
 
-		if ((x != -1) || (y != -1)) {
+		if ((x == -1) || (y == -1)) {
 			return s;
 		}
 
