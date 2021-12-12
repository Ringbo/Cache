diff --git a/test/org/apache/catalina/startup/TomcatBaseTest.java b/test/org/apache/catalina/startup/TomcatBaseTest.java
index b3470b8..fd03a91 100644
--- a/test/org/apache/catalina/startup/TomcatBaseTest.java
+++ b/test/org/apache/catalina/startup/TomcatBaseTest.java
@@ -304,7 +304,7 @@
 
             @Override
             public int available() {
-                if (done) return 0;
+                if (done || body == null) return 0;
                 else return body.length;
             }
         };
