diff --git a/ProjectAPI/src/org/gephi/project/io/LoadTask.java b/ProjectAPI/src/org/gephi/project/io/LoadTask.java
index bc52e11..8cc26a8 100644
--- a/ProjectAPI/src/org/gephi/project/io/LoadTask.java
+++ b/ProjectAPI/src/org/gephi/project/io/LoadTask.java
@@ -100,7 +100,7 @@
                     System.out.println("Error:" + errorType + ", message : " + message);
                 }
             });
-            InputStreamReader isReader = new InputStreamReader(fileObject.getInputStream());
+            InputStreamReader isReader = new InputStreamReader(fileObject.getInputStream(), "UTF-8");
             Xml10FilterReader filterReader = new Xml10FilterReader(isReader);
             XMLStreamReader reader = inputFactory.createXMLStreamReader(filterReader);
 
