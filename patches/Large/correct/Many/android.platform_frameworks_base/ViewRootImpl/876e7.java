diff --git a/core/java/android/view/ViewRootImpl.java b/core/java/android/view/ViewRootImpl.java
index c31ae0e..231d926 100644
--- a/core/java/android/view/ViewRootImpl.java
+++ b/core/java/android/view/ViewRootImpl.java
@@ -4521,7 +4521,7 @@
             ViewRootImpl viewRootImpl = mViewRootImpl.get();
             if (viewRootImpl != null && viewRootImpl.mView != null) {
                 viewRootImpl.getAccessibilityInteractionController()
-                    .findAccessibilityNodeInfosByViewTextClientThread(text, accessibilityNodeId,
+                    .findAccessibilityNodeInfosByTextClientThread(text, accessibilityNodeId,
                             interactionId, callback, interrogatingPid, interrogatingTid);
             }
         }
