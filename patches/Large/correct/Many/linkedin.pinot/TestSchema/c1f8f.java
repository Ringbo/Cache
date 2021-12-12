diff --git a/pinot-common/src/test/java/com/linkedin/pinot/common/TestSchema.java b/pinot-common/src/test/java/com/linkedin/pinot/common/TestSchema.java
index 6496c34..532049d 100644
--- a/pinot-common/src/test/java/com/linkedin/pinot/common/TestSchema.java
+++ b/pinot-common/src/test/java/com/linkedin/pinot/common/TestSchema.java
@@ -66,7 +66,7 @@
 
     StarTreeIndexSpec indexSpec = new StarTreeIndexSpec();
     indexSpec.setSplitOrder(Arrays.asList("dim2", "dim1", "dim3"));
-    indexSpec.setMaxLeafRecords(100); // the known default
+    indexSpec.setMaxLeafRecords(10000); // the known default
 
     Assert.assertEquals(schema.getStarTreeIndexSpecs().get(0), indexSpec);
   }
