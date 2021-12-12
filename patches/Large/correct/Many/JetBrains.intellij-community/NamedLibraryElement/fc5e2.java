diff --git a/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/NamedLibraryElement.java b/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/NamedLibraryElement.java
index f315552..d01848e 100644
--- a/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/NamedLibraryElement.java
+++ b/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/NamedLibraryElement.java
@@ -52,7 +52,7 @@
     final NamedLibraryElement namedLibraryElement = (NamedLibraryElement)o;
 
     if (!myEntry.equals(namedLibraryElement.myEntry)) return false;
-    if (Comparing.equal(myContextModule, namedLibraryElement.myContextModule)) return false;
+    if (!Comparing.equal(myContextModule, namedLibraryElement.myContextModule)) return false;
 
     return true;
   }
