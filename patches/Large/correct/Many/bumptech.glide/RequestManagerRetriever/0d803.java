diff --git a/library/src/main/java/com/bumptech/glide/manager/RequestManagerRetriever.java b/library/src/main/java/com/bumptech/glide/manager/RequestManagerRetriever.java
index b07a236..8d6a7f2 100644
--- a/library/src/main/java/com/bumptech/glide/manager/RequestManagerRetriever.java
+++ b/library/src/main/java/com/bumptech/glide/manager/RequestManagerRetriever.java
@@ -186,7 +186,8 @@
       return;
     }
     for (Fragment fragment : topLevelFragments) {
-      if (fragment.getView() == null) {
+      // getFragment()s in the support FragmentManager may contain null values, see #1991.
+      if (fragment == null || fragment.getView() == null) {
         continue;
       }
       result.put(fragment.getView(), fragment);
