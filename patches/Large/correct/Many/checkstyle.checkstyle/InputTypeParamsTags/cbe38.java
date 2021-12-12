diff --git a/src/testinputs/com/puppycrawl/tools/checkstyle/InputTypeParamsTags.java b/src/testinputs/com/puppycrawl/tools/checkstyle/InputTypeParamsTags.java
index c057ba0..acabdec 100644
--- a/src/testinputs/com/puppycrawl/tools/checkstyle/InputTypeParamsTags.java
+++ b/src/testinputs/com/puppycrawl/tools/checkstyle/InputTypeParamsTags.java
@@ -3,20 +3,20 @@
 /**
  * Some explanation.
  * @param <A> A type param
- * @param <B> Another type param
- * @param <D> The wrong type param
+ * @param <B1> Another type param
+ * @param <D123> The wrong type param
  * @author Nobody
  * @version 1.0
  */
-public class InputTypeParamsTags<A,B,C extends Comparable>
+public class InputTypeParamsTags<A,B1,C456 extends Comparable>
 {
     /**
      * Some explanation.
      * @param <X> A type param
-     * @param <Y> Another type param
+     * @param <Y1> Another type param
      * @return a string
      */
-    public <X, Y> String doSomething()
+    public <X, Y1> String doSomething()
     {
         return null;
     }
