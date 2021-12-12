diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-applications/hadoop-yarn-slider/hadoop-yarn-slider-core/src/test/java/org/apache/slider/utils/TestServiceApiUtil.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-applications/hadoop-yarn-slider/hadoop-yarn-slider-core/src/test/java/org/apache/slider/utils/TestServiceApiUtil.java
index 889cc04..28f36de 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-applications/hadoop-yarn-slider/hadoop-yarn-slider-core/src/test/java/org/apache/slider/utils/TestServiceApiUtil.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-applications/hadoop-yarn-slider/hadoop-yarn-slider-core/src/test/java/org/apache/slider/utils/TestServiceApiUtil.java
@@ -463,7 +463,8 @@
     Application application = createValidApplication(null);
     application.setComponents(Arrays.asList(c, d, e));
     try {
-      ServiceApiUtil.validateAndResolveApplication(application, sfs);
+      ServiceApiUtil.validateAndResolveApplication(application, sfs,
+          CONF_DEFAULT_DNS);
       Assert.fail(EXCEPTION_PREFIX + "components with bad dependencies");
     } catch (IllegalArgumentException ex) {
       assertEquals(String.format(
