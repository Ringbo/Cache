diff --git a/fml/common/cpw/mods/fml/common/network/FMLNetworkHandler.java b/fml/common/cpw/mods/fml/common/network/FMLNetworkHandler.java
index f56c95d..97fb996 100644
--- a/fml/common/cpw/mods/fml/common/network/FMLNetworkHandler.java
+++ b/fml/common/cpw/mods/fml/common/network/FMLNetworkHandler.java
@@ -318,7 +318,7 @@
         }
         Packet250CustomPayload pkt = new Packet250CustomPayload();
         pkt.field_73630_a = "FML";
-        pkt.field_73629_c = FMLPacket.makePacket(Type.ENTITYSPAWN, er, entity);
+        pkt.field_73629_c = FMLPacket.makePacket(Type.ENTITYSPAWN, er, entity, instance().findNetworkModHandler(er.getContainer()));
         pkt.field_73628_b = pkt.field_73629_c.length;
         return pkt;
     }
