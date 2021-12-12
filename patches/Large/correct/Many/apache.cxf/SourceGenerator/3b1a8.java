diff --git a/tools/wadlto/jaxrs/src/main/java/org/apache/cxf/tools/wadlto/jaxrs/SourceGenerator.java b/tools/wadlto/jaxrs/src/main/java/org/apache/cxf/tools/wadlto/jaxrs/SourceGenerator.java
index a47b809..0c23b1b 100644
--- a/tools/wadlto/jaxrs/src/main/java/org/apache/cxf/tools/wadlto/jaxrs/SourceGenerator.java
+++ b/tools/wadlto/jaxrs/src/main/java/org/apache/cxf/tools/wadlto/jaxrs/SourceGenerator.java
@@ -832,7 +832,7 @@
         for (Element inherited : inheritedParams) {
             boolean duplicate = false;
             for (Element in : inParamElements) {
-                if (in.getLocalName().equals(inherited.getLocalName())) {    
+                if (in.getAttribute("name").equals(inherited.getAttribute("name"))) {    
                     duplicate = true;
                     break;
                 }
