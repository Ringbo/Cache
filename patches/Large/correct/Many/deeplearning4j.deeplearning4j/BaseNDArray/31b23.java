diff --git a/nd4j/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java b/nd4j/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
index 75a47f9..d6861bf 100644
--- a/nd4j/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
+++ b/nd4j/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArray.java
@@ -6368,7 +6368,7 @@
         }
         int shape = FlatArray.createShapeVector(builder, this.shapeInfoDataBuffer().asLong());
         int buffer = this.isEmpty() ? 0 : this.dataType() == DataType.UTF8 ? stringBuffer(builder, this.data()) : FlatArray.createBufferVector(builder, this.data().asBytes());
-        val type = this.isEmpty() ? FlatBuffersMapper.getDataTypeAsByte(Nd4j.dataType()) : FlatBuffersMapper.getDataTypeAsByte(this.data().dataType());
+        val type = this.isEmpty() ? FlatBuffersMapper.getDataTypeAsByte(this.dataType()) : FlatBuffersMapper.getDataTypeAsByte(this.data().dataType());
         int array = FlatArray.createFlatArray(builder, shape, buffer, type, ByteOrder.BE);
 
         return array;
