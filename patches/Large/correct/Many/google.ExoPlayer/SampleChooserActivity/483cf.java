diff --git a/demos/main/src/main/java/com/google/android/exoplayer2/demo/SampleChooserActivity.java b/demos/main/src/main/java/com/google/android/exoplayer2/demo/SampleChooserActivity.java
index 324c5ea..5524f98 100644
--- a/demos/main/src/main/java/com/google/android/exoplayer2/demo/SampleChooserActivity.java
+++ b/demos/main/src/main/java/com/google/android/exoplayer2/demo/SampleChooserActivity.java
@@ -548,10 +548,10 @@
 
     @Override
     public Intent buildIntent(Context context) {
-      Uri[] uris = new Uri[children.length];
+      String[] uris = new String[children.length];
       String[] extensions = new String[children.length];
       for (int i = 0; i < children.length; i++) {
-        uris[i] = children[i].uri;
+        uris[i] = children[i].uri.toString();
         extensions[i] = children[i].extension;
       }
       return super.buildIntent(context)
