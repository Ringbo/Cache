diff --git a/tests/camel-itest-karaf/src/test/java/org/apache/camel/itest/karaf/AbstractFeatureTest.java b/tests/camel-itest-karaf/src/test/java/org/apache/camel/itest/karaf/AbstractFeatureTest.java
index 0413769..be1a9a5 100644
--- a/tests/camel-itest-karaf/src/test/java/org/apache/camel/itest/karaf/AbstractFeatureTest.java
+++ b/tests/camel-itest-karaf/src/test/java/org/apache/camel/itest/karaf/AbstractFeatureTest.java
@@ -175,7 +175,7 @@
 
             // using the features to install the camel components
             scanFeatures(getCamelKarafFeatureUrl(),
-                "camel-core", "camel-spring", "camel-" + feature),
+                "xml-specs-api", "camel-core", "camel-spring", "camel-" + feature),
 
             workingDirectory("target/paxrunner/"));
 
