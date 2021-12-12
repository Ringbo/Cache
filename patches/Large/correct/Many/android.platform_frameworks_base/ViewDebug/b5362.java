diff --git a/core/java/android/view/ViewDebug.java b/core/java/android/view/ViewDebug.java
index 9232616..3ebe1c2 100644
--- a/core/java/android/view/ViewDebug.java
+++ b/core/java/android/view/ViewDebug.java
@@ -910,7 +910,7 @@
     private static void dump(View root, OutputStream clientStream) throws IOException {
         BufferedWriter out = null;
         try {
-            out = new BufferedWriter(new OutputStreamWriter(clientStream), 32 * 1024);
+            out = new BufferedWriter(new OutputStreamWriter(clientStream, "utf-8"), 32 * 1024);
             View view = root.getRootView();
             if (view instanceof ViewGroup) {
                 ViewGroup group = (ViewGroup) view;
