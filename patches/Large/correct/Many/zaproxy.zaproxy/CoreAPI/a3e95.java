diff --git a/src/org/zaproxy/zap/extension/api/CoreAPI.java b/src/org/zaproxy/zap/extension/api/CoreAPI.java
index 9d06415..ed4ca74 100644
--- a/src/org/zaproxy/zap/extension/api/CoreAPI.java
+++ b/src/org/zaproxy/zap/extension/api/CoreAPI.java
@@ -1123,7 +1123,7 @@
 		} catch (HttpMalformedHeaderException | DatabaseException e) {
 			throw new ApiException(ApiException.Type.INTERNAL_ERROR, e);
 		}
-		if (recordHistory == null || recordHistory.getHistoryType() == HistoryReference.TYPE_TEMPORARY) {
+		if (recordHistory == null) {
 			throw new ApiException(ApiException.Type.DOES_NOT_EXIST, Integer.toString(id));
 		}
 		return recordHistory;
@@ -1585,8 +1585,7 @@
 		try {
 			TableHistory tableHistory = Model.getSingleton().getDb()
 					.getTableHistory();
-			List<Integer> historyIds = tableHistory.getHistoryIdsExceptOfHistType(Model
-					.getSingleton().getSession().getSessionId(), HistoryReference.TYPE_TEMPORARY);
+			List<Integer> historyIds = tableHistory.getHistoryIds(Model.getSingleton().getSession().getSessionId());
 
 			PaginationConstraintsChecker pcc = new PaginationConstraintsChecker(start, count);
 			for (Integer id : historyIds) {
