diff --git a/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
index 0373445..8cf25ae 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
@@ -4104,7 +4104,7 @@
 
 	protected boolean isUseComplexSQL(long[] classNameIds) {
 		if ((classNameIds == null) || (classNameIds.length == 0)) {
-			return false;
+			return true;
 		}
 
 		if (_complexSQLClassNameIds == null) {
@@ -4126,11 +4126,11 @@
 
 		for (long classNameId : classNameIds) {
 			if (ArrayUtil.contains(_complexSQLClassNameIds, classNameId)) {
-				return false;
+				return true;
 			}
 		}
 
-		return true;
+		return false;
 	}
 
 	protected boolean matches(String s, String[] keywords) {
