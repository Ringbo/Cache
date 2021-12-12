diff --git a/flex/src/com/intellij/javascript/flex/mxml/FlexMxmlColorAnnotator.java b/flex/src/com/intellij/javascript/flex/mxml/FlexMxmlColorAnnotator.java
index 3254a9e..a6e4ef2 100644
--- a/flex/src/com/intellij/javascript/flex/mxml/FlexMxmlColorAnnotator.java
+++ b/flex/src/com/intellij/javascript/flex/mxml/FlexMxmlColorAnnotator.java
@@ -44,7 +44,7 @@
     if (!(element instanceof XmlAttribute) || !JavaScriptSupportLoader.isFlexMxmFile(element.getContainingFile())) {
       return;
     }
-    if (LineMarkerSettings.getSettings().isEnabled(new ColorLineMarkerProvider())) {
+    if (!LineMarkerSettings.getSettings().isEnabled(new ColorLineMarkerProvider())) {
       return;
     }
     XmlAttribute attribute = (XmlAttribute)element;
