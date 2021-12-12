diff --git a/fml/common/cpw/mods/fml/common/modloader/ModLoaderConnectionHandler.java b/fml/common/cpw/mods/fml/common/modloader/ModLoaderConnectionHandler.java
index 22df769..f3eadd9 100644
--- a/fml/common/cpw/mods/fml/common/modloader/ModLoaderConnectionHandler.java
+++ b/fml/common/cpw/mods/fml/common/modloader/ModLoaderConnectionHandler.java
@@ -39,7 +39,7 @@
     @Override
     public void connectionClosed(INetworkManager manager)
     {
-        if (!ModLoaderHelper.sidedHelper.clientConnectionClosed(manager, mod))
+        if (ModLoaderHelper.sidedHelper==null || !ModLoaderHelper.sidedHelper.clientConnectionClosed(manager, mod))
         {
             mod.serverDisconnect();
             mod.onClientLogout(manager);
