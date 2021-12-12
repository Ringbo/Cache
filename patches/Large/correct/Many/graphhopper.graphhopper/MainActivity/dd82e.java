diff --git a/android/app/src/main/java/com/graphhopper/android/MainActivity.java b/android/app/src/main/java/com/graphhopper/android/MainActivity.java
index 5b965e0..b75c9b5 100644
--- a/android/app/src/main/java/com/graphhopper/android/MainActivity.java
+++ b/android/app/src/main/java/com/graphhopper/android/MainActivity.java
@@ -249,7 +249,7 @@
             protected List<String> saveDoInBackground( Void... params )
                     throws Exception
             {
-                String[] lines = new AndroidDownloader().downloadAsString(fileListURL).split("\n");
+                String[] lines = new AndroidDownloader().downloadAsString(fileListURL, false).split("\n");
                 List<String> res = new ArrayList<String>();
                 for (String str : lines)
                 {
