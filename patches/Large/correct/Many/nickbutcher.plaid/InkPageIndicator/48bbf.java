diff --git a/app/src/main/java/io/plaidapp/ui/widget/InkPageIndicator.java b/app/src/main/java/io/plaidapp/ui/widget/InkPageIndicator.java
index 84ce0b0..bfe946e 100644
--- a/app/src/main/java/io/plaidapp/ui/widget/InkPageIndicator.java
+++ b/app/src/main/java/io/plaidapp/ui/widget/InkPageIndicator.java
@@ -561,7 +561,8 @@
     }
 
     private void setSelectedPage(int now) {
-        if (now == currentPage) return;
+        // Check for null array
+        if (now == currentPage || dotCenterX == null) return;
 
         pageChanging = true;
         previousPage = currentPage;
