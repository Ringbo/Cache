diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/timerservice/TimerServiceImpl.java b/ejb3/src/main/java/org/jboss/as/ejb3/timerservice/TimerServiceImpl.java
index 43873e8..c210376 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/timerservice/TimerServiceImpl.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/timerservice/TimerServiceImpl.java
@@ -401,7 +401,8 @@
         // get all active timers for this timerservice
         synchronized (this.timers) {
             for (final TimerImpl timer : this.timers.values()) {
-                if (timer.isActive()) {
+                // Less disruptive way to get WFLY-8457 fixed.
+                if (timer.isActive() || (!timer.isActive() && timer.getState() == TimerState.ACTIVE)) {
                     if (timer.getPrimaryKey() == null || timer.getPrimaryKey().equals(pk)) {
                         activeTimers.add(timer);
                     }
