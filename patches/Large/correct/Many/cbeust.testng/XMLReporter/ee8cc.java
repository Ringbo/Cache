diff --git a/src/main/java/org/testng/reporters/XMLReporter.java b/src/main/java/org/testng/reporters/XMLReporter.java
index 5d490e5..7a57c26 100755
--- a/src/main/java/org/testng/reporters/XMLReporter.java
+++ b/src/main/java/org/testng/reporters/XMLReporter.java
@@ -104,7 +104,7 @@
     File parentDir = suiteFile.getParentFile();
     suiteFile.getParentFile().mkdirs();
     if (parentDir.exists() || suiteFile.getParentFile().exists()) {
-      Utils.writeFile(parentDir.getAbsolutePath(), FILE_NAME, xmlBuffer.toXML());
+      Utils.writeUtf8File(parentDir.getAbsolutePath(), FILE_NAME, xmlBuffer.toXML());
     }
   }
 
