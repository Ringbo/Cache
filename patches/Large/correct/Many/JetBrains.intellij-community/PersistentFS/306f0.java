diff --git a/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/PersistentFS.java b/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/PersistentFS.java
index 6d50c70..d5ac007 100644
--- a/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/PersistentFS.java
+++ b/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/PersistentFS.java
@@ -123,7 +123,7 @@
       names = delegateNames;
     }
     else {
-      Set<String> allNamesSet = new HashSet<String>((currentNames.length + delegateNames.length) * 2);
+      Set<String> allNamesSet = new LinkedHashSet<String>((currentNames.length + delegateNames.length) * 2);
       allNamesSet.addAll(Arrays.asList(currentNames));
       allNamesSet.addAll(Arrays.asList(delegateNames));
       names = allNamesSet.toArray(new String[allNamesSet.size()]);
