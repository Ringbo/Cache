diff --git a/src/test/org/codehaus/groovy/runtime/TupleListTest.java b/src/test/org/codehaus/groovy/runtime/TupleListTest.java
index a703175..104cf41 100644
--- a/src/test/org/codehaus/groovy/runtime/TupleListTest.java
+++ b/src/test/org/codehaus/groovy/runtime/TupleListTest.java
@@ -28,7 +28,7 @@
 public class TupleListTest extends GroovyTestCase {
 
     public void testIterateOverTuple() throws Exception {
-        StringBuffer buffer = new StringBuffer();
+        StringBuilder buffer = new StringBuilder();
         for (Iterator iter = InvokerHelper.asIterator(InvokerHelper.createTuple(new Object[]{"a", "b", "c"}));
              iter.hasNext();
                 ) {
@@ -40,7 +40,7 @@
     }
 
     public void testIterateOverList() throws Exception {
-        StringBuffer buffer = new StringBuffer();
+        StringBuilder buffer = new StringBuilder();
         for (Iterator iter = InvokerHelper.asIterator(InvokerHelper.createList(new Object[]{"a", "b", "c"}));
              iter.hasNext();
                 ) {
