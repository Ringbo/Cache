diff --git a/src/com/fsck/k9/mail/store/LocalStore.java b/src/com/fsck/k9/mail/store/LocalStore.java
index 91c651e..be03ea9 100644
--- a/src/com/fsck/k9/mail/store/LocalStore.java
+++ b/src/com/fsck/k9/mail/store/LocalStore.java
@@ -209,7 +209,7 @@
                     }
                     catch (SQLiteException e)
                     {
-                        if (! e.toString().startsWith("duplicate column name: flagged_count"))
+                        if (! e.getMessage().startsWith("duplicate column name: flagged_count"))
                         {
                             throw e;
                         }
