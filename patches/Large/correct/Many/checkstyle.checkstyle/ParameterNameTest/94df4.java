diff --git a/src/it/java/com/google/checkstyle/test/chapter5naming/rule526parameternames/ParameterNameTest.java b/src/it/java/com/google/checkstyle/test/chapter5naming/rule526parameternames/ParameterNameTest.java
index a9eb52c..190c1f4 100644
--- a/src/it/java/com/google/checkstyle/test/chapter5naming/rule526parameternames/ParameterNameTest.java
+++ b/src/it/java/com/google/checkstyle/test/chapter5naming/rule526parameternames/ParameterNameTest.java
@@ -47,7 +47,7 @@
     public static void setConfigurationBuilder() throws CheckstyleException {
         final List<Configuration> configs = getCheckConfigs("ParameterName");
 
-        Assert.assertEquals(configs.size(), 1);
+        Assert.assertEquals(1, configs.size());
 
         config = configs.get(0);
         format = config.getAttribute("format");
