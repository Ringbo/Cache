diff --git a/rt/javascript/src/test/java/org/apache/cxf/javascript/DocLitWrappedClientTest.java b/rt/javascript/src/test/java/org/apache/cxf/javascript/DocLitWrappedClientTest.java
index 528d5ab..1a5dd47 100644
--- a/rt/javascript/src/test/java/org/apache/cxf/javascript/DocLitWrappedClientTest.java
+++ b/rt/javascript/src/test/java/org/apache/cxf/javascript/DocLitWrappedClientTest.java
@@ -55,7 +55,7 @@
     public void before() throws Exception {
         setupRhino("dlw-service-endpoint", 
                    "/org/apache/cxf/javascript/DocLitWrappedTests.js", 
-                   false);
+                   true);
     }
     
     @Override
