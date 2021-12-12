diff --git a/h2/src/main/org/h2/mvstore/MVMap.java b/h2/src/main/org/h2/mvstore/MVMap.java
index d46a4ea..1d20525 100644
--- a/h2/src/main/org/h2/mvstore/MVMap.java
+++ b/h2/src/main/org/h2/mvstore/MVMap.java
@@ -1065,7 +1065,7 @@
 
     final boolean hasChangesSince(long version) {
         RootReference rootReference = getRoot();
-        return !rootReference.root.isSaved() || getVersion(rootReference) > version;
+        return !rootReference.root.isComplete() || getVersion(rootReference) > version;
     }
 
     public boolean isSingleWriter() {
