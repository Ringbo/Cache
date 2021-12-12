diff --git a/aeron-archive/src/main/java/io/aeron/archive/ReplaySession.java b/aeron-archive/src/main/java/io/aeron/archive/ReplaySession.java
index ce7aba8..c501083 100644
--- a/aeron-archive/src/main/java/io/aeron/archive/ReplaySession.java
+++ b/aeron-archive/src/main/java/io/aeron/archive/ReplaySession.java
@@ -116,12 +116,11 @@
             return;
         }
 
-        // TODO: need to consider the start and stop states for a replay of a stream that is live recording.
         final long stopPosition = descriptorDecoder.stopPosition();
-        if (replayPosition - stopPosition > 0)
+        if (replayPosition - stopPosition >= 0)
         {
             final String errorMessage = "requested replay start position(=" + replayPosition +
-                ") is after recording stop position(=" + stopPosition + ")";
+                ") must be before current highest recorded position(=" + stopPosition + ")";
             closeOnError(new IllegalArgumentException(errorMessage), errorMessage);
             cursor = null;
             replayPublication = null;
