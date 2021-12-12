diff --git a/policy/src/com/android/internal/policy/impl/keyguard/KeyguardStatusViewManager.java b/policy/src/com/android/internal/policy/impl/keyguard/KeyguardStatusViewManager.java
index 866194c..5ad45ce8 100644
--- a/policy/src/com/android/internal/policy/impl/keyguard/KeyguardStatusViewManager.java
+++ b/policy/src/com/android/internal/policy/impl/keyguard/KeyguardStatusViewManager.java
@@ -114,7 +114,7 @@
         mClockView = (ClockView) view.findViewById(R.id.clock_view);
 
         // Use custom font in mDateView
-        mDateView.setTypeface(Typeface.SANS_SERIF);
+        mDateView.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
 
         // Required to get Marquee to work.
         final View marqueeViews[] = { mDateView, mStatus1View, mOwnerInfoView, mAlarmStatusView };
