diff --git a/app/src/main/java/com/lzy/okhttpdemo/okhttpserver/DesActivity.java b/app/src/main/java/com/lzy/okhttpdemo/okhttpserver/DesActivity.java
index 348ac5d..1d9ac2d 100644
--- a/app/src/main/java/com/lzy/okhttpdemo/okhttpserver/DesActivity.java
+++ b/app/src/main/java/com/lzy/okhttpdemo/okhttpserver/DesActivity.java
@@ -87,7 +87,7 @@
         downloadInfo = downloadManager.getDownloadInfo(apk.getUrl());
         if (v.getId() == download.getId()) {
             if (downloadInfo == null) {
-                GetRequest request = OkHttpUtils.get(downloadInfo.getUrl())//
+                GetRequest request = OkHttpUtils.get(apk.getUrl())//
                         .headers("headerKey1", "headerValue1")//
                         .headers("headerKey2", "headerValue2")//
                         .params("paramKey1", "paramValue1")//
