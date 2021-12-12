diff --git a/java/org/apache/coyote/http2/StreamStateMachine.java b/java/org/apache/coyote/http2/StreamStateMachine.java
index e89b2cf..e561673 100644
--- a/java/org/apache/coyote/http2/StreamStateMachine.java
+++ b/java/org/apache/coyote/http2/StreamStateMachine.java
@@ -108,11 +108,11 @@
         // state of this stream.
         if (!isFrameTypePermitted(frameType)) {
             if (state.connectionErrorForInvalidFrame) {
-                throw new ConnectionError(sm.getString("streamStateMachine.invalidFrame",
+                throw new ConnectionException(sm.getString("streamStateMachine.invalidFrame",
                         stream.getConnectionId(), stream.getIdentifier(), state, frameType),
                         state.errorCodeForInvalidFrame);
             } else {
-                throw new StreamError(sm.getString("streamStateMachine.invalidFrame",
+                throw new StreamException(sm.getString("streamStateMachine.invalidFrame",
                         stream.getConnectionId(), stream.getIdentifier(), state, frameType),
                         state.errorCodeForInvalidFrame, stream.getIdentifier().intValue());
             }
