diff --git a/core/java/com/android/internal/app/ResolverActivity.java b/core/java/com/android/internal/app/ResolverActivity.java
index 0a4ac0d..1e26c92 100644
--- a/core/java/com/android/internal/app/ResolverActivity.java
+++ b/core/java/com/android/internal/app/ResolverActivity.java
@@ -1469,7 +1469,7 @@
                 boolean found = false;
                 // Only loop to the end of into as it was before we started; no dupes in from.
                 for (int j = 0; j < intoCount; j++) {
-                    final ResolvedComponentInfo rci = into.get(i);
+                    final ResolvedComponentInfo rci = into.get(j);
                     if (isSameResolvedComponent(newInfo, rci)) {
                         found = true;
                         rci.add(intent, newInfo);
