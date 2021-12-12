diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java
index 9e66584..839b579 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java
@@ -393,7 +393,7 @@
         }
 
         getBackButton().setVisibility(disableBack      ? View.INVISIBLE : View.VISIBLE);
-        getRecentsButton().setVisibility(disableHome   ? View.INVISIBLE : View.VISIBLE);
+        getHomeButton().setVisibility(disableHome      ? View.INVISIBLE : View.VISIBLE);
         getRecentsButton().setVisibility(disableRecent ? View.INVISIBLE : View.VISIBLE);
 
         // The app shelf, if it exists, follows the visibility of the home button.
