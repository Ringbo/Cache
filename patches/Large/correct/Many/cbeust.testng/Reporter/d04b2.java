diff --git a/src/main/org/testng/Reporter.java b/src/main/org/testng/Reporter.java
index b775c90..d3e9d02 100644
--- a/src/main/org/testng/Reporter.java
+++ b/src/main/org/testng/Reporter.java
@@ -114,7 +114,7 @@
     }
   }
 
-  private static ITestResult  getCurrentTestResult() {
+  public static ITestResult getCurrentTestResult() {
     return m_currentTestResult.get();
   }
 
@@ -122,7 +122,7 @@
     System.out.println("[Reporter] " + s);
   }
 
-  public static List<String> getOutput(ITestResult tr) {
+  public static synchronized List<String> getOutput(ITestResult tr) {
     List<String> result = new ArrayList<String>();
     List<Integer> lines = m_methodOutputMap.get(tr);
     if (lines != null) {
