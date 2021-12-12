diff --git a/python/src/com/jetbrains/python/codeInsight/imports/AddImportHelper.java b/python/src/com/jetbrains/python/codeInsight/imports/AddImportHelper.java
index 6528671..ff2a0ca 100644
--- a/python/src/com/jetbrains/python/codeInsight/imports/AddImportHelper.java
+++ b/python/src/com/jetbrains/python/codeInsight/imports/AddImportHelper.java
@@ -190,7 +190,7 @@
         }
         PyImportElement importElement = PyElementGenerator.getInstance(file.getProject()).createImportElement(name);
         existingImport.add(importElement);
-        return false;
+        return true;
       }
     }
     addImportFromStatement(file, path, name, asName, priority);
