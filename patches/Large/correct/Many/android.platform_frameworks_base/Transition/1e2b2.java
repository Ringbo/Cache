diff --git a/core/java/android/transition/Transition.java b/core/java/android/transition/Transition.java
index 880f559..c14678a 100644
--- a/core/java/android/transition/Transition.java
+++ b/core/java/android/transition/Transition.java
@@ -995,7 +995,7 @@
      */
     public Transition addTarget(String targetName) {
         if (targetName != null) {
-            if (mTargetNames != null) {
+            if (mTargetNames == null) {
                 mTargetNames = new ArrayList<String>();
             }
             mTargetNames.add(targetName);
