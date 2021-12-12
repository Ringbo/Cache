diff --git a/core/src/main/java/io/undertow/server/session/InMemorySessionManager.java b/core/src/main/java/io/undertow/server/session/InMemorySessionManager.java
index c44216f..f7b4e2d 100644
--- a/core/src/main/java/io/undertow/server/session/InMemorySessionManager.java
+++ b/core/src/main/java/io/undertow/server/session/InMemorySessionManager.java
@@ -72,12 +72,12 @@
 
     private volatile long startTime;
 
-    private final boolean exictOldestUnusedSessionOnMax;
+    private final boolean expireOldestUnusedSessionOnMax;
 
 
-    public InMemorySessionManager(String deploymentName, int maxSessions, boolean exictOldestUnusedSessionOnMax) {
+    public InMemorySessionManager(String deploymentName, int maxSessions, boolean expireOldestUnusedSessionOnMax) {
         this.deploymentName = deploymentName;
-        this.exictOldestUnusedSessionOnMax = exictOldestUnusedSessionOnMax;
+        this.expireOldestUnusedSessionOnMax = expireOldestUnusedSessionOnMax;
         this.sessions = new ConcurrentHashMap<>();
         this.maxSize = maxSessions;
         ConcurrentDirectDeque<String> evictionQueue = null;
@@ -88,7 +88,7 @@
     }
 
     public InMemorySessionManager(String deploymentName, int maxSessions) {
-        this(deploymentName, maxSessions, true);
+        this(deploymentName, maxSessions, false);
     }
 
     public InMemorySessionManager(String id) {
@@ -119,7 +119,7 @@
     @Override
     public Session createSession(final HttpServerExchange serverExchange, final SessionConfig config) {
         if (evictionQueue != null) {
-            if(exictOldestUnusedSessionOnMax) {
+            if(expireOldestUnusedSessionOnMax) {
                 while (sessions.size() >= maxSize && !evictionQueue.isEmpty()) {
 
                     String key = evictionQueue.poll();
