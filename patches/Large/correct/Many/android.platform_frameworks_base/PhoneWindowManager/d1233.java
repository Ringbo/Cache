diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index bd56ee0..1ea7a7c 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -3229,7 +3229,8 @@
             }
         }
 
-        if ((fl & FLAG_LAYOUT_NO_LIMITS) != 0) {
+        // TYPE_SYSTEM_ERROR is above the NavigationBar so it can't be allowed to extend over it.
+        if ((fl & FLAG_LAYOUT_NO_LIMITS) != 0 && attrs.type != TYPE_SYSTEM_ERROR) {
             df.left = df.top = of.left = of.top = cf.left = cf.top = vf.left = vf.top = -10000;
             df.right = df.bottom = of.right = of.bottom = cf.right = cf.bottom
                     = vf.right = vf.bottom = 10000;
