diff --git a/aeron-client/src/main/java/uk/co/real_logic/aeron/Publication.java b/aeron-client/src/main/java/uk/co/real_logic/aeron/Publication.java
index 1434b3b..e1d196c 100644
--- a/aeron-client/src/main/java/uk/co/real_logic/aeron/Publication.java
+++ b/aeron-client/src/main/java/uk/co/real_logic/aeron/Publication.java
@@ -362,7 +362,7 @@
                 final long result = termAppender.claim(headerWriter, length, bufferClaim);
                 newPosition = newPosition(partitionIndex, (int)termOffset, position, result);
             }
-            else if (!clientConductor.isPublicationConnected(timeOfLastStatusMessage(logMetaDataBuffer)))
+            else if (clientConductor.isPublicationConnected(timeOfLastStatusMessage(logMetaDataBuffer)))
             {
                 newPosition = BACK_PRESSURED;
             }
