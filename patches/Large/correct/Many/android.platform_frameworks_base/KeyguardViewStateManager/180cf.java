diff --git a/policy/src/com/android/internal/policy/impl/keyguard/KeyguardViewStateManager.java b/policy/src/com/android/internal/policy/impl/keyguard/KeyguardViewStateManager.java
index 54ac411..ff1ffcf 100644
--- a/policy/src/com/android/internal/policy/impl/keyguard/KeyguardViewStateManager.java
+++ b/policy/src/com/android/internal/policy/impl/keyguard/KeyguardViewStateManager.java
@@ -115,7 +115,7 @@
         // This prevents conflicts.
 
         // If the page hasn't switched, don't bother with any of this
-        if (mCurrentPage != newPageIndex) return;
+        if (mCurrentPage == newPageIndex) return;
 
         if (mPagedView != null && mChallengeLayout != null) {
             KeyguardWidgetFrame prevPage = mPagedView.getWidgetPageAt(mCurrentPage);
