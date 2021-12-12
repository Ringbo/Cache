diff --git a/src/testinputs/com/puppycrawl/tools/checkstyle/InputJavadocStyleCheck.java b/src/testinputs/com/puppycrawl/tools/checkstyle/InputJavadocStyleCheck.java
index eafae96..2cd0cd7 100755
--- a/src/testinputs/com/puppycrawl/tools/checkstyle/InputJavadocStyleCheck.java
+++ b/src/testinputs/com/puppycrawl/tools/checkstyle/InputJavadocStyleCheck.java
@@ -248,16 +248,16 @@
 
     /**
     * A test class.
-    * @param <T> this is NOT an unclosed T tag
+    * @param <T1> this is NOT an unclosed T1 tag
     * @author <a href="mailto:foo@nomail.com">Foo Bar</a>
     */
-    public class TestClass<T>
+    public class TestClass<T1>
     {
         /**
         * Retrieves X.
         * @return a value
         */
-        public T getX()
+        public T1 getX()
         {
             return null;
         }
