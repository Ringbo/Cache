diff --git a/src/org/zaproxy/zap/extension/search/SearchThread.java b/src/org/zaproxy/zap/extension/search/SearchThread.java
index fe11212..d4973e9 100644
--- a/src/org/zaproxy/zap/extension/search/SearchThread.java
+++ b/src/org/zaproxy/zap/extension/search/SearchThread.java
@@ -127,7 +127,8 @@
             }
 
 			List<Integer> list = Model.getSingleton().getDb().getTableHistory().getHistoryIdsOfHistType(session.getSessionId(),
-							HistoryReference.TYPE_PROXIED, HistoryReference.TYPE_ZAP_USER, HistoryReference.TYPE_SPIDER);
+							HistoryReference.TYPE_PROXIED, HistoryReference.TYPE_ZAP_USER, HistoryReference.TYPE_SPIDER,
+							HistoryReference.TYPE_SPIDER_AJAX);
 			int last = list.size();
 			int currentRecordId = 0;
 			for (int index=0;index < last;index++){
