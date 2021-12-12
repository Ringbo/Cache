diff --git a/test/src/org/apache/jmeter/protocol/http/sampler/TestHTTPSamplersAgainstHttpMirrorServer.java b/test/src/org/apache/jmeter/protocol/http/sampler/TestHTTPSamplersAgainstHttpMirrorServer.java
index 9e458f7..248871b 100644
--- a/test/src/org/apache/jmeter/protocol/http/sampler/TestHTTPSamplersAgainstHttpMirrorServer.java
+++ b/test/src/org/apache/jmeter/protocol/http/sampler/TestHTTPSamplersAgainstHttpMirrorServer.java
@@ -1131,9 +1131,9 @@
                 for(int i = 0; i < expected.length; i++) {
                     if(expected[i] != actual[i]) {
                         System.out.println(">>>>>>>>>>>>>>>>>>>>");
-                        System.out.println(new String(expected,0,i+1));
+                        System.out.println(new String(expected,0,i+1,"UTF-8"));
                         System.out.println("====================");
-                        System.out.println(new String(actual,0,i+1));
+                        System.out.println(new String(actual,0,i+1,"UTF-8"));
                         System.out.println("<<<<<<<<<<<<<<<<<<<<");
 /*                        
                         // Useful to when debugging
