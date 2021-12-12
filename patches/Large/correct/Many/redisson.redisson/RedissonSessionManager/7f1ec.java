diff --git a/redisson-tomcat/redisson-tomcat-6/src/main/java/org/redisson/tomcat/RedissonSessionManager.java b/redisson-tomcat/redisson-tomcat-6/src/main/java/org/redisson/tomcat/RedissonSessionManager.java
index 988d21b..2c803ca 100644
--- a/redisson-tomcat/redisson-tomcat-6/src/main/java/org/redisson/tomcat/RedissonSessionManager.java
+++ b/redisson-tomcat/redisson-tomcat-6/src/main/java/org/redisson/tomcat/RedissonSessionManager.java
@@ -212,7 +212,7 @@
             updatesTopic.addListener(new MessageListener<AttributeMessage>() {
                 
                 @Override
-                public void onMessage(String channel, AttributeMessage msg) {
+                public void onMessage(CharSequence channel, AttributeMessage msg) {
                     try {
                         // TODO make it thread-safe
                         RedissonSession session = (RedissonSession) RedissonSessionManager.super.findSession(msg.getSessionId());
