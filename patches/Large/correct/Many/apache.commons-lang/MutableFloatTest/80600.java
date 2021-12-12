diff --git a/src/test/java/org/apache/commons/lang3/mutable/MutableFloatTest.java b/src/test/java/org/apache/commons/lang3/mutable/MutableFloatTest.java
index 9365732..b297731 100644
--- a/src/test/java/org/apache/commons/lang3/mutable/MutableFloatTest.java
+++ b/src/test/java/org/apache/commons/lang3/mutable/MutableFloatTest.java
@@ -39,7 +39,7 @@
         assertEquals(2f, new MutableFloat(new Float(2f)).floatValue(), 0.0001f);
         assertEquals(3f, new MutableFloat(new MutableFloat(3f)).floatValue(), 0.0001f);
 
-        assertEquals(2f, new MutableDouble("2.0").floatValue(), 0.0001f);
+        assertEquals(2f, new MutableFloat("2.0").floatValue(), 0.0001f);
 
         try {
             new MutableFloat((Number)null);
