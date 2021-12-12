diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarFragment.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarFragment.java
index 2ddae74..dd3c863 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarFragment.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarFragment.java
@@ -601,7 +601,7 @@
     private int computeRotationProposalTimeout() {
         if (mAccessibilityFeedbackEnabled) return 20000;
         if (mHoveringRotationSuggestion) return 16000;
-        return 6000;
+        return 10000;
     }
 
     private boolean isRotateSuggestionIntroduced() {
