diff --git a/library/src/main/java/com/github/amlcurran/showcaseview/ShowcaseView.java b/library/src/main/java/com/github/amlcurran/showcaseview/ShowcaseView.java
index 2198a77..f6a250d 100644
--- a/library/src/main/java/com/github/amlcurran/showcaseview/ShowcaseView.java
+++ b/library/src/main/java/com/github/amlcurran/showcaseview/ShowcaseView.java
@@ -176,7 +176,7 @@
     }
 
     public boolean hasShowcaseView() {
-        return (showcaseX != 1000000 && showcaseY != 1000000) || !hasNoTarget;
+        return (showcaseX != 1000000 && showcaseY != 1000000) && !hasNoTarget;
     }
 
     public void setShowcaseX(int x) {
