diff --git a/rxjava-core/src/main/java/rx/Scheduler.java b/rxjava-core/src/main/java/rx/Scheduler.java
index b01872f..a4cc789 100644
--- a/rxjava-core/src/main/java/rx/Scheduler.java
+++ b/rxjava-core/src/main/java/rx/Scheduler.java
@@ -165,7 +165,7 @@
                     @Override
                     public void call() {
                         if (!parentSubscription.isUnsubscribed()) {
-                            childSubscription.setSubscription(scheduler.schedule(parentAction, parentAction));
+                            childSubscription.set(scheduler.schedule(parentAction, parentAction));
                         }
                     }
 
