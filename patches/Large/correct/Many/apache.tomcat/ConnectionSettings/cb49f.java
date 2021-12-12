diff --git a/java/org/apache/coyote/http2/ConnectionSettings.java b/java/org/apache/coyote/http2/ConnectionSettings.java
index b2f4668..453556d 100644
--- a/java/org/apache/coyote/http2/ConnectionSettings.java
+++ b/java/org/apache/coyote/http2/ConnectionSettings.java
@@ -42,7 +42,7 @@
     private volatile int maxFrameSize = DEFAULT_MAX_FRAME_SIZE;
     private volatile long maxHeaderListSize = UNLIMITED;
 
-    public void set(int parameterId, long value) throws ConnectionError {
+    public void set(int parameterId, long value) throws ConnectionException {
         if (log.isDebugEnabled()) {
             log.debug(sm.getString("connectionSettings.debug",
                     Integer.toString(parameterId), Long.toString(value)));
@@ -78,10 +78,10 @@
     public int getHeaderTableSize() {
         return headerTableSize;
     }
-    public void setHeaderTableSize(long headerTableSize) throws ConnectionError {
+    public void setHeaderTableSize(long headerTableSize) throws ConnectionException {
         // Need to put a sensible limit on this. Start with 16k (default is 4k)
         if (headerTableSize > (16 * 1024)) {
-            throw new ConnectionError(sm.getString("connectionSettings.headerTableSizeLimit",
+            throw new ConnectionException(sm.getString("connectionSettings.headerTableSizeLimit",
                     Long.toString(headerTableSize)), Http2Error.PROTOCOL_ERROR);
         }
         this.headerTableSize = (int) headerTableSize;
@@ -91,11 +91,11 @@
     public boolean getEnablePush() {
         return enablePush;
     }
-    public void setEnablePush(long enablePush) throws ConnectionError {
+    public void setEnablePush(long enablePush) throws ConnectionException {
         // Can't be less than zero since the result of the byte->long conversion
         // will never be negative
         if (enablePush > 1) {
-            throw new ConnectionError(sm.getString("connectionSettings.enablePushInvalid",
+            throw new ConnectionException(sm.getString("connectionSettings.enablePushInvalid",
                     Long.toString(enablePush)), Http2Error.PROTOCOL_ERROR);
         }
         this.enablePush = (enablePush  == 1);
@@ -113,9 +113,9 @@
     public int getInitialWindowSize() {
         return initialWindowSize;
     }
-    public void setInitialWindowSize(long initialWindowSize) throws ConnectionError {
+    public void setInitialWindowSize(long initialWindowSize) throws ConnectionException {
         if (initialWindowSize > MAX_WINDOW_SIZE) {
-            throw new ConnectionError(sm.getString("connectionSettings.windowSizeTooBig",
+            throw new ConnectionException(sm.getString("connectionSettings.windowSizeTooBig",
                     Long.toString(initialWindowSize), Long.toString(MAX_WINDOW_SIZE)),
                     Http2Error.PROTOCOL_ERROR);
         }
@@ -126,9 +126,9 @@
     public int getMaxFrameSize() {
         return maxFrameSize;
     }
-    public void setMaxFrameSize(long maxFrameSize) throws ConnectionError {
+    public void setMaxFrameSize(long maxFrameSize) throws ConnectionException {
         if (maxFrameSize < MIN_MAX_FRAME_SIZE || maxFrameSize > MAX_MAX_FRAME_SIZE) {
-            throw new ConnectionError(sm.getString("connectionSettings.maxFrameSizeInvalid",
+            throw new ConnectionException(sm.getString("connectionSettings.maxFrameSizeInvalid",
                     Long.toString(maxFrameSize), Integer.toString(MIN_MAX_FRAME_SIZE),
                     Integer.toString(MAX_MAX_FRAME_SIZE)), Http2Error.PROTOCOL_ERROR);
         }
