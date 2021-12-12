diff --git a/domain/src/com/thoughtworks/go/domain/materials/perforce/P4MaterialUpdater.java b/domain/src/com/thoughtworks/go/domain/materials/perforce/P4MaterialUpdater.java
index 578d4ec..56637ff 100644
--- a/domain/src/com/thoughtworks/go/domain/materials/perforce/P4MaterialUpdater.java
+++ b/domain/src/com/thoughtworks/go/domain/materials/perforce/P4MaterialUpdater.java
@@ -70,7 +70,7 @@
         if (!StringUtil.isBlank(material.getUserName())) {
             env.put("P4USER", material.getUserName());
         }
-        if (material.getUseTickets() && !StringUtil.isBlank(material.getPassword())) {
+        if (!material.getUseTickets() && !StringUtil.isBlank(material.getPassword())) {
             env.put("P4PASSWD", material.getPassword());
         }
         return env;
