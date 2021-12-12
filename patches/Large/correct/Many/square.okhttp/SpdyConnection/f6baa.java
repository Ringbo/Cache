diff --git a/okhttp/src/main/java/com/squareup/okhttp/internal/spdy/SpdyConnection.java b/okhttp/src/main/java/com/squareup/okhttp/internal/spdy/SpdyConnection.java
index e7ab873..5c1a557 100644
--- a/okhttp/src/main/java/com/squareup/okhttp/internal/spdy/SpdyConnection.java
+++ b/okhttp/src/main/java/com/squareup/okhttp/internal/spdy/SpdyConnection.java
@@ -352,7 +352,7 @@
   }
 
   void writeWindowUpdateLater(final int streamId, final long unacknowledgedBytesRead) {
-    executor.submit(new NamedRunnable("OkHttp Window Update %s stream %d", hostName, streamId) {
+    executor.execute(new NamedRunnable("OkHttp Window Update %s stream %d", hostName, streamId) {
       @Override public void execute() {
         try {
           frameWriter.windowUpdate(streamId, unacknowledgedBytesRead);
@@ -384,7 +384,7 @@
 
   private void writePingLater(
       final boolean reply, final int payload1, final int payload2, final Ping ping) {
-    executor.submit(new NamedRunnable("OkHttp %s ping %08x%08x",
+    executor.execute(new NamedRunnable("OkHttp %s ping %08x%08x",
         hostName, payload1, payload2) {
       @Override public void execute() {
         try {
@@ -636,7 +636,7 @@
               inFinished, headerBlock);
           lastGoodStreamId = streamId;
           streams.put(streamId, newStream);
-          executor.submit(new NamedRunnable("OkHttp %s stream %d", hostName, streamId) {
+          executor.execute(new NamedRunnable("OkHttp %s stream %d", hostName, streamId) {
             @Override public void execute() {
               try {
                 handler.receive(newStream);
@@ -704,7 +704,7 @@
     }
 
     private void ackSettingsLater(final Settings peerSettings) {
-      executor.submit(new NamedRunnable("OkHttp %s ACK Settings", hostName) {
+      executor.execute(new NamedRunnable("OkHttp %s ACK Settings", hostName) {
         @Override public void execute() {
           try {
             frameWriter.ackSettings(peerSettings);
@@ -798,7 +798,7 @@
       }
       currentPushRequests.add(streamId);
     }
-    pushExecutor.submit(new NamedRunnable("OkHttp %s Push Request[%s]", hostName, streamId) {
+    pushExecutor.execute(new NamedRunnable("OkHttp %s Push Request[%s]", hostName, streamId) {
       @Override public void execute() {
         boolean cancel = pushObserver.onRequest(streamId, requestHeaders);
         try {
@@ -816,7 +816,7 @@
 
   private void pushHeadersLater(final int streamId, final List<Header> requestHeaders,
       final boolean inFinished) {
-    pushExecutor.submit(new NamedRunnable("OkHttp %s Push Headers[%s]", hostName, streamId) {
+    pushExecutor.execute(new NamedRunnable("OkHttp %s Push Headers[%s]", hostName, streamId) {
       @Override public void execute() {
         boolean cancel = pushObserver.onHeaders(streamId, requestHeaders, inFinished);
         try {
@@ -842,7 +842,7 @@
     source.require(byteCount); // Eagerly read the frame before firing client thread.
     source.read(buffer, byteCount);
     if (buffer.size() != byteCount) throw new IOException(buffer.size() + " != " + byteCount);
-    pushExecutor.submit(new NamedRunnable("OkHttp %s Push Data[%s]", hostName, streamId) {
+    pushExecutor.execute(new NamedRunnable("OkHttp %s Push Data[%s]", hostName, streamId) {
       @Override public void execute() {
         try {
           boolean cancel = pushObserver.onData(streamId, buffer, byteCount, inFinished);
@@ -859,7 +859,7 @@
   }
 
   private void pushResetLater(final int streamId, final ErrorCode errorCode) {
-    pushExecutor.submit(new NamedRunnable("OkHttp %s Push Reset[%s]", hostName, streamId) {
+    pushExecutor.execute(new NamedRunnable("OkHttp %s Push Reset[%s]", hostName, streamId) {
       @Override public void execute() {
         pushObserver.onReset(streamId, errorCode);
         synchronized (SpdyConnection.this) {
