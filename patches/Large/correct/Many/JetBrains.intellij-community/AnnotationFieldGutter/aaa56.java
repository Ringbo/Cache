diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/actions/AnnotationFieldGutter.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/actions/AnnotationFieldGutter.java
index f4ee40e..ddb9302 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/actions/AnnotationFieldGutter.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/actions/AnnotationFieldGutter.java
@@ -155,7 +155,7 @@
     if (myColorScheme == null || !myShowBg) return null;
     final String s = getLineText(line, editor);
     final VcsRevisionNumber number = myAnnotation.getLineRevisionNumber(line);
-    if (number == null) return null;
+    if (number == null || s == null) return null;
     final Color bg = myColorScheme.get(number.asString());
     return bg == null ? findBgColor(s) : bg;
   }
