diff --git a/src/org/wordpress/android/models/Blog.java b/src/org/wordpress/android/models/Blog.java
index 87c1139..b56ca60 100644
--- a/src/org/wordpress/android/models/Blog.java
+++ b/src/org/wordpress/android/models/Blog.java
@@ -102,7 +102,7 @@
                 this.blogOptions = "";
             if (blogVals.get(26) != null && (Integer) blogVals.get(26) > 0)
                 this.setAdmin(true);
-            if (blogVals.get(26) != null && (Integer) blogVals.get(27) > 0)
+            if (blogVals.get(27) != null && (Integer) blogVals.get(27) > 0)
                 this.isHidden = true;
         } else {
             throw new Exception();
