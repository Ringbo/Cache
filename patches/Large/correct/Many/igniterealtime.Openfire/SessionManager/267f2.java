diff --git a/src/java/org/jivesoftware/messenger/SessionManager.java b/src/java/org/jivesoftware/messenger/SessionManager.java
index f8b3c83..280ab3e 100644
--- a/src/java/org/jivesoftware/messenger/SessionManager.java
+++ b/src/java/org/jivesoftware/messenger/SessionManager.java
@@ -453,7 +453,7 @@
             if (sessions == null || sessions.isEmpty()) {
                 // First session from the remote server to this server so create a
                 // new association
-                List<IncomingServerSession> value = new ArrayList<IncomingServerSession>();
+                List<IncomingServerSession> value = new CopyOnWriteArrayList<IncomingServerSession>();
                 value.add(session);
                 incomingServerSessions.put(hostname, value);
             }
