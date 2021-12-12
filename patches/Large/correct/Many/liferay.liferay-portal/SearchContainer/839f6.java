diff --git a/portal-service/src/com/liferay/portal/kernel/dao/search/SearchContainer.java b/portal-service/src/com/liferay/portal/kernel/dao/search/SearchContainer.java
index ea07f68..e73c470 100644
--- a/portal-service/src/com/liferay/portal/kernel/dao/search/SearchContainer.java
+++ b/portal-service/src/com/liferay/portal/kernel/dao/search/SearchContainer.java
@@ -198,7 +198,7 @@
 	}
 
 	public int getEnd() {
-		if (!_calledSetTotal && _log.isWarnEnabled()) {
+		if (!calledSetTotal && _log.isWarnEnabled()) {
 			_log.warn(
 				"Call setTotal before calling getEnd since the value of " +
 					"setTotal may effect the value of getEnd");
@@ -324,7 +324,7 @@
 	}
 
 	public int getStart() {
-		if (!_calledSetTotal && _log.isWarnEnabled()) {
+		if (!calledSetTotal && _log.isWarnEnabled()) {
 			_log.warn(
 				"Call setTotal before calling getStart since the value of " +
 					"setTotal may effect the value of getStart");
