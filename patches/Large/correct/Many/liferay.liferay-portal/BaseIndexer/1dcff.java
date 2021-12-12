diff --git a/portal-service/src/com/liferay/portal/kernel/search/BaseIndexer.java b/portal-service/src/com/liferay/portal/kernel/search/BaseIndexer.java
index a6902e0..e2a78a4 100644
--- a/portal-service/src/com/liferay/portal/kernel/search/BaseIndexer.java
+++ b/portal-service/src/com/liferay/portal/kernel/search/BaseIndexer.java
@@ -1101,7 +1101,9 @@
 			catch (Exception e) {
 			}
 
-			if (paginationType.equals("more") && (docs.size() > end)) {
+			if (paginationType.equals("more") && (end > 0) &&
+					(docs.size() > end)) {
+
 				hasMore = true;
 
 				break;
