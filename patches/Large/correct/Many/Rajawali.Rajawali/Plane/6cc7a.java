diff --git a/src/rajawali/primitives/Plane.java b/src/rajawali/primitives/Plane.java
index 4d49f95..b293e91 100644
--- a/src/rajawali/primitives/Plane.java
+++ b/src/rajawali/primitives/Plane.java
@@ -207,7 +207,7 @@
 				}
 				else if(mUpAxis == Axis.Z)
 				{
-					vertices[vertexCount] = v1;
+					vertices[vertexCount] = -v1;
 					vertices[vertexCount + 1] = v2;
 					vertices[vertexCount + 2] = 0;
 				}
