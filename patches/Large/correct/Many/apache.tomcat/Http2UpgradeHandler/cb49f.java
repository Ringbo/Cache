diff --git a/java/org/apache/coyote/http2/Http2UpgradeHandler.java b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
index 438f9f9..9e7d9fa 100644
--- a/java/org/apache/coyote/http2/Http2UpgradeHandler.java
+++ b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
@@ -245,7 +245,7 @@
                         if (!parser.readFrame(false)) {
                             break;
                         }
-                    } catch (StreamError se) {
+                    } catch (StreamException se) {
                         // Stream errors are not fatal to the connection so
                         // continue reading frames
                         closeStream(se);
@@ -340,7 +340,7 @@
     }
 
 
-    private void closeStream(StreamError se) throws ConnectionError, IOException {
+    private void closeStream(StreamException se) throws ConnectionException, IOException {
 
         if (log.isDebugEnabled()) {
             log.debug(sm.getString("upgradeHandler.rst.debug", connectionId,
@@ -627,27 +627,27 @@
     }
 
 
-    private Stream getStream(int streamId, boolean unknownIsError) throws ConnectionError{
+    private Stream getStream(int streamId, boolean unknownIsError) throws ConnectionException{
         Integer key = Integer.valueOf(streamId);
         Stream result = streams.get(key);
         if (result == null && unknownIsError) {
             // Stream has been closed and removed from the map
-            throw new ConnectionError(sm.getString("upgradeHandler.stream.closed", key), Http2Error.PROTOCOL_ERROR);
+            throw new ConnectionException(sm.getString("upgradeHandler.stream.closed", key), Http2Error.PROTOCOL_ERROR);
         }
         return result;
     }
 
 
-    private Stream createRemoteStream(int streamId) throws ConnectionError {
+    private Stream createRemoteStream(int streamId) throws ConnectionException {
         Integer key = Integer.valueOf(streamId);
 
         if (streamId %2 != 1) {
-            throw new ConnectionError(
+            throw new ConnectionException(
                     sm.getString("upgradeHandler.stream.even", key), Http2Error.PROTOCOL_ERROR);
         }
 
         if (streamId <= maxRemoteStreamId) {
-            throw new ConnectionError(sm.getString("upgradeHandler.stream.old", key,
+            throw new ConnectionException(sm.getString("upgradeHandler.stream.old", key,
                     Integer.valueOf(maxRemoteStreamId)), Http2Error.PROTOCOL_ERROR);
         }
 
@@ -770,7 +770,7 @@
 
 
     @Override
-    public void receiveEndOfStream(int streamId) throws ConnectionError {
+    public void receiveEndOfStream(int streamId) throws ConnectionException {
         Stream stream = getStream(streamId, true);
         if (stream != null) {
             stream.receivedEndOfStream();
@@ -807,7 +807,7 @@
 
 
     @Override
-    public void headersEnd(int streamId) throws ConnectionError {
+    public void headersEnd(int streamId) throws ConnectionException {
         Stream stream = getStream(streamId, true);
         // Process this stream on a container thread
         StreamProcessor streamProcessor = new StreamProcessor(stream, adapter, socketWrapper);
@@ -828,7 +828,7 @@
 
 
     @Override
-    public void setting(int identifier, long value) throws ConnectionError {
+    public void setting(int identifier, long value) throws ConnectionException {
         remoteSettings.set(identifier, value);
     }
 
