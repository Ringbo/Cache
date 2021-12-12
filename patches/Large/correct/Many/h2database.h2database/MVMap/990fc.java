diff --git a/h2/src/main/org/h2/mvstore/MVMap.java b/h2/src/main/org/h2/mvstore/MVMap.java
index 405b313..3af62f8 100644
--- a/h2/src/main/org/h2/mvstore/MVMap.java
+++ b/h2/src/main/org/h2/mvstore/MVMap.java
@@ -1308,7 +1308,7 @@
         int attempt = 0;
         boolean success;
         do {
-            RootReference rootReference = getRoot();
+            RootReference rootReference = getRootInternal();
             int appendCounter = rootReference.getAppendCounter();
             if (appendCounter > 0) {
                 RootReference updatedRootReference = new RootReference(rootReference, appendCounter - 1, ++attempt);
