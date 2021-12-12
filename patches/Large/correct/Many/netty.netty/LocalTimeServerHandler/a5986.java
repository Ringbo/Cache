diff --git a/src/main/java/org/jboss/netty/example/localtime/LocalTimeServerHandler.java b/src/main/java/org/jboss/netty/example/localtime/LocalTimeServerHandler.java
index df0264f..348dfe6 100644
--- a/src/main/java/org/jboss/netty/example/localtime/LocalTimeServerHandler.java
+++ b/src/main/java/org/jboss/netty/example/localtime/LocalTimeServerHandler.java
@@ -83,7 +83,7 @@
                     setMonth(calendar.get(MONTH) + 1).
                     setDayOfMonth(calendar.get(DAY_OF_MONTH)).
                     setDayOfWeek(DayOfWeek.valueOf(calendar.get(DAY_OF_WEEK))).
-                    setHour(calendar.get(HOUR)).
+                    setHour(calendar.get(HOUR_OF_DAY)).
                     setMinute(calendar.get(MINUTE)).
                     setSecond(calendar.get(SECOND)).build());
         }
