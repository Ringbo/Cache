diff --git a/src/main/java/org/testng/xml/XmlTest.java b/src/main/java/org/testng/xml/XmlTest.java
index ec63e82..06abec1 100755
--- a/src/main/java/org/testng/xml/XmlTest.java
+++ b/src/main/java/org/testng/xml/XmlTest.java
@@ -96,7 +96,7 @@
 
   // For YAML
   public List<XmlPackage> getPackages() {
-    return getPackages();
+    return getXmlPackages();
   }
 
   // For YAML
