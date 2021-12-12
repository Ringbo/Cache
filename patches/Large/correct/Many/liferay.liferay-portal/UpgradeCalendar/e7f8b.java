diff --git a/modules/apps/calendar/calendar-service/src/main/java/com/liferay/calendar/upgrade/v1_0_1/UpgradeCalendar.java b/modules/apps/calendar/calendar-service/src/main/java/com/liferay/calendar/upgrade/v1_0_1/UpgradeCalendar.java
index e1a62180..5970deb 100644
--- a/modules/apps/calendar/calendar-service/src/main/java/com/liferay/calendar/upgrade/v1_0_1/UpgradeCalendar.java
+++ b/modules/apps/calendar/calendar-service/src/main/java/com/liferay/calendar/upgrade/v1_0_1/UpgradeCalendar.java
@@ -32,7 +32,7 @@
 
 	@Override
 	protected void doUpgrade() throws Exception {
-		if (!tableHasColumn("Calendar", "timeZoneId")) {
+		if (!hasColumn("Calendar", "timeZoneId")) {
 			runSQL("alter table Calendar add timeZoneId VARCHAR(75) null");
 		}
 
