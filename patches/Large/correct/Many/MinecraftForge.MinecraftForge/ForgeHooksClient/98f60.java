diff --git a/src/main/java/net/minecraftforge/client/ForgeHooksClient.java b/src/main/java/net/minecraftforge/client/ForgeHooksClient.java
index 41c4343..7fc1226 100644
--- a/src/main/java/net/minecraftforge/client/ForgeHooksClient.java
+++ b/src/main/java/net/minecraftforge/client/ForgeHooksClient.java
@@ -608,6 +608,7 @@
     }
 
     private static int slotMainHand = 0;
+    // FIXME
     public static boolean shouldCauseReequipAnimation(ItemStack from, ItemStack to, int slot)
     {
         if(!Objects.equal(from, to) || from == null)
@@ -620,6 +621,6 @@
             changed = slot != slotMainHand;
             slotMainHand = slot;
         }
-        return from.getItem().shouldCauseReequipAnimation(from, to, changed);
+        return !from.getItem().shouldCauseReequipAnimation(from, to, changed);
     }
 }
