diff --git a/modules/util/sync-engine/src/com/liferay/sync/engine/documentlibrary/event/BaseEvent.java b/modules/util/sync-engine/src/com/liferay/sync/engine/documentlibrary/event/BaseEvent.java
index 7b26514..a9aabaa 100644
--- a/modules/util/sync-engine/src/com/liferay/sync/engine/documentlibrary/event/BaseEvent.java
+++ b/modules/util/sync-engine/src/com/liferay/sync/engine/documentlibrary/event/BaseEvent.java
@@ -63,7 +63,7 @@
 
 		session.executeAsynchronousPost(
 			syncAccount.getUrl() + "/api/jsonws" + urlPath, parameters,
-			_handler, false);
+			_handler);
 	}
 
 	public void executeGet(String urlPath) throws Exception {
@@ -85,7 +85,7 @@
 
 		session.executePost(
 			syncAccount.getUrl() + "/api/jsonws" + urlPath, parameters,
-			_handler, false);
+			_handler);
 	}
 
 	@Override
