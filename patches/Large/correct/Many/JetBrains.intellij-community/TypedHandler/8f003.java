diff --git a/source/com/intellij/codeInsight/editorActions/TypedHandler.java b/source/com/intellij/codeInsight/editorActions/TypedHandler.java
index db0ae53..60d2e60 100644
--- a/source/com/intellij/codeInsight/editorActions/TypedHandler.java
+++ b/source/com/intellij/codeInsight/editorActions/TypedHandler.java
@@ -210,7 +210,7 @@
         return false;
       }
       finally {
-        while(iterator.getStart() != offset) iterator.retreat();
+        while(iterator.atEnd() || iterator.getStart() != offset) iterator.retreat();
       }
     }
 
