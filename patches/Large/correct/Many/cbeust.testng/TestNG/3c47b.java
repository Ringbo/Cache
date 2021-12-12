diff --git a/src/main/java/org/testng/TestNG.java b/src/main/java/org/testng/TestNG.java
index 435fb56..f1809b7 100644
--- a/src/main/java/org/testng/TestNG.java
+++ b/src/main/java/org/testng/TestNG.java
@@ -129,7 +129,7 @@
   private String[] m_includedGroups;
   private String[] m_excludedGroups;
 
-  private Boolean m_isJUnit = Boolean.FALSE;
+  private Boolean m_isJUnit = XmlSuite.DEFAULT_JUNIT;
   protected boolean m_useDefaultListeners = true;
 
   private ITestRunnerFactory m_testRunnerFactory;
@@ -990,7 +990,7 @@
   private void createSuiteRunners(Map<XmlSuite, ISuite> suiteRunnerMap /* OUT */, XmlSuite xmlSuite) {
     xmlSuite.setDefaultAnnotations(m_defaultAnnotations.toString());
 
-    if (null != m_isJUnit) {
+    if (null != m_isJUnit && ! m_isJUnit.equals(XmlSuite.DEFAULT_JUNIT)) {
       xmlSuite.setJUnit(m_isJUnit);
     }
 
