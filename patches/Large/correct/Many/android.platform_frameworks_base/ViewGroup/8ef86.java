diff --git a/core/java/android/view/ViewGroup.java b/core/java/android/view/ViewGroup.java
index 20308c8..7d56389 100644
--- a/core/java/android/view/ViewGroup.java
+++ b/core/java/android/view/ViewGroup.java
@@ -3477,7 +3477,7 @@
         }
 
         if (child.isLayoutDirectionInherited()) {
-            child.resetResolvedLayoutDirection();
+            child.resetRtlProperties();
             child.resolveRtlPropertiesIfNeeded();
         }
 
