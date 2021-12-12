diff --git a/library/src/main/java/com/github/amlcurran/showcaseview/ShowcaseView.java b/library/src/main/java/com/github/amlcurran/showcaseview/ShowcaseView.java
index 1530094..4f8446d 100644
--- a/library/src/main/java/com/github/amlcurran/showcaseview/ShowcaseView.java
+++ b/library/src/main/java/com/github/amlcurran/showcaseview/ShowcaseView.java
@@ -179,7 +179,7 @@
     }
 
     public boolean hasShowcaseView() {
-        return (showcaseX != 1000000 && showcaseY != 1000000) || !hasNoTarget;
+        return (showcaseX != 1000000 && showcaseY != 1000000) && !hasNoTarget;
     }
 
     public void setShowcaseX(int x) {
