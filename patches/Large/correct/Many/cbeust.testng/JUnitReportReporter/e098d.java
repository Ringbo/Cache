diff --git a/src/main/java/org/testng/reporters/JUnitReportReporter.java b/src/main/java/org/testng/reporters/JUnitReportReporter.java
index a3122d1..237b32e 100644
--- a/src/main/java/org/testng/reporters/JUnitReportReporter.java
+++ b/src/main/java/org/testng/reporters/JUnitReportReporter.java
@@ -171,7 +171,7 @@
       xsb.pop("testsuite");
 
       String outputDirectory = defaultOutputDirectory + File.separator + "junitreports";
-      Utils.writeFile(outputDirectory, getFileName(cls), xsb.toXML());
+      Utils.writeUtf8File(outputDirectory, getFileName(cls), xsb.toXML());
     }
 
 //    System.out.println(xsb.toXML());
