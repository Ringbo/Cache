diff --git a/modules/apps/calendar/calendar-service/src/com/liferay/calendar/service/persistence/impl/CalendarResourceFinderImpl.java b/modules/apps/calendar/calendar-service/src/com/liferay/calendar/service/persistence/impl/CalendarResourceFinderImpl.java
index 37e55de..196822a 100644
--- a/modules/apps/calendar/calendar-service/src/com/liferay/calendar/service/persistence/impl/CalendarResourceFinderImpl.java
+++ b/modules/apps/calendar/calendar-service/src/com/liferay/calendar/service/persistence/impl/CalendarResourceFinderImpl.java
@@ -368,7 +368,7 @@
 
 			if (orderByComparator != null) {
 				appendOrderByComparator(
-					sb, "CalendarResource.", orderByComparator);
+					sb, "CalendarResource.", orderByComparator, true);
 			}
 
 			sql = StringUtil.replace(sql, "[$ORDER_BY$]", sb.toString());
