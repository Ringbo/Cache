diff --git a/core/java/android/app/EnterTransitionCoordinator.java b/core/java/android/app/EnterTransitionCoordinator.java
index 5d12b0d..c6736eef 100644
--- a/core/java/android/app/EnterTransitionCoordinator.java
+++ b/core/java/android/app/EnterTransitionCoordinator.java
@@ -172,7 +172,7 @@
                 String localName = localNames.get(i);
                 String acceptedName = accepted.get(i);
                 if (localName != null && !localName.equals(acceptedName)) {
-                    View view = sharedElements.remove(localName);
+                    View view = sharedElements.get(localName);
                     if (view != null) {
                         sharedElements.put(acceptedName, view);
                     }
