diff --git a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java
index cd4fbfe..1817ab5 100644
--- a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java
+++ b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java
@@ -132,7 +132,7 @@
                 if (bitmap != null) {
                     BitmapDrawable drawable = new BitmapDrawable(getContext().getResources(),
                             bitmap);
-                    imageView.setBackgroundDrawable(drawable);
+                    imageView.setImageDrawable(drawable);
                 }
             }
         }
