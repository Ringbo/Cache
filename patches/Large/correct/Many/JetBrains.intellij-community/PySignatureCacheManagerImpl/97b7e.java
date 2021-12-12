diff --git a/python/src/com/jetbrains/python/debugger/PySignatureCacheManagerImpl.java b/python/src/com/jetbrains/python/debugger/PySignatureCacheManagerImpl.java
index 009811a..ac51515 100644
--- a/python/src/com/jetbrains/python/debugger/PySignatureCacheManagerImpl.java
+++ b/python/src/com/jetbrains/python/debugger/PySignatureCacheManagerImpl.java
@@ -141,7 +141,7 @@
     try {
       data = CALL_SIGNATURES_ATTRIBUTE.readAttributeBytes(file);
     }
-    catch (IOException e) {
+    catch (Exception e) {
       data = null;
     }
 
