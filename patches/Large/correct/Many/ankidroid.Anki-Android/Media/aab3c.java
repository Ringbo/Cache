diff --git a/src/com/ichi2/libanki/Media.java b/src/com/ichi2/libanki/Media.java
index b725aa4..e1b49fa 100644
--- a/src/com/ichi2/libanki/Media.java
+++ b/src/com/ichi2/libanki/Media.java
@@ -642,7 +642,7 @@
         if (mediaRem.size() > 0) {
             mMediaDb.executeMany("delete from media where fname = ?", mediaRem);
         }
-        mMediaDb.execute("update meta set dirMod = ?", new Object[] { getDir() });
+        mMediaDb.execute("update meta set dirMod = ?", new Object[] { _mtime(getDir()) });
         // and logs
         mMediaDb.executeMany("insert or replace into log values (?, ?)", log);
     }
