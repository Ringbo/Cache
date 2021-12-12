diff --git a/platform/util/src/com/intellij/util/ui/JBUI.java b/platform/util/src/com/intellij/util/ui/JBUI.java
index 8a26dc1..7063d71 100644
--- a/platform/util/src/com/intellij/util/ui/JBUI.java
+++ b/platform/util/src/com/intellij/util/ui/JBUI.java
@@ -503,12 +503,12 @@
    * @author tav
    */
   public static abstract class AuxJBIcon extends JBIcon implements AuxJBUIScale {
-    private float myCachedJBUIScale = scale(1f);
+    private float myCachedJBUIScale = currentJBUIScale();
 
     @Override
     public boolean updateJBUIScale() {
       if (needUpdateJBUIScale()) {
-        myCachedJBUIScale = scale(1f);
+        myCachedJBUIScale = currentJBUIScale();
         return true;
       }
       return false;
@@ -516,7 +516,7 @@
 
     @Override
     public boolean needUpdateJBUIScale() {
-      return myCachedJBUIScale != scale(1f);
+      return myCachedJBUIScale != currentJBUIScale();
     }
   }
 
