diff --git a/test/commons/grails/util/GrailsUtilTests.java b/test/commons/grails/util/GrailsUtilTests.java
index 40340b7..3ab261b 100644
--- a/test/commons/grails/util/GrailsUtilTests.java
+++ b/test/commons/grails/util/GrailsUtilTests.java
@@ -46,7 +46,7 @@
         assertEquals("myenvironment", GrailsUtil.getEnvironment());        
     }
 
-    void testGrailsVersion() {
+    public void testGrailsVersion() {
 
         assertEquals("1.0.3-SNAPSHOT", GrailsUtil.getGrailsVersion());
     }
