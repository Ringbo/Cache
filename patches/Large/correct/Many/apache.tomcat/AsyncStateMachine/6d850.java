diff --git a/java/org/apache/coyote/AsyncStateMachine.java b/java/org/apache/coyote/AsyncStateMachine.java
index 423188f..8f1fe44 100644
--- a/java/org/apache/coyote/AsyncStateMachine.java
+++ b/java/org/apache/coyote/AsyncStateMachine.java
@@ -73,20 +73,20 @@
  * |   |      |       |               |                 |             |     /-----------|         |
  * |   |      |       ^               |dispatch()       |             |    /                      |
  * |   |      |       |               |                 |             |   /                       |
- * |   |      |       |              \|/                /            \|/ /    postProcess()       |
- * |   |      |       |         MUST_DISPATCH          /           STARTED«---------«---------|   |
- * |   |      |       |           |                   /           / |   |                     |   |
- * |   |      |       |           |postProcess()     /           /  |   |                     ^   |
- * ^   |      ^       |           |                 /           /   |   |asyncOperation()     |   |
- * |   |      |       |           |                /           /    |   |                     |   |
- * |   |      |       |           |   |---------- / ----------/     |   |--READ_WRITE_OP--»---|   |
- * |   |      |       |           |   |          /   dispatch()     |            |  |  |          |
- * |   |      |       |           |   |   |-----/               auto|            |  |  |   error()|
- * |   |      |       | auto     \|/ \|/ \|/                        |  dispatch()|  |  |-»--------|
- * |   |      |       |---«------DISPATCHING«--------«------------- | ------«----|  |
- * |   |      |                      /|\                            |               |
+ * |   |      |       |              \|/                |            \|/ /    postProcess()       |
+ * |   |      |       |----«----MUST_DISPATCH-----«-----|          STARTED«---------«---------|   |
+ * |   |      |       |  auto        /|\                          / |   |                     |   |
+ * |   |      |       |               |                          /  |   |                     ^   |
+ * ^   |      ^       |               |                         /   |   |asyncOperation()     |   |
+ * |   |      |       ^               |                        /    |   |                     |   |
+ * |   |      |       |               |         |-------------/     |   |--READ_WRITE_OP--»---|   |
+ * |   |      |       |               |         |    dispatch()     |            |  |  |          |
+ * |   |      |       |               |         |               auto|            |  |  |   error()|
+ * |   |      |       | auto          |        \|/                  |  dispatch()|  |  |-»--------|
+ * |   |      |       |---«---------- | ---DISPATCHING«-----«------ | ------«----|  |
+ * |   |      |                       |                             |               |
  * |   |      |                       |       dispatch()           \|/              |
- * |   |      |                       |-----------------------TIMING_OUT            |
+ * |   |      |                       |-----------«-----------TIMING_OUT            |
  * |   |      |                                                 |   |               |
  * |   |      |-------«----------------------------------«------|   |               |
  * |   |                          complete()                        |               |
@@ -296,7 +296,11 @@
     public synchronized boolean asyncDispatch() {
         pauseNonContainerThread();
         boolean doDispatch = false;
-        if (state == AsyncState.STARTING) {
+        if (state == AsyncState.STARTING ||
+                state == AsyncState.TIMING_OUT ||
+                state == AsyncState.ERROR) {
+            // In these three cases processing is on a container thread so no
+            // need to transfer processing to a new container thread
             state = AsyncState.MUST_DISPATCH;
         } else if (state == AsyncState.STARTED) {
             state = AsyncState.DISPATCHING;
@@ -307,9 +311,7 @@
             // request/response associated with the AsyncContext so need a new
             // container thread to process the different request/response.
             doDispatch = true;
-        } else if (state == AsyncState.READ_WRITE_OP ||
-                state == AsyncState.TIMING_OUT ||
-                state == AsyncState.ERROR) {
+        } else if (state == AsyncState.READ_WRITE_OP) {
             state = AsyncState.DISPATCHING;
             // If on a container thread then the socket will be added to the
             // poller poller when the thread exits the
@@ -328,7 +330,8 @@
 
 
     public synchronized void asyncDispatched() {
-        if (state == AsyncState.DISPATCHING) {
+        if (state == AsyncState.DISPATCHING ||
+                state == AsyncState.MUST_DISPATCH) {
             state = AsyncState.DISPATCHED;
         } else {
             throw new IllegalStateException(
