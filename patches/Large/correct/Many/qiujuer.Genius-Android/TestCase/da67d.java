diff --git a/sample/src/main/java/net/qiujuer/sample/TestCase.java b/sample/src/main/java/net/qiujuer/sample/TestCase.java
index 8343955..3f36c8b 100644
--- a/sample/src/main/java/net/qiujuer/sample/TestCase.java
+++ b/sample/src/main/java/net/qiujuer/sample/TestCase.java
@@ -41,8 +41,8 @@
 
         thread = new Thread() {
             public void run() {
-                //60s后执行
-                ToolUtils.sleepIgnoreInterrupt(60000);
+                //30s后执行
+                ToolUtils.sleepIgnoreInterrupt(30000);
 
                 //执行命令，后台服务自动控制
                 //调用方式与ProcessBuilder传参方式一样
@@ -51,7 +51,7 @@
                         "www.baidu.com");
                 //同步方式执行
                 String res = Command.command(command);
-                Log.i(TAG, "Ping 测试结果：" + res);
+                Log.i(TAG, "延迟30s：Ping 测试结果：" + res);
             }
         };
         thread.start();
