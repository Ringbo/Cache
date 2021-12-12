diff --git a/redisson/src/main/java/org/redisson/spring/session/RedissonSessionRepository.java b/redisson/src/main/java/org/redisson/spring/session/RedissonSessionRepository.java
index d41c793..785d1d4 100644
--- a/redisson/src/main/java/org/redisson/spring/session/RedissonSessionRepository.java
+++ b/redisson/src/main/java/org/redisson/spring/session/RedissonSessionRepository.java
@@ -253,7 +253,7 @@
             }
             
             String id = body.split(":")[1];
-            RedissonSession session = new RedissonSession(id);
+            RedissonSession session = new RedissonSession(keyPrefix, id);
             if (session.load()) {
                 session.clearPrincipal();
                 publishEvent(new SessionDeletedEvent(this, session));
@@ -266,7 +266,7 @@
             }
 
             String id = body.split(":")[1];
-            RedissonSession session = new RedissonSession(id);
+            RedissonSession session = new RedissonSession(keyPrefix, id);
             if (session.load()) {
                 session.clearPrincipal();
                 publishEvent(new SessionExpiredEvent(this, session));
@@ -304,7 +304,7 @@
 
     @Override
     public RedissonSession getSession(String id) {
-        RedissonSession session = new RedissonSession(id);
+        RedissonSession session = new RedissonSession(keyPrefix, id);
         if (!session.load() || session.isExpired()) {
             return null;
         }
