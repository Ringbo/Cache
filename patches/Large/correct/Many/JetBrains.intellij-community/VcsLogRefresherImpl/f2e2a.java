diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java
index 5c20c1e..93875a6 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/VcsLogRefresherImpl.java
@@ -363,7 +363,7 @@
         return commits;
       }
       catch (IllegalStateException e) {
-        LOG.error(e);
+        LOG.info(e);
         return null;
       }
     }
