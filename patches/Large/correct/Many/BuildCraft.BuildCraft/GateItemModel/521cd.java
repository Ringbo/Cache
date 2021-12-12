diff --git a/common/buildcraft/transport/render/GateItemModel.java b/common/buildcraft/transport/render/GateItemModel.java
index 0211168..1332ef0 100644
--- a/common/buildcraft/transport/render/GateItemModel.java
+++ b/common/buildcraft/transport/render/GateItemModel.java
@@ -55,7 +55,7 @@
 
         if (!map.containsKey(state)) {
             List<BakedQuad> quads = Lists.newArrayList();
-            List<MutableQuad> mutableQuads = GatePluggableModel.INSTANCE.renderGate(state, DefaultVertexFormats.BLOCK);
+            List<MutableQuad> mutableQuads = GatePluggableModel.INSTANCE.renderGate(state, DefaultVertexFormats.ITEM);
             Matrix4f rotation = MatrixUtils.rotateTowardsFace(EnumFacing.SOUTH);
 
             Matrix4f matScale = new Matrix4f();
@@ -77,9 +77,9 @@
             for (MutableQuad quad : mutableQuads) {
                 quad.transform(totalMatrix);
                 quad.colouri(0xFF_FF_FF_FF);
-                quads.add(quad.toUnpacked());
+                quads.add(quad.toUnpacked(DefaultVertexFormats.ITEM));
             }
-            map.put(state, new GateItemModel(ImmutableList.copyOf(quads), null, DefaultVertexFormats.BLOCK));
+            map.put(state, new GateItemModel(ImmutableList.copyOf(quads), null, DefaultVertexFormats.ITEM));
         }
         return map.get(state);
     }
