diff --git a/src/com/ichi2/libanki/sync/Syncer.java b/src/com/ichi2/libanki/sync/Syncer.java
index 06848b4..9eaa6ca 100644
--- a/src/com/ichi2/libanki/sync/Syncer.java
+++ b/src/com/ichi2/libanki/sync/Syncer.java
@@ -384,8 +384,7 @@
             return Arrays.asList(TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER,
                     TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_STRING);
         } else {
-            return Arrays.asList(TYPE_INTEGER, TYPE_STRING, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_STRING, TYPE_STRING, TYPE_INTEGER,
-                    TYPE_INTEGER, TYPE_INTEGER, TYPE_STRING);
+            return Arrays.asList(TYPE_INTEGER, TYPE_STRING, TYPE_INTEGER, TYPE_INTEGER, TYPE_INTEGER, TYPE_STRING, TYPE_STRING, TYPE_STRING, TYPE_STRING, TYPE_INTEGER, TYPE_STRING);
         }
     }
 
