diff --git a/aeron-archive/src/main/java/io/aeron/archive/client/AeronArchive.java b/aeron-archive/src/main/java/io/aeron/archive/client/AeronArchive.java
index 3cb1c93..95c1e4e 100644
--- a/aeron-archive/src/main/java/io/aeron/archive/client/AeronArchive.java
+++ b/aeron-archive/src/main/java/io/aeron/archive/client/AeronArchive.java
@@ -880,7 +880,7 @@
             if (null == archiveProxy)
             {
                 archiveProxy = new ArchiveProxy(
-                    aeron.addPublication(controlRequestChannel, controlRequestStreamId),
+                    aeron.addExclusivePublication(controlRequestChannel, controlRequestStreamId),
                     idleStrategy,
                     messageTimeoutNs,
                     ArchiveProxy.DEFAULT_MAX_RETRY_ATTEMPTS);
