diff --git a/core/java/android/view/accessibility/AccessibilityNodeInfo.java b/core/java/android/view/accessibility/AccessibilityNodeInfo.java
index b5afdf7..6096d7d 100644
--- a/core/java/android/view/accessibility/AccessibilityNodeInfo.java
+++ b/core/java/android/view/accessibility/AccessibilityNodeInfo.java
@@ -721,7 +721,7 @@
      * @return Whether the refresh succeeded.
      */
     public boolean refresh() {
-        return refresh(false);
+        return refresh(true);
     }
 
     /**
