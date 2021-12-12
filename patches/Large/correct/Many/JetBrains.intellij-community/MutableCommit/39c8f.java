diff --git a/src/org/hanuna/gitalk/commitmodel/builder/MutableCommit.java b/src/org/hanuna/gitalk/commitmodel/builder/MutableCommit.java
index f8430ae..ca9814d 100644
--- a/src/org/hanuna/gitalk/commitmodel/builder/MutableCommit.java
+++ b/src/org/hanuna/gitalk/commitmodel/builder/MutableCommit.java
@@ -97,7 +97,7 @@
 
     @Override
     public int index() {
-        assert !wasRead : "index undefined";
+        assert wasRead : "index undefined";
         return index;
     }
 
