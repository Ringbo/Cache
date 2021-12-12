diff --git a/src/rajawali/materials/shaders/AShaderBase.java b/src/rajawali/materials/shaders/AShaderBase.java
index e308f19..6b7caab 100644
--- a/src/rajawali/materials/shaders/AShaderBase.java
+++ b/src/rajawali/materials/shaders/AShaderBase.java
@@ -198,7 +198,7 @@
 	{
 		ShaderVar out = null;
 		
-		if(left == right)
+		if(left != right)
 			out = getInstanceForDataType(left);
 		else if(left == DataType.IVEC4 || right == DataType.IVEC4)
 			out = getInstanceForDataType(DataType.IVEC4);
