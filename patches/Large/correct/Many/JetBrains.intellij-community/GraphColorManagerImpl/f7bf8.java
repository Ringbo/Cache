diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/graph/GraphColorManagerImpl.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/graph/GraphColorManagerImpl.java
index 723a790..4f0e44c 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/graph/GraphColorManagerImpl.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/graph/GraphColorManagerImpl.java
@@ -67,7 +67,7 @@
     if (refs.isEmpty()) {
       if (!myErrorWasReported.containsKey(head)) {
         myErrorWasReported.put(head, head);
-        LOG.error("No references found at head " + head + " which corresponds to hash " + myHashGetter.fun(head));
+        LOG.warn("No references found at head " + head + " which corresponds to hash " + myHashGetter.fun(head));
       }
       return true;
     }
