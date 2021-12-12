diff --git a/src/main/org/testng/reporters/SuiteHTMLReporter.java b/src/main/org/testng/reporters/SuiteHTMLReporter.java
index 67ac398..63ea949 100644
--- a/src/main/org/testng/reporters/SuiteHTMLReporter.java
+++ b/src/main/org/testng/reporters/SuiteHTMLReporter.java
@@ -674,8 +674,7 @@
     // TODO CQ why not iterate over entry set if were going to use the key to get the value?
     for (String propertyFileName : suiteResults.keySet()) {
       
-      // TODO CQ why this cast to SuiteResult instead of ISuiteResult? 
-      SuiteResult sr = (SuiteResult) suiteResults.get(propertyFileName);
+      ISuiteResult sr = suiteResults.get(propertyFileName);
       ITestContext testContext = sr.getTestContext();
       
       StringBuffer sb = new StringBuffer();
