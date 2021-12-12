diff --git a/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/filter/SyncJSONHttpServletRequestWrapper.java b/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/filter/SyncJSONHttpServletRequestWrapper.java
index ad69020..4e73f4f 100644
--- a/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/filter/SyncJSONHttpServletRequestWrapper.java
+++ b/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/filter/SyncJSONHttpServletRequestWrapper.java
@@ -84,7 +84,7 @@
 				cmd = StringUtil.read(getInputStream());
 			}
 
-			Object jsonObject = JSONFactoryUtil.looseDeserializeSafe(cmd);
+			Object jsonObject = JSONFactoryUtil.looseDeserialize(cmd);
 
 			List<Object> jsonBatchItems = null;
 
