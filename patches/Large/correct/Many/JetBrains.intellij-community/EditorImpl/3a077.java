diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
index 842e791..dc70b5f 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
@@ -4908,7 +4908,7 @@
               fontType = state.getMergedAttributes().getFontType();
             }
 
-            while (softWrapsIndex < softWraps.size()) {
+            while (softWrapsIndex < softWraps.size() && line < lineCount) {
               TextChange softWrap = softWraps.get(softWrapsIndex);
               if (softWrap.getStart() > offset) {
                 break;
