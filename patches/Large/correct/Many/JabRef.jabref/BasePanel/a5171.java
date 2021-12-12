diff --git a/src/main/java/net/sf/jabref/gui/BasePanel.java b/src/main/java/net/sf/jabref/gui/BasePanel.java
index 6eec30e..81a9099 100644
--- a/src/main/java/net/sf/jabref/gui/BasePanel.java
+++ b/src/main/java/net/sf/jabref/gui/BasePanel.java
@@ -1236,7 +1236,7 @@
             // The call to unblock will simply hide the glasspane, so there is no harm in calling
             // it even if the frame hasn't been blocked.
             frame.unblock();
-            LOGGER.error("runCommand error: " + ex.getMessage());
+            LOGGER.error("runCommand error: " + ex.getMessage(), ex);
         }
     }
 
