diff --git a/portal-service/src/com/liferay/portlet/social/util/SocialCounterPeriodUtil.java b/portal-service/src/com/liferay/portlet/social/util/SocialCounterPeriodUtil.java
index 198d552..4060cd4 100644
--- a/portal-service/src/com/liferay/portlet/social/util/SocialCounterPeriodUtil.java
+++ b/portal-service/src/com/liferay/portlet/social/util/SocialCounterPeriodUtil.java
@@ -209,7 +209,7 @@
 			return getActivityDay(calendar.getTime().getTime());
 		}
 
-		return getStartPeriod() - offset * getPeriodLength();
+		return getStartPeriod() + offset * getPeriodLength();
 	}
 
 	public static int getStartPeriod(long time) {
