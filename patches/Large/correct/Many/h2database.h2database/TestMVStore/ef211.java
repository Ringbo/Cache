diff --git a/h2/src/test/org/h2/test/store/TestMVStore.java b/h2/src/test/org/h2/test/store/TestMVStore.java
index cf96dfd..ff9ce8c 100644
--- a/h2/src/test/org/h2/test/store/TestMVStore.java
+++ b/h2/src/test/org/h2/test/store/TestMVStore.java
@@ -292,7 +292,7 @@
 
                 }).
                 open();
-        s.setAutoCommitDelay(2);
+        s.setAutoCommitDelay(10);
         MVMap<Integer, String> m;
         m = s.openMap("data");
         s.getFileStore().getFile().close();
