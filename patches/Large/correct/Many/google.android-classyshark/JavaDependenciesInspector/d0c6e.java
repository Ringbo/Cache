diff --git a/ClassySharkWS/src/com/google/classyshark/silverghost/translator/apk/dashboard/JavaDependenciesInspector.java b/ClassySharkWS/src/com/google/classyshark/silverghost/translator/apk/dashboard/JavaDependenciesInspector.java
index e806abc..5eb8ae6 100644
--- a/ClassySharkWS/src/com/google/classyshark/silverghost/translator/apk/dashboard/JavaDependenciesInspector.java
+++ b/ClassySharkWS/src/com/google/classyshark/silverghost/translator/apk/dashboard/JavaDependenciesInspector.java
@@ -138,7 +138,7 @@
             hasActionBarSherlock = true;
         } else if (cName.contains("chrisbanes.pulltorefresh") && !hasPullToRefresh) {
             hasPullToRefresh = true;
-        } else if (cName.contains("com.viewpagerindicator") && !hasPullToRefresh) {
+        } else if (cName.contains("com.viewpagerindicator") && !hasViewPagerIndicator) {
             hasViewPagerIndicator = true;
         }
     }
