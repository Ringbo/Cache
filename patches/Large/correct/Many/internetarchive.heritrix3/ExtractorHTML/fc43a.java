diff --git a/modules/src/main/java/org/archive/modules/extractor/ExtractorHTML.java b/modules/src/main/java/org/archive/modules/extractor/ExtractorHTML.java
index 5845918..e76f7f1 100644
--- a/modules/src/main/java/org/archive/modules/extractor/ExtractorHTML.java
+++ b/modules/src/main/java/org/archive/modules/extractor/ExtractorHTML.java
@@ -454,7 +454,7 @@
                     (String)value: value.toString();
                 CharSequence context = elementContext(element,
                     attr.group(6));
-                processEmbed(curi, codebase, context);
+                processLink(curi, codebase, context);
             } else if (attr.start(7) > -1) {
                 // CLASSID, DATA
                 if (resources == null) {
