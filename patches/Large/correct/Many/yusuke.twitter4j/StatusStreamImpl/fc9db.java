diff --git a/twitter4j-core/src/main/java/twitter4j/StatusStreamImpl.java b/twitter4j-core/src/main/java/twitter4j/StatusStreamImpl.java
index 32534c7..f85fde5 100644
--- a/twitter4j-core/src/main/java/twitter4j/StatusStreamImpl.java
+++ b/twitter4j-core/src/main/java/twitter4j/StatusStreamImpl.java
@@ -95,7 +95,7 @@
                     if (!json.isNull ("sender")) {
                         userStreamListener.onDirectMessage (new DirectMessageJSONImpl (json));
                     } else if (!json.isNull("text")) {
-                        userStreamListener.onStatus(new StatusJSONImpl(json));
+                        listener.onStatus(new StatusJSONImpl(json));
                     } else if (!json.isNull("delete")) {
                         listener.onDeletionNotice(new StatusDeletionNoticeImpl(json));
                     } else if (!json.isNull("limit")) {
