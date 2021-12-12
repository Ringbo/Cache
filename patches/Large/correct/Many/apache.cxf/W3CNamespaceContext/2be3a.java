diff --git a/api/src/main/java/org/apache/cxf/staxutils/W3CNamespaceContext.java b/api/src/main/java/org/apache/cxf/staxutils/W3CNamespaceContext.java
index a0bce11..7b412f0 100644
--- a/api/src/main/java/org/apache/cxf/staxutils/W3CNamespaceContext.java
+++ b/api/src/main/java/org/apache/cxf/staxutils/W3CNamespaceContext.java
@@ -82,11 +82,11 @@
 
                 String val = a.getValue();
                 if (val != null && val.equals(uri)) {
-                    String name = a.getNodeName();
+                    String name = a.getLocalName();
                     if ("xmlns".equals(name)) {
                         return "";
                     } else {
-                        return name.substring(6);
+                        return name;
                     }
                 }
             }
