diff --git a/core/java/android/view/ViewGroup.java b/core/java/android/view/ViewGroup.java
index 9ce7df9..b95e1bd 100644
--- a/core/java/android/view/ViewGroup.java
+++ b/core/java/android/view/ViewGroup.java
@@ -3383,7 +3383,7 @@
         }
 
         if (child.isLayoutDirectionInherited()) {
-            child.resetResolvedLayoutDirection();
+            child.resetRtlProperties();
             child.resolveRtlPropertiesIfNeeded();
         }
 
