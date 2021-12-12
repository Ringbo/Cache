diff --git a/src/main/java/org/tron/core/db/api/index/AbstractIndex.java b/src/main/java/org/tron/core/db/api/index/AbstractIndex.java
index 501e562..e9e9e3f 100644
--- a/src/main/java/org/tron/core/db/api/index/AbstractIndex.java
+++ b/src/main/java/org/tron/core/db/api/index/AbstractIndex.java
@@ -95,7 +95,7 @@
 
   @Override
   public boolean update(WrappedByteArray bytes) {
-    return update(bytes);
+    return add(bytes);
   }
 
   @Override
