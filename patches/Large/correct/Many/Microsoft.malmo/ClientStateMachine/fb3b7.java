diff --git a/Minecraft/src/main/java/com/microsoft/Malmo/Client/ClientStateMachine.java b/Minecraft/src/main/java/com/microsoft/Malmo/Client/ClientStateMachine.java
index dee1f02..837fcd7 100755
--- a/Minecraft/src/main/java/com/microsoft/Malmo/Client/ClientStateMachine.java
+++ b/Minecraft/src/main/java/com/microsoft/Malmo/Client/ClientStateMachine.java
@@ -1906,7 +1906,7 @@
                         ((EntityLivingBase)entity).renderYawOffset = entity.rotationYaw;
                         ((EntityLivingBase)entity).prevRenderYawOffset = entity.rotationYaw;
                     }
-                    if (entity instanceof EntityPlayer)
+                    if (entity instanceof EntityPlayerSP)
                     {
                         // Although the following call takes place on the server, and should have taken effect already,
                         // there is some discontinuity which is causing the effects to get lost, so we call it here too:
