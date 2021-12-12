diff --git a/plugins/eclipse/src/org/jetbrains/idea/eclipse/config/CachedXmlDocumentSet.java b/plugins/eclipse/src/org/jetbrains/idea/eclipse/config/CachedXmlDocumentSet.java
index 46f2187..3e476c0 100644
--- a/plugins/eclipse/src/org/jetbrains/idea/eclipse/config/CachedXmlDocumentSet.java
+++ b/plugins/eclipse/src/org/jetbrains/idea/eclipse/config/CachedXmlDocumentSet.java
@@ -72,12 +72,12 @@
 
   public boolean exists(String name) {
     assertKnownName(name);
-    return !deletedContent.contains(name) && getVFile(name, false) != null;
+    return !deletedContent.contains(name) && getVFile(name) != null;
   }
 
   @Nullable
   protected VirtualFile getVFile(@NotNull String name) {
-    return getVFile(name, true);
+    return getVFile(name, false);
   }
 
   @Nullable
@@ -148,7 +148,7 @@
   public void preload() {
     for (String key : nameToDir.keySet()) {
       try {
-        load(key, true);
+        load(key, false);
       }
       catch (IOException ignore) {
       }
