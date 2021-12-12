diff --git a/J2EE/source/com/intellij/j2ee/module/LibraryLinkImpl.java b/J2EE/source/com/intellij/j2ee/module/LibraryLinkImpl.java
index 73cb6b1..cab0921 100644
--- a/J2EE/source/com/intellij/j2ee/module/LibraryLinkImpl.java
+++ b/J2EE/source/com/intellij/j2ee/module/LibraryLinkImpl.java
@@ -272,7 +272,7 @@
         if (dependency == null) {
           continue;
         }
-        final Library library = findModuleLibrary(module, provider, url, visited);
+        final Library library = findModuleLibrary(dependency, provider, url, visited);
         if (library != null) {
           return library;
         }
