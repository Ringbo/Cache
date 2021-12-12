diff --git a/source/org/jivesoftware/smackx/provider/XHTMLExtensionProvider.java b/source/org/jivesoftware/smackx/provider/XHTMLExtensionProvider.java
index 26f544f..1eb0918 100644
--- a/source/org/jivesoftware/smackx/provider/XHTMLExtensionProvider.java
+++ b/source/org/jivesoftware/smackx/provider/XHTMLExtensionProvider.java
@@ -70,12 +70,12 @@
                     buffer.append(StringUtils.escapeForXML(parser.getText()));
                 }
             } else if (eventType == XmlPullParser.END_TAG) {
-                if (parser.getName().equals("body") || parser.getDepth() <= depth) {
+                if (parser.getName().equals("body") && parser.getDepth() <= depth) {
                     buffer.append(parser.getText());
                     xhtmlExtension.addBody(buffer.toString());
                 }
                 else if (parser.getName().equals(xhtmlExtension.getElementName())
-                        || parser.getDepth() <= startDepth) {
+                        && parser.getDepth() <= startDepth) {
                     done = true;
                 }
                 else {
