diff --git a/src/main/java/org/testng/xml/XmlTest.java b/src/main/java/org/testng/xml/XmlTest.java
index d3324b1..7337f56 100755
--- a/src/main/java/org/testng/xml/XmlTest.java
+++ b/src/main/java/org/testng/xml/XmlTest.java
@@ -186,7 +186,7 @@
    */
   public boolean isJUnit() {
     Boolean result = m_isJUnit;
-    if (null == result) {
+    if (null == result || XmlSuite.DEFAULT_JUNIT.equals(result)) {
       result = m_suite.isJUnit();
     }
     
@@ -271,7 +271,7 @@
   
   public String getParallel() {
     String result = null;
-    if (null != m_parallel) {
+    if (null != m_parallel || XmlSuite.DEFAULT_PARALLEL.equals(m_parallel)) {
       result = m_parallel;
     }
     else {
