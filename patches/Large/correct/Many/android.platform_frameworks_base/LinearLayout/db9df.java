diff --git a/core/java/android/widget/LinearLayout.java b/core/java/android/widget/LinearLayout.java
index ba868a1..bdb1e83 100644
--- a/core/java/android/widget/LinearLayout.java
+++ b/core/java/android/widget/LinearLayout.java
@@ -683,7 +683,7 @@
             }
         }
 
-        if (matchAxisFilter != 0) {
+        if (matchAxisFilter != 0 || wrapAxisFilter != 0) {
             final ViewParent parent = getParent();
             if (parent != null) {
                 // If our parent depends on us for an axis, then our layout can also be affected
