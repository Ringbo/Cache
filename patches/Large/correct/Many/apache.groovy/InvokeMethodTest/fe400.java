diff --git a/src/test/org/codehaus/groovy/runtime/InvokeMethodTest.java b/src/test/org/codehaus/groovy/runtime/InvokeMethodTest.java
index 43f03ee..f57236e 100644
--- a/src/test/org/codehaus/groovy/runtime/InvokeMethodTest.java
+++ b/src/test/org/codehaus/groovy/runtime/InvokeMethodTest.java
@@ -283,11 +283,11 @@
 
     public void testListGetWithRange() throws Throwable {
         List list = Arrays.asList(new Object[] { "a", "b", "c" });
-        Object range = new IntRange(1, 3);
+        Object range = new IntRange(0, 2);
         Object value = invoke(list, "get", range);
         assertTrue("Returned List: " + value, value instanceof List);
         List retList = (List) value;
-        assertEquals("List size", 2, retList.size());
+        assertEquals("List size", 3, retList.size());
     }
 
     public void testSetLenientOnDateFormat() throws Throwable {
