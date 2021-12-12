diff --git a/aeron-client/src/main/java/uk/co/real_logic/aeron/Publication.java b/aeron-client/src/main/java/uk/co/real_logic/aeron/Publication.java
index 4df2aac..e1efcd8 100644
--- a/aeron-client/src/main/java/uk/co/real_logic/aeron/Publication.java
+++ b/aeron-client/src/main/java/uk/co/real_logic/aeron/Publication.java
@@ -351,7 +351,7 @@
                 final long result = termAppender.claim(headerWriter, length, bufferClaim);
                 newPosition = newPosition(partitionIndex, (int)termOffset, position, result);
             }
-            else if (clientConductor.isPublicationConnected(timeOfLastStatusMessage(logMetaDataBuffer)))
+            else if (!clientConductor.isPublicationConnected(timeOfLastStatusMessage(logMetaDataBuffer)))
             {
                 newPosition = NOT_CONNECTED;
             }
