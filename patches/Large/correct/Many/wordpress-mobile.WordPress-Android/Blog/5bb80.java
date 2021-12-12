diff --git a/src/org/wordpress/android/models/Blog.java b/src/org/wordpress/android/models/Blog.java
index af3a0ce..0488ab8 100644
--- a/src/org/wordpress/android/models/Blog.java
+++ b/src/org/wordpress/android/models/Blog.java
@@ -105,7 +105,7 @@
                 this.blogOptions = "";
             if (blogVals.get(26) != null && (Integer) blogVals.get(26) > 0)
                 this.setAdmin(true);
-            if (blogVals.get(26) != null && (Integer) blogVals.get(27) > 0)
+            if (blogVals.get(27) != null && (Integer) blogVals.get(27) > 0)
                 this.isHidden = true;
         } else {
             throw new Exception();
