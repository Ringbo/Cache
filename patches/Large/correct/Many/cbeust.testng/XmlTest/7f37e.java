diff --git a/src/main/java/org/testng/xml/XmlTest.java b/src/main/java/org/testng/xml/XmlTest.java
index b391572..ec63e82 100755
--- a/src/main/java/org/testng/xml/XmlTest.java
+++ b/src/main/java/org/testng/xml/XmlTest.java
@@ -689,7 +689,7 @@
 
   public String getPreserveOrder() {
     String result = m_preserveOrder;
-    if (result == null || XmlSuite.DEFAULT_PRESERVE_ORDER.equals(m_verbose)) {
+    if (result == null || XmlSuite.DEFAULT_PRESERVE_ORDER.equals(m_preserveOrder)) {
       result = m_suite.getPreserveOrder();
     }
 
