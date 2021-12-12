diff --git a/java/compiler/impl/src/com/intellij/compiler/make/CachedPersistentHashMap.java b/java/compiler/impl/src/com/intellij/compiler/make/CachedPersistentHashMap.java
index 08ed18d..b8b45cbe 100644
--- a/java/compiler/impl/src/com/intellij/compiler/make/CachedPersistentHashMap.java
+++ b/java/compiler/impl/src/com/intellij/compiler/make/CachedPersistentHashMap.java
@@ -86,7 +86,7 @@
   @Override
   protected void doRemove(Key key) throws IOException {
     myCache.remove(key);
-    super.remove(key);
+    super.doRemove(key);
   }
 
   @Override
@@ -105,7 +105,7 @@
       clearCache();
     }
     finally {
-      super.close();
+      super.doClose();
     }
   }
 
