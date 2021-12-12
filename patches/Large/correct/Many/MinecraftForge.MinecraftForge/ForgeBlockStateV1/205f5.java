diff --git a/src/main/java/net/minecraftforge/client/model/ForgeBlockStateV1.java b/src/main/java/net/minecraftforge/client/model/ForgeBlockStateV1.java
index 7acae47..8e8149b 100644
--- a/src/main/java/net/minecraftforge/client/model/ForgeBlockStateV1.java
+++ b/src/main/java/net/minecraftforge/client/model/ForgeBlockStateV1.java
@@ -510,7 +510,7 @@
                             builder.put(TransformType.THIRD_PERSON_RIGHT_HAND, thirdperson);
                             builder.put(TransformType.THIRD_PERSON_LEFT_HAND,  leftify(thirdperson));
                             builder.put(TransformType.FIRST_PERSON_RIGHT_HAND, get(0, 0, 0, 0, 45, 0, 0.4f));
-                            builder.put(TransformType.FIRST_PERSON_LEFT_HAND,  get(0, 0, 0, 0, 255, 0, 0.4f));
+                            builder.put(TransformType.FIRST_PERSON_LEFT_HAND,  get(0, 0, 0, 0, 225, 0, 0.4f));
                             ret.state = Optional.<IModelState>of(new SimpleModelState(builder.build()));
                         }
                         // item/generated
