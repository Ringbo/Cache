diff --git a/xml/impl/src/com/intellij/xml/util/documentation/XmlDocumentationProvider.java b/xml/impl/src/com/intellij/xml/util/documentation/XmlDocumentationProvider.java
index a81ae1b731..04e2b5c 100644
--- a/xml/impl/src/com/intellij/xml/util/documentation/XmlDocumentationProvider.java
+++ b/xml/impl/src/com/intellij/xml/util/documentation/XmlDocumentationProvider.java
@@ -73,7 +73,7 @@
     final StringBuilder sb = new StringBuilder();
     if (StringUtil.isNotEmpty(typeName)) sb.append(typeName).append(" ");
     sb.append("\"").append(name).append("\"");
-    if (file != null) {
+    if (file != null && file.isPhysical()) {
       sb.append(" [").append(file.getName()).append("]");
     }
     return sb.toString();
