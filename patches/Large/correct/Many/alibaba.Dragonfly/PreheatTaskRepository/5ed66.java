diff --git a/src/supernode/src/main/java/com/dragonflyoss/dragonfly/supernode/repository/PreheatTaskRepository.java b/src/supernode/src/main/java/com/dragonflyoss/dragonfly/supernode/repository/PreheatTaskRepository.java
index f5799bf..0d43d6a 100644
--- a/src/supernode/src/main/java/com/dragonflyoss/dragonfly/supernode/repository/PreheatTaskRepository.java
+++ b/src/supernode/src/main/java/com/dragonflyoss/dragonfly/supernode/repository/PreheatTaskRepository.java
@@ -228,7 +228,7 @@
             for (String tsId : timestampIds) {
                 try {
                     long timestamp = Long.parseLong(tsId.substring(0, timestampLength));
-                    if (isExpired(timestamp)) {
+                    if (!isExpired(timestamp)) {
                         String id = tsId.substring(timestampLength + 1);
                         if (StringUtils.isNotBlank(id)) {
                             ids.add(id);
