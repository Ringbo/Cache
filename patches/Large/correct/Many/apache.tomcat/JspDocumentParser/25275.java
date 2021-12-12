diff --git a/java/org/apache/jasper/compiler/JspDocumentParser.java b/java/org/apache/jasper/compiler/JspDocumentParser.java
index 6cbd353..6f82c16 100644
--- a/java/org/apache/jasper/compiler/JspDocumentParser.java
+++ b/java/org/apache/jasper/compiler/JspDocumentParser.java
@@ -1184,8 +1184,9 @@
         TagInfo tagInfo = tagLibInfo.getTag(localName);
         TagFileInfo tagFileInfo = tagLibInfo.getTagFile(localName);
         if (tagInfo == null && tagFileInfo == null) {
-            throw new SAXException(
-                Localizer.getMessage("jsp.error.xml.bad_tag", localName, uri));
+            throw new SAXParseException(
+                Localizer.getMessage("jsp.error.xml.bad_tag", localName, uri),
+                locator);
         }
         Class<?> tagHandlerClass = null;
         if (tagInfo != null) {
@@ -1194,11 +1195,11 @@
                 tagHandlerClass =
                     ctxt.getClassLoader().loadClass(handlerClassName);
             } catch (Exception e) {
-                throw new SAXException(
+                throw new SAXParseException(
                     Localizer.getMessage("jsp.error.loadclass.taghandler",
                                          handlerClassName,
                                          qName),
-                    e);
+                    locator, e);
             }
         }
 
@@ -1329,7 +1330,7 @@
                         Localizer.getMessage(
                             "jsp.error.parse.xml.scripting.invalid.body",
                             elemType);
-                    throw new SAXException(msg);
+                    throw new SAXParseException(msg, locator);
                 }
             }
         }
@@ -1357,7 +1358,7 @@
                 locator,
                 fnfe);
         } catch (Exception e) {
-            throw new SAXException(e);
+            throw new SAXParseException(e.getMessage(), locator, e);
         }
     }
 
