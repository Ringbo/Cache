diff --git a/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorWindow.java b/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorWindow.java
index 26a9785..8b35774 100644
--- a/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorWindow.java
+++ b/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorWindow.java
@@ -671,7 +671,7 @@
       doTrimSize(limit, fileToIgnore, closeNonModifiedFilesFirst);
     }
     finally {
-      setSelectedEditor(selectedComposite, true);
+      setSelectedEditor(selectedComposite, false);
     }
   }
 
