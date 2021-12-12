diff --git a/modules/core/src/test/java/org/apache/ignite/startup/cmdline/GridCommandLineTransformerSelfTest.java b/modules/core/src/test/java/org/apache/ignite/startup/cmdline/GridCommandLineTransformerSelfTest.java
index ec85532..dafc649 100644
--- a/modules/core/src/test/java/org/apache/ignite/startup/cmdline/GridCommandLineTransformerSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/startup/cmdline/GridCommandLineTransformerSelfTest.java
@@ -32,7 +32,7 @@
     public void testTransformIfNoArguments() throws Exception {
         assertEquals(
             "\"INTERACTIVE=0\" \"QUIET=-DIGNITE_QUIET=true\" \"NO_PAUSE=0\" " +
-            "\"JVM_XOPTS=\" \"CONFIG=\"",
+                "\"NO_JMX=0\" \"JVM_XOPTS=\" \"CONFIG=\"",
             CommandLineTransformer.transform());
     }
 
@@ -101,7 +101,7 @@
      */
     public void testTransformIfOnlyPathToConfigSpecified() throws Exception {
         assertEquals(
-            "\"INTERACTIVE=0\" \"QUIET=-DIGNITE_QUIET=true\" \"NO_PAUSE=0\" " +
+            "\"INTERACTIVE=0\" \"QUIET=-DIGNITE_QUIET=true\" \"NO_PAUSE=0\" \"NO_JMX=0\" " +
             "\"JVM_XOPTS=\" \"CONFIG=c:\\qw.xml\"",
             CommandLineTransformer.transform("c:\\qw.xml"));
     }
@@ -111,10 +111,10 @@
      */
     public void testTransformIfAllSupportedArguments() throws Exception {
         assertEquals(
-            "\"INTERACTIVE=1\" \"QUIET=-DIGNITE_QUIET=false\" \"NO_PAUSE=1\" " +
+            "\"INTERACTIVE=1\" \"QUIET=-DIGNITE_QUIET=false\" \"NO_PAUSE=1\" \"NO_JMX=1\" " +
             "\"JVM_XOPTS=-Xmx1g -Xms1m\" " +
             "\"CONFIG=\"c:\\path to\\русский каталог\"\"",
-            CommandLineTransformer.transform("-i", "-np", "-v", "-J-Xmx1g", "-J-Xms1m",
+            CommandLineTransformer.transform("-i", "-np", "-v", "-J-Xmx1g", "-J-Xms1m", "-nojmx",
                 "\"c:\\path to\\русский каталог\""));
     }
 }
