diff --git a/src/tsd/client/DateTimeBox.java b/src/tsd/client/DateTimeBox.java
index e4cce59..0959fc5 100644
--- a/src/tsd/client/DateTimeBox.java
+++ b/src/tsd/client/DateTimeBox.java
@@ -75,7 +75,7 @@
             case 'y': interval *= 3600 * 24 * 365; break;  // years
           }
           final Date d = new Date();
-          d.setTime(d.getTime() - interval * 1000);
+          d.setTime(d.getTime() - interval * 1000L);
           return d;
         } else if (text.length() == 5) {  // "HH:MM"
           try {
@@ -156,7 +156,7 @@
             }
             d = new Date();
           }
-          d.setTime(d.getTime() + seconds * 1000);
+          d.setTime(d.getTime() + seconds * 1000L);
           d.setSeconds(0);
           setDate(d);
         }
