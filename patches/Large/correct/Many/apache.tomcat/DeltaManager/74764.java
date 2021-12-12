diff --git a/java/org/apache/catalina/ha/session/DeltaManager.java b/java/org/apache/catalina/ha/session/DeltaManager.java
index 42e59a1..9521272 100644
--- a/java/org/apache/catalina/ha/session/DeltaManager.java
+++ b/java/org/apache/catalina/ha/session/DeltaManager.java
@@ -1385,7 +1385,7 @@
         session.setPrimarySession(false);
         session.setCreationTime(msg.getTimestamp());
         // use container maxInactiveInterval so that session will expire correctly in case of primary transfer
-        session.setMaxInactiveInterval(getMaxInactiveInterval());
+        session.setMaxInactiveInterval(getMaxInactiveInterval(), false);
         session.access();
         session.setId(msg.getSessionID(), notifySessionListenersOnReplication);
         session.resetDeltaRequest();
