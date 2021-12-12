diff --git a/src/main/java/com/corundumstudio/socketio/store/RedissonPubSubStore.java b/src/main/java/com/corundumstudio/socketio/store/RedissonPubSubStore.java
index e80ac75..8e286fa 100644
--- a/src/main/java/com/corundumstudio/socketio/store/RedissonPubSubStore.java
+++ b/src/main/java/com/corundumstudio/socketio/store/RedissonPubSubStore.java
@@ -56,7 +56,7 @@
         RTopic<T> topic = redissonSub.getTopic(name);
         int regId = topic.addListener(new MessageListener<T>() {
             @Override
-            public void onMessage(String channel, T msg) {
+            public void onMessage(CharSequence channel, T msg) {
                 if (!nodeId.equals(msg.getNodeId())) {
                     listener.onMessage(msg);
                 }
