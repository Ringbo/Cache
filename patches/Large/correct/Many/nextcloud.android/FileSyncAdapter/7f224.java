diff --git a/src/eu/alefzero/owncloud/syncadapter/FileSyncAdapter.java b/src/eu/alefzero/owncloud/syncadapter/FileSyncAdapter.java
index 8bd0a57..85f9cbb 100644
--- a/src/eu/alefzero/owncloud/syncadapter/FileSyncAdapter.java
+++ b/src/eu/alefzero/owncloud/syncadapter/FileSyncAdapter.java
@@ -81,7 +81,7 @@
             resp = query.getResponseBodyAsMultiStatus();
 
             if (resp.getResponses().length > 0) {
-                WebdavEntry we = new WebdavEntry(resp.getResponses()[0]);
+                WebdavEntry we = new WebdavEntry(resp.getResponses()[0], getUri().getPath());
                 OCFile file = fillOCFile(we);
                 file.setParentId(0);
                 getStorageManager().saveFile(file);
@@ -110,7 +110,7 @@
             MultiStatus resp = null;
             resp = query.getResponseBodyAsMultiStatus();
             for (int i = 1; i < resp.getResponses().length; ++i) {
-                WebdavEntry we = new WebdavEntry(resp.getResponses()[i]);
+                WebdavEntry we = new WebdavEntry(resp.getResponses()[i], getUri().getPath());
                 OCFile file = fillOCFile(we);
                 file.setParentId(parentId);
                 getStorageManager().saveFile(file);
