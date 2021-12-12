diff --git a/test/org/apache/catalina/webresources/TestFileResourceSet.java b/test/org/apache/catalina/webresources/TestFileResourceSet.java
index 0945699..5a0829d 100644
--- a/test/org/apache/catalina/webresources/TestFileResourceSet.java
+++ b/test/org/apache/catalina/webresources/TestFileResourceSet.java
@@ -19,6 +19,6 @@
 public class TestFileResourceSet extends AbstractTestFileResourceSet {
 
     public TestFileResourceSet() {
-        super(true);
+        super(false);
     }
 }
\ No newline at end of file
