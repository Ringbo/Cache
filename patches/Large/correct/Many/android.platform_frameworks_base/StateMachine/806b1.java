diff --git a/core/java/com/android/internal/util/StateMachine.java b/core/java/com/android/internal/util/StateMachine.java
index 6641f2c..28fd05f 100644
--- a/core/java/com/android/internal/util/StateMachine.java
+++ b/core/java/com/android/internal/util/StateMachine.java
@@ -820,7 +820,7 @@
              * and we won't log special messages SM_INIT_CMD or SM_QUIT_CMD which
              * always set msg.obj to the handler.
              */
-            boolean recordLogMsg = mSm.recordLogRec(mMsg) && (msg.obj == mSmHandlerObj);
+            boolean recordLogMsg = mSm.recordLogRec(mMsg) && (msg.obj != mSmHandlerObj);
 
             if (mLogRecords.logOnlyTransitions()) {
                 /** Record only if there is a transition */
