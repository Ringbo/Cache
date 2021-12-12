diff --git a/pager-bottom-tab-strip/src/main/java/me/majiajie/pagerbottomtabstrip/Controller.java b/pager-bottom-tab-strip/src/main/java/me/majiajie/pagerbottomtabstrip/Controller.java
index f05be76..24b518f 100644
--- a/pager-bottom-tab-strip/src/main/java/me/majiajie/pagerbottomtabstrip/Controller.java
+++ b/pager-bottom-tab-strip/src/main/java/me/majiajie/pagerbottomtabstrip/Controller.java
@@ -91,9 +91,9 @@
      */
     void setBackgroundResource(@DrawableRes int resid);
 
-    void setMessageString(String tag, String s);
+    void setMessageString(Object tag, String s);
 
-    void setSelectedTabColor(String tag, int color);
+    void setSelectedTabColor(Object tag, int color);
 
-    void setDefaultTabColor(String tag, int color);
+    void setDefaultTabColor(Object tag, int color);
 }
