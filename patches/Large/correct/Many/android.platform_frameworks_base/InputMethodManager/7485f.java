diff --git a/core/java/android/view/inputmethod/InputMethodManager.java b/core/java/android/view/inputmethod/InputMethodManager.java
index 2e9cbf2..eef1cf5 100644
--- a/core/java/android/view/inputmethod/InputMethodManager.java
+++ b/core/java/android/view/inputmethod/InputMethodManager.java
@@ -1920,7 +1920,7 @@
                 Trace.traceCounter(Trace.TRACE_TAG_INPUT, PENDING_EVENT_COUNTER,
                         mPendingEvents.size());
 
-                Message msg = mH.obtainMessage(MSG_TIMEOUT_INPUT_EVENT, p);
+                Message msg = mH.obtainMessage(MSG_TIMEOUT_INPUT_EVENT, seq, 0, p);
                 msg.setAsynchronous(true);
                 mH.sendMessageDelayed(msg, INPUT_METHOD_NOT_RESPONDING_TIMEOUT);
                 return DISPATCH_IN_PROGRESS;
