diff --git a/src/fitnesse/wiki/search/PageFinder.java b/src/fitnesse/wiki/search/PageFinder.java
index fd50576..e0f4bbb 100644
--- a/src/fitnesse/wiki/search/PageFinder.java
+++ b/src/fitnesse/wiki/search/PageFinder.java
@@ -4,6 +4,6 @@
 
 public interface PageFinder {
 
-  abstract void search(WikiPage page);
+  void search(WikiPage page);
 
 }
\ No newline at end of file
