diff --git a/app/src/main/java/com/termux/app/ExtraKeysView.java b/app/src/main/java/com/termux/app/ExtraKeysView.java
index e35d547..cd39146 100644
--- a/app/src/main/java/com/termux/app/ExtraKeysView.java
+++ b/app/src/main/java/com/termux/app/ExtraKeysView.java
@@ -84,7 +84,7 @@
         } else {
             // not a control char
             TerminalSession session = terminalView.getCurrentSession();
-            if (session != null)
+            if (session != null && keyName.length() > 0)
                 session.write(keyName);
         }
     }
