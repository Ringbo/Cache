diff --git a/redisson/src/main/java/org/redisson/spring/session/RedissonSessionRepository.java b/redisson/src/main/java/org/redisson/spring/session/RedissonSessionRepository.java
index 2ee12d1..d41c793 100644
--- a/redisson/src/main/java/org/redisson/spring/session/RedissonSessionRepository.java
+++ b/redisson/src/main/java/org/redisson/spring/session/RedissonSessionRepository.java
@@ -57,9 +57,9 @@
         private final MapSession delegate;
         private RMap<String, Object> map;
 
-        public RedissonSession() {
+        public RedissonSession(String keyPrefix) {
             this.delegate = new MapSession();
-            map = redisson.getMap("redisson_spring_session:" + delegate.getId());
+            map = redisson.getMap(keyPrefix + delegate.getId());
             principalName = resolvePrincipal(delegate);
 
             Map<String, Object> newMap = new HashMap<String, Object>(3);
@@ -81,9 +81,9 @@
             }
         }
         
-        public RedissonSession(String sessionId) {
+        public RedissonSession(String keyPrefix, String sessionId) {
             this.delegate = new MapSession(sessionId);
-            map = redisson.getMap("redisson_spring_session:" + sessionId);
+            map = redisson.getMap(keyPrefix + sessionId);
             principalName = resolvePrincipal(delegate);
         }
         
@@ -290,7 +290,7 @@
 
     @Override
     public RedissonSession createSession() {
-        RedissonSession session = new RedissonSession();
+        RedissonSession session = new RedissonSession(keyPrefix);
         if (defaultMaxInactiveInterval != null) {
             session.setMaxInactiveIntervalInSeconds(defaultMaxInactiveInterval);
         }
