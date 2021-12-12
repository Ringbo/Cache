diff --git a/h2/src/main/org/h2/mvstore/Page.java b/h2/src/main/org/h2/mvstore/Page.java
index cb8a1c5..dd502ca 100644
--- a/h2/src/main/org/h2/mvstore/Page.java
+++ b/h2/src/main/org/h2/mvstore/Page.java
@@ -936,7 +936,7 @@
             super(map);
         }
 
-        private NonLeaf(MVMap<?, ?> map, NonLeaf source, PageReference[] children, long totalCount) {
+        NonLeaf(MVMap<?, ?> map, NonLeaf source, PageReference[] children, long totalCount) {
             super(map, source);
             this.children = children;
             this.totalCount = totalCount;
