diff --git a/pinot-core/src/test/java/com/linkedin/pinot/query/plan/PlanMakerTest.java b/pinot-core/src/test/java/com/linkedin/pinot/query/plan/PlanMakerTest.java
index 56eb8bf..396b089 100644
--- a/pinot-core/src/test/java/com/linkedin/pinot/query/plan/PlanMakerTest.java
+++ b/pinot-core/src/test/java/com/linkedin/pinot/query/plan/PlanMakerTest.java
@@ -166,7 +166,7 @@
     System.out.println(resultBlock.getAggregationResult().get(4));
     System.out.println(resultBlock.getAggregationResult().get(5));
     System.out.println(resultBlock.getAggregationResult().get(6));
-    Assert.assertEquals(resultBlock.getAggregationResult().get(0), 2000001L);
+    Assert.assertEquals(((Number)resultBlock.getAggregationResult().get(0)).longValue(), 2000001L);
     Assert.assertEquals(resultBlock.getAggregationResult().get(1), 2000001000000.0);
     Assert.assertEquals(resultBlock.getAggregationResult().get(2), 2000000.0);
     Assert.assertEquals(resultBlock.getAggregationResult().get(3), 0.0);
@@ -253,11 +253,11 @@
       if (keyString.equals("0")) {
         Serializable resultList = singleGroupByResult.get(keyString);
         System.out.println("grouped key : " + keyString + ", value : " + resultList);
-        assertEquals(200001, ((Long) resultList).longValue());
+        assertEquals(200001, ((Number) resultList).longValue());
       } else {
         Serializable resultList = singleGroupByResult.get(keyString);
         System.out.println("grouped key : " + keyString + ", value : " + resultList);
-        assertEquals(200000, ((Long) resultList).longValue());
+        assertEquals(200000, ((Number) resultList).longValue());
       }
     }
 
@@ -436,11 +436,11 @@
       if (keyString.equals("0")) {
         Serializable resultList = singleGroupByResult.get(keyString);
         System.out.println("grouped key : " + keyString + ", value : " + resultList);
-        assertEquals(400020, ((Long) resultList).longValue());
+        assertEquals(400020, ((Number) resultList).longValue());
       } else {
         Serializable resultList = singleGroupByResult.get(keyString);
         System.out.println("grouped key : " + keyString + ", value : " + resultList);
-        assertEquals(400000, ((Long) resultList).longValue());
+        assertEquals(400000, ((Number) resultList).longValue());
       }
     }
 
