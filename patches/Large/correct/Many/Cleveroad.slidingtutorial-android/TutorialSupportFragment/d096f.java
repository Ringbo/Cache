diff --git a/lib/src/main/java/com/cleveroad/slidingtutorial/TutorialSupportFragment.java b/lib/src/main/java/com/cleveroad/slidingtutorial/TutorialSupportFragment.java
index a2643ba..4597a68 100644
--- a/lib/src/main/java/com/cleveroad/slidingtutorial/TutorialSupportFragment.java
+++ b/lib/src/main/java/com/cleveroad/slidingtutorial/TutorialSupportFragment.java
@@ -115,7 +115,7 @@
         return TutorialOptions.newTutorialOptionsBuilder(context, Fragment.class);
     }
 
-    public static TutorialFragment newInstance(@NonNull TutorialOptions tutorialOptions) {
+    public static TutorialSupportFragment newInstance(@NonNull TutorialOptions tutorialOptions) {
         return new TutorialSupportFragmentImpl(tutorialOptions);
     }
 
@@ -283,7 +283,7 @@
         }
     }
 
-    public static final class TutorialSupportFragmentImpl extends TutorialFragment {
+    public static final class TutorialSupportFragmentImpl extends TutorialSupportFragment {
 
         private TutorialOptions mTutorialOptions;
 
