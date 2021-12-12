diff --git a/java/org/apache/tomcat/util/http/mapper/Mapper.java b/java/org/apache/tomcat/util/http/mapper/Mapper.java
index 8374bd7..c8bafa9 100644
--- a/java/org/apache/tomcat/util/http/mapper/Mapper.java
+++ b/java/org/apache/tomcat/util/http/mapper/Mapper.java
@@ -1036,9 +1036,9 @@
             if (path.equals("/")) {
                 // Special handling for Context Root mapped servlet
                 mappingData.pathInfo.setString("/");
-                mappingData.wrapperPath.recycle();
+                mappingData.wrapperPath.setString("");
                 // This seems wrong but it is what the spec says...
-                mappingData.contextPath.recycle();
+                mappingData.contextPath.setString("");
             } else {
                 mappingData.wrapperPath.setString(wrappers[pos].name);
             }
