diff --git a/libs/rs/java/Fountain/src/com/android/fountain/FountainRS.java b/libs/rs/java/Fountain/src/com/android/fountain/FountainRS.java
index 04b7f1b..a5d06e9 100644
--- a/libs/rs/java/Fountain/src/com/android/fountain/FountainRS.java
+++ b/libs/rs/java/Fountain/src/com/android/fountain/FountainRS.java
@@ -38,8 +38,8 @@
         pfb.setVaryingColor(true);
         rs.bindProgramFragment(pfb.create());
 
-        ScriptField_Point points = new ScriptField_Point(mRS, PART_COUNT,
-                                                         Allocation.USAGE_GRAPHICS_VERTEX);
+        ScriptField_Point points = new ScriptField_Point(mRS, PART_COUNT);//
+ //                                                        Allocation.USAGE_GRAPHICS_VERTEX);
 
         Mesh.AllocationBuilder smb = new Mesh.AllocationBuilder(mRS);
         smb.addVertexAllocation(points.getAllocation());
