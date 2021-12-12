diff --git a/view/ClassesFilteredView.java b/view/ClassesFilteredView.java
index 7c47ddd..69074e5 100644
--- a/view/ClassesFilteredView.java
+++ b/view/ClassesFilteredView.java
@@ -346,7 +346,7 @@
   private void doActivate() {
     myDebugSession.addSessionListener(myDebugSessionListener, ClassesFilteredView.this);
     myConstructorTrackedClasses.values().forEach(x -> x.setBackgroundMode(false));
-    if (!myLastSuspendContext.equals(getSuspendContext())) {
+    if (myLastSuspendContext == null || !myLastSuspendContext.equals(getSuspendContext())) {
       commitAllTrackers();
       updateClassesAndCounts();
     }
