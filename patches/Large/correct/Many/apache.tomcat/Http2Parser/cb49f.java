diff --git a/java/org/apache/coyote/http2/Http2Parser.java b/java/org/apache/coyote/http2/Http2Parser.java
index d6761c3..1404b1b 100644
--- a/java/org/apache/coyote/http2/Http2Parser.java
+++ b/java/org/apache/coyote/http2/Http2Parser.java
@@ -85,7 +85,7 @@
 
         try {
             validateFrame(expected, frameType, streamId, flags, payloadSize);
-        } catch (StreamError se) {
+        } catch (StreamException se) {
             swallow(payloadSize);
             throw se;
         }
@@ -244,7 +244,7 @@
     private void readSettingsFrame(int flags, int payloadSize) throws Http2Exception, IOException {
         boolean ack = Flags.isAck(flags);
         if (payloadSize > 0 && ack) {
-            throw new ConnectionError(sm.getString(
+            throw new ConnectionException(sm.getString(
                     "http2Parser.processFrameSettings.ackWithNonZeroPayload"),
                     Http2Error.FRAME_SIZE_ERROR);
         }
@@ -264,7 +264,7 @@
 
 
     private void readPushPromiseFrame(int streamId) throws Http2Exception {
-        throw new ConnectionError(sm.getString("http2Parser.processFramePushPromise",
+        throw new ConnectionException(sm.getString("http2Parser.processFramePushPromise",
                 connectionId, Integer.valueOf(streamId)), Http2Error.PROTOCOL_ERROR);
     }
 
@@ -308,11 +308,11 @@
         // Validate the data
         if (windowSizeIncrement == 0) {
             if (streamId == 0) {
-                throw new ConnectionError(
+                throw new ConnectionException(
                         sm.getString("http2Parser.processFrameWindowUpdate.invalidIncrement"),
                         Http2Error.PROTOCOL_ERROR);
             } else {
-                throw new StreamError(
+                throw new StreamException(
                         sm.getString("http2Parser.processFrameWindowUpdate.invalidIncrement"),
                         Http2Error.PROTOCOL_ERROR, streamId);
             }
@@ -326,7 +326,7 @@
             throws Http2Exception, IOException {
         if (headersCurrentStream == -1) {
             // No headers to continue
-            throw new ConnectionError(sm.getString(
+            throw new ConnectionException(sm.getString(
                     "http2Parser.processFrameContinuation.notExpected", connectionId,
                     Integer.toString(streamId)), Http2Error.PROTOCOL_ERROR);
         }
@@ -357,7 +357,7 @@
             try {
                 hpackDecoder.decode(headerReadBuffer);
             } catch (HpackException hpe) {
-                throw new ConnectionError(
+                throw new ConnectionException(
                         sm.getString("http2Parser.processFrameHeaders.decodingFailed"),
                         Http2Error.COMPRESSION_ERROR);
             }
@@ -367,7 +367,7 @@
         }
 
         if (headerReadBuffer.position() > 0 && endOfHeaders) {
-            throw new ConnectionError(
+            throw new ConnectionException(
                     sm.getString("http2Parser.processFrameHeaders.decodingDataLeft"),
                     Http2Error.COMPRESSION_ERROR);
         }
@@ -413,26 +413,26 @@
         }
 
         if (expected != null && frameType != expected) {
-            throw new StreamError(sm.getString("http2Parser.processFrame.unexpectedType",
+            throw new StreamException(sm.getString("http2Parser.processFrame.unexpectedType",
                     expected, frameType), Http2Error.PROTOCOL_ERROR, streamId);
         }
 
         if (payloadSize > maxPayloadSize) {
-            throw new ConnectionError(sm.getString("http2Parser.payloadTooBig",
+            throw new ConnectionException(sm.getString("http2Parser.payloadTooBig",
                     Integer.toString(payloadSize), Integer.toString(maxPayloadSize)),
                     Http2Error.FRAME_SIZE_ERROR);
         }
 
         if (headersCurrentStream != -1) {
             if (headersCurrentStream != streamId) {
-                throw new ConnectionError(sm.getString("http2Parser.headers.wrongStream",
+                throw new ConnectionException(sm.getString("http2Parser.headers.wrongStream",
                         connectionId, Integer.toString(headersCurrentStream),
                         Integer.toString(streamId)), Http2Error.COMPRESSION_ERROR);
             }
             if (frameType == FrameType.RST) {
                 // NO-OP: RST is OK here
             } else if (frameType != FrameType.CONTINUATION) {
-                throw new ConnectionError(sm.getString("http2Parser.headers.wrongFrameType",
+                throw new ConnectionException(sm.getString("http2Parser.headers.wrongFrameType",
                         connectionId, Integer.toString(headersCurrentStream),
                         frameType), Http2Error.COMPRESSION_ERROR);
             }
@@ -517,11 +517,11 @@
 
         // Data frames
         ByteBuffer getInputByteBuffer(int streamId, int payloadSize) throws Http2Exception;
-        void receiveEndOfStream(int streamId) throws ConnectionError;
+        void receiveEndOfStream(int streamId) throws ConnectionException;
 
         // Header frames
         HeaderEmitter headersStart(int streamId) throws Http2Exception;
-        void headersEnd(int streamId) throws ConnectionError;
+        void headersEnd(int streamId) throws ConnectionException;
 
         // Priority frames (also headers)
         void reprioritise(int streamId, int parentStreamId, boolean exclusive, int weight)
@@ -531,7 +531,7 @@
         void reset(int streamId, long errorCode) throws Http2Exception;
 
         // Settings frames
-        void setting(int identifier, long value) throws ConnectionError;
+        void setting(int identifier, long value) throws ConnectionException;
         void settingsEnd(boolean ack) throws IOException;
 
         // Ping frames
