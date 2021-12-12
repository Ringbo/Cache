diff --git a/Android/LuaViewSDK/src/com/taobao/luaview/scriptbundle/asynctask/ScriptBundleDownloadTask.java b/Android/LuaViewSDK/src/com/taobao/luaview/scriptbundle/asynctask/ScriptBundleDownloadTask.java
index 39836c4..2a3f28e 100644
--- a/Android/LuaViewSDK/src/com/taobao/luaview/scriptbundle/asynctask/ScriptBundleDownloadTask.java
+++ b/Android/LuaViewSDK/src/com/taobao/luaview/scriptbundle/asynctask/ScriptBundleDownloadTask.java
@@ -59,7 +59,7 @@
             String destFilePath = LuaScriptManager.buildScriptBundleFilePath(url);
 
             //check sha256
-            final String sha256 = params.length > 1 ? params[2] : null;
+            final String sha256 = params.length > 1 ? params[1] : null;
             final byte[] fileData = IOUtil.toBytes(input);
             if (sha256 != null && !sha256.equalsIgnoreCase(HexUtil.bytesToHex(EncryptUtil.sha256(fileData)))) {//验证脚本的完整性
                 return null;
