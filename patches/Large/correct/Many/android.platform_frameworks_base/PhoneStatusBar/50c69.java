diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
index a8ab597..7c679b2 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
@@ -1038,7 +1038,7 @@
     }
 
     @Override
-    BaseStatusBar.H createHandler() {
+    protected BaseStatusBar.H createHandler() {
         return new PhoneStatusBar.H();
     }
 
