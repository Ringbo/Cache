diff --git a/subprojects/testing-jvm/src/main/java/org/gradle/api/tasks/testing/testng/TestNGOptions.java b/subprojects/testing-jvm/src/main/java/org/gradle/api/tasks/testing/testng/TestNGOptions.java
index 5e8e2d3..6105a0c 100644
--- a/subprojects/testing-jvm/src/main/java/org/gradle/api/tasks/testing/testng/TestNGOptions.java
+++ b/subprojects/testing-jvm/src/main/java/org/gradle/api/tasks/testing/testng/TestNGOptions.java
@@ -190,7 +190,7 @@
 
     public Object propertyMissing(final String name) {
         if (suiteXmlBuilder != null) {
-            return suiteXmlBuilder.getMetaClass().invokeMissingMethod(suiteXmlBuilder, name, null);
+            return suiteXmlBuilder.getMetaClass().getProperty(suiteXmlBuilder, name);
         }
 
         throw new MissingPropertyException(name, getClass());
