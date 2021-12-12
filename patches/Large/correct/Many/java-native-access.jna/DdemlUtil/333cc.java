diff --git a/contrib/platform/src/com/sun/jna/platform/win32/DdemlUtil.java b/contrib/platform/src/com/sun/jna/platform/win32/DdemlUtil.java
index c5f5cf6..21f5cd3 100644
--- a/contrib/platform/src/com/sun/jna/platform/win32/DdemlUtil.java
+++ b/contrib/platform/src/com/sun/jna/platform/win32/DdemlUtil.java
@@ -731,7 +731,7 @@
         }
 
         public void freeDataHandle(Ddeml.HDDEDATA hData) {
-            boolean result = Ddeml.INSTANCE.DdeUnaccessData(hData);
+            boolean result = Ddeml.INSTANCE.DdeFreeDataHandle(hData);
             if(! result) {
                 throw DdemlException.create(getLastError());
             }
