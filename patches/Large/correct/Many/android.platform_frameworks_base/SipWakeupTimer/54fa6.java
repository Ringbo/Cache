diff --git a/voip/java/com/android/server/sip/SipWakeupTimer.java b/voip/java/com/android/server/sip/SipWakeupTimer.java
index 76780c0..00d47ac 100644
--- a/voip/java/com/android/server/sip/SipWakeupTimer.java
+++ b/voip/java/com/android/server/sip/SipWakeupTimer.java
@@ -83,7 +83,7 @@
         mEventQueue = null;
     }
 
-    private synchronized boolean stopped() {
+    private boolean stopped() {
         if (mEventQueue == null) {
             Log.w(TAG, "Timer stopped");
             return true;
@@ -233,7 +233,7 @@
     }
 
     @Override
-    public void onReceive(Context context, Intent intent) {
+    public synchronized void onReceive(Context context, Intent intent) {
         // This callback is already protected by AlarmManager's wake lock.
         String action = intent.getAction();
         if (getAction().equals(action)
@@ -261,7 +261,7 @@
         }
     }
 
-    private synchronized void execute(long triggerTime) {
+    private void execute(long triggerTime) {
         if (DEBUG_TIMER) Log.d(TAG, "time's up, triggerTime = "
                 + showTime(triggerTime) + ": " + mEventQueue.size());
         if (stopped() || mEventQueue.isEmpty()) return;
