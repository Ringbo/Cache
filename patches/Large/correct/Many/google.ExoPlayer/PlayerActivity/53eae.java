diff --git a/demos/main/src/main/java/com/google/android/exoplayer2/demo/PlayerActivity.java b/demos/main/src/main/java/com/google/android/exoplayer2/demo/PlayerActivity.java
index fe2e7c1..d462ab7 100644
--- a/demos/main/src/main/java/com/google/android/exoplayer2/demo/PlayerActivity.java
+++ b/demos/main/src/main/java/com/google/android/exoplayer2/demo/PlayerActivity.java
@@ -577,7 +577,7 @@
         button.setText(label);
         button.setTag(i);
         button.setOnClickListener(this);
-        debugRootView.addView(button, debugRootView.getChildCount() - 1);
+        debugRootView.addView(button);
       }
     }
   }
