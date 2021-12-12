diff --git a/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/blueprint/OSGiBlueprintHelloWorldTest.java b/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/blueprint/OSGiBlueprintHelloWorldTest.java
index c196100..83e3b46 100644
--- a/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/blueprint/OSGiBlueprintHelloWorldTest.java
+++ b/tests/camel-itest-osgi/src/test/java/org/apache/camel/itest/osgi/blueprint/OSGiBlueprintHelloWorldTest.java
@@ -87,8 +87,8 @@
                         .set(Constants.BUNDLE_SYMBOLICNAME, OSGiBlueprintHelloWorldTest.class.getName())
                         .build()).noStart(),
                         
-                // install the spring, http features first
-                scanFeatures(getKarafFeatureUrl(), "spring", "spring-dm", "jetty"),
+                // install the http features first
+                scanFeatures(getKarafFeatureUrl(), "jetty"),
 
                 // using the features to install the camel components
                 scanFeatures(getCamelKarafFeatureUrl(),
