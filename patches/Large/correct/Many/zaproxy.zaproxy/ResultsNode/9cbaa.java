diff --git a/src/com/sittinglittleduck/DirBuster/gui/Tree/ResultsNode.java b/src/com/sittinglittleduck/DirBuster/gui/Tree/ResultsNode.java
index dd495d4..8484902 100644
--- a/src/com/sittinglittleduck/DirBuster/gui/Tree/ResultsNode.java
+++ b/src/com/sittinglittleduck/DirBuster/gui/Tree/ResultsNode.java
@@ -129,7 +129,7 @@
     
     public void clearData()
     {
-        children.removeAll(children);
+        children.removeAllElements();
         result = null;
         name = null;
     }
