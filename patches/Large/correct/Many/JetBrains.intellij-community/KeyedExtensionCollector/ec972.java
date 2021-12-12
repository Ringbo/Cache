diff --git a/platform/platform-api/src/com/intellij/openapi/util/KeyedExtensionCollector.java b/platform/platform-api/src/com/intellij/openapi/util/KeyedExtensionCollector.java
index 8841dce..8717823 100644
--- a/platform/platform-api/src/com/intellij/openapi/util/KeyedExtensionCollector.java
+++ b/platform/platform-api/src/com/intellij/openapi/util/KeyedExtensionCollector.java
@@ -215,14 +215,14 @@
   }
 
   public boolean hasAnyExtensions() {
-    r.lock();
+    w.lock();
     try {
       if (!myExplicitExtensions.isEmpty()) return true;
       final ExtensionPoint<KeyedLazyInstance<T>> point = getPoint();
       return point != null && point.hasAnyExtensions();
     }
     finally {
-      r.unlock();
+      w.unlock();
     }
   }
 
