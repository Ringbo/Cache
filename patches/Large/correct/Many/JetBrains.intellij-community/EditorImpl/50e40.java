diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
index 7d1ecdc..5a6be1d 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
@@ -1055,7 +1055,7 @@
       }
     }
 
-    if (logLine == 0) {
+    if (logLine <= 0) {
       lineStartOffset = 0;
     }
     else if (lineStartOffset < 0) {
