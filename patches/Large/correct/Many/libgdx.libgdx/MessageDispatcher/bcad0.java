diff --git a/extensions/gdx-ai/src/com/badlogic/gdx/ai/msg/MessageDispatcher.java b/extensions/gdx-ai/src/com/badlogic/gdx/ai/msg/MessageDispatcher.java
index 4dca0ab..549c185 100644
--- a/extensions/gdx-ai/src/com/badlogic/gdx/ai/msg/MessageDispatcher.java
+++ b/extensions/gdx-ai/src/com/badlogic/gdx/ai/msg/MessageDispatcher.java
@@ -157,7 +157,7 @@
 		do {
 			// Read the telegram from the front of the queue
 			final Telegram telegram = queue.peek();
-			if (telegram.getTimestamp() < currentTime) break;
+			if (telegram.getTimestamp() > currentTime) break;
 
 			if (debugEnabled) {
 				Gdx.app.log(LOG_TAG, "Queued telegram ready for dispatch: Sent to " + telegram.receiver + ". Msg is "
