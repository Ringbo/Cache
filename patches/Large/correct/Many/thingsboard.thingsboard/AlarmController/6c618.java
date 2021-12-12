diff --git a/application/src/main/java/org/thingsboard/server/controller/AlarmController.java b/application/src/main/java/org/thingsboard/server/controller/AlarmController.java
index 586e8c3..00885e3 100644
--- a/application/src/main/java/org/thingsboard/server/controller/AlarmController.java
+++ b/application/src/main/java/org/thingsboard/server/controller/AlarmController.java
@@ -83,7 +83,7 @@
             Alarm savedAlarm = checkNotNull(alarmService.createOrUpdateAlarm(alarm));
             logEntityAction(savedAlarm.getId(), savedAlarm,
                     getCurrentUser().getCustomerId(),
-                    savedAlarm.getId() == null ? ActionType.ADDED : ActionType.UPDATED, null);
+                    alarm.getId() == null ? ActionType.ADDED : ActionType.UPDATED, null);
             return savedAlarm;
         } catch (Exception e) {
             logEntityAction(emptyId(EntityType.ALARM), alarm,
