diff --git a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCMediaManager.java b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCMediaManager.java
index 3339109..cd64160 100644
--- a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCMediaManager.java
+++ b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCMediaManager.java
@@ -49,7 +49,7 @@
     }
 
     public JCMediaPlayerListener lastListener() {
-        if (listener == null)
+        if (lastListener == null)
             return null;
         return lastListener.get();
     }
