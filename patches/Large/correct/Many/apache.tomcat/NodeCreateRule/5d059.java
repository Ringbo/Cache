diff --git a/java/org/apache/tomcat/util/digester/NodeCreateRule.java b/java/org/apache/tomcat/util/digester/NodeCreateRule.java
index 296f625..c6dd072 100644
--- a/java/org/apache/tomcat/util/digester/NodeCreateRule.java
+++ b/java/org/apache/tomcat/util/digester/NodeCreateRule.java
@@ -172,7 +172,7 @@
                     top.appendChild(doc.createTextNode(str));
                 }
             } catch (DOMException e) {
-                throw new SAXException(e.getMessage());
+                throw new SAXException(e.getMessage(), e);
             }
 
         }
@@ -202,7 +202,7 @@
                 top = top.getParentNode();
                 depth--;
             } catch (DOMException e) {
-                throw new SAXException(e.getMessage());
+                throw new SAXException(e.getMessage(), e);
             }
 
         }
@@ -225,7 +225,7 @@
             try {
                 top.appendChild(doc.createProcessingInstruction(target, data));
             } catch (DOMException e) {
-                throw new SAXException(e.getMessage());
+                throw new SAXException(e.getMessage(), e);
             }
 
         }
@@ -270,7 +270,7 @@
                 previousTop.appendChild(top);
                 depth++;
             } catch (DOMException e) {
-                throw new SAXException(e.getMessage());
+                throw new SAXException(e.getMessage(), e);
             }
 
         }
