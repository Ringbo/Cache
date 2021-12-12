diff --git a/aeron-archive/src/main/java/io/aeron/archive/ControlSession.java b/aeron-archive/src/main/java/io/aeron/archive/ControlSession.java
index b93bb6b..60339cd 100644
--- a/aeron-archive/src/main/java/io/aeron/archive/ControlSession.java
+++ b/aeron-archive/src/main/java/io/aeron/archive/ControlSession.java
@@ -288,7 +288,7 @@
 
     void attemptErrorResponse(final long correlationId, final String errorMessage, final ControlResponseProxy proxy)
     {
-        proxy.attemptErrorResponse(controlSessionId, GENERIC, correlationId, errorMessage, controlPublication);
+        proxy.attemptErrorResponse(controlSessionId, correlationId, GENERIC, errorMessage, controlPublication);
     }
 
     void attemptErrorResponse(
