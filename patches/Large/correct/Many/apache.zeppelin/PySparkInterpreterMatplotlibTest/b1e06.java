diff --git a/spark/src/test/java/org/apache/zeppelin/spark/PySparkInterpreterMatplotlibTest.java b/spark/src/test/java/org/apache/zeppelin/spark/PySparkInterpreterMatplotlibTest.java
index 9a2a88a..17b2128 100644
--- a/spark/src/test/java/org/apache/zeppelin/spark/PySparkInterpreterMatplotlibTest.java
+++ b/spark/src/test/java/org/apache/zeppelin/spark/PySparkInterpreterMatplotlibTest.java
@@ -213,7 +213,7 @@
     // again but in a different color.
     ret = pyspark.interpret("plt.plot([1, 2, 3])", context);
     ret2 = pyspark.interpret("plt.show()", context);
-    assertNotSame(ret1.message().get(1).getData(), ret2.message().get(1).getData());
+    assertNotSame(ret1.message().get(0).getData(), ret2.message().get(0).getData());
   }
   
   @Test
@@ -226,7 +226,7 @@
     ret = pyspark.interpret("plt.plot([1, 2, 3])", context);
     ret = pyspark.interpret("plt.show()", context);    
     assertEquals(ret.message().toString(), InterpreterResult.Code.SUCCESS, ret.code());
-    assertEquals(ret.message().toString(), Type.ANGULAR, ret.message().get(1).getType());
+    assertEquals(ret.message().toString(), Type.ANGULAR, ret.message().get(0).getType());
 
     // Check if the figure data is in the Angular Object Registry
     AngularObjectRegistry registry = context.getAngularObjectRegistry();
