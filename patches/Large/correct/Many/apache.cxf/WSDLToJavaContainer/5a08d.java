diff --git a/tools/wsdlto/core/src/main/java/org/apache/cxf/tools/wsdlto/WSDLToJavaContainer.java b/tools/wsdlto/core/src/main/java/org/apache/cxf/tools/wsdlto/WSDLToJavaContainer.java
index acfaa97..5e08be2 100644
--- a/tools/wsdlto/core/src/main/java/org/apache/cxf/tools/wsdlto/WSDLToJavaContainer.java
+++ b/tools/wsdlto/core/src/main/java/org/apache/cxf/tools/wsdlto/WSDLToJavaContainer.java
@@ -374,7 +374,7 @@
                 URI relativePath = parentFile.relativize(new URI(file.getPath()));
                 String name = relativePath.toString().replace("\\", "/");
                 if (file.isDirectory()) {
-                    if (!name.isEmpty()) {
+                    if (!StringUtils.isEmpty(name)) {
                         if (!name.endsWith("/")) {
                             name += "/";
                         }
