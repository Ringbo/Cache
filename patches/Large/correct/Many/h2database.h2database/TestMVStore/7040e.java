diff --git a/h2/src/test/org/h2/test/store/TestMVStore.java b/h2/src/test/org/h2/test/store/TestMVStore.java
index daa29e8..830a547 100644
--- a/h2/src/test/org/h2/test/store/TestMVStore.java
+++ b/h2/src/test/org/h2/test/store/TestMVStore.java
@@ -431,7 +431,8 @@
         header.put("format", "2");
         MVMap<Integer, String> m = s.openMap("data");
         // this is to ensure the file header is overwritten
-        for (int i = 0; i < 100; i++) {
+        // the header is written at least every 20 commits
+        for (int i = 0; i < 30; i++) {
             m.put(0, "Hello World " + i);
             s.commit();
             if (i > 5) {
@@ -752,7 +753,9 @@
         int format = Integer.parseInt(header.get("format").toString());
         assertEquals(1, format);
         header.put("format", Integer.toString(format + 1));
-        for (int i = 0; i < 10; i++) {
+        // this is to ensure the file header is overwritten
+        // the header is written at least every 20 commits
+        for (int i = 0; i < 30; i++) {
             if (i > 5) {
                 s.setRetentionTime(0);
             }
@@ -889,7 +892,8 @@
         m.put("test", "123");
         MVMap<Integer, Integer> map = s.openMap("test");
         map.put(10, 100);
-        // ensure the file header is overwritten
+        // this is to ensure the file header is overwritten
+        // the header is written at least every 20 commits
         for (int i = 0; i < 30; i++) {
             if (i > 5) {
                 s.setRetentionTime(0);
