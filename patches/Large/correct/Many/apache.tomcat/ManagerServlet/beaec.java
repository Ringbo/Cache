diff --git a/java/org/apache/catalina/manager/ManagerServlet.java b/java/org/apache/catalina/manager/ManagerServlet.java
index 683d7ba..66bb647 100644
--- a/java/org/apache/catalina/manager/ManagerServlet.java
+++ b/java/org/apache/catalina/manager/ManagerServlet.java
@@ -1146,7 +1146,7 @@
                 int time = (int)((now-sessions[i].getThisAccessedTimeInternal())/1000);
                 if (idle >= 0 && time >= idle*60) {
                     sessions[i].expire();
-                    idle++;
+                    expired++;
                 }
                 time=time/60/histoInterval;
                 if (time < 0)
@@ -1170,11 +1170,11 @@
                                             ">=" + maxCount*histoInterval,
                                             "" + timeout[maxCount-1]));
             if (notimeout > 0)
-                writer.println(sm.getString("managerServlet.sessiontimeout",
-                                            "unlimited","" + notimeout));
+                writer.println(sm.getString("managerServlet.sessiontimeout.unlimited",
+                                            "" + notimeout));
             if (idle >= 0)
-                writer.println(sm.getString("managerServlet.sessiontimeout",
-                                            "" + idle,"expired " + expired));
+                writer.println(sm.getString("managerServlet.sessiontimeout.expired",
+                                            "" + idle,"" + expired));
         } catch (Throwable t) {
             log("ManagerServlet.sessions[" + displayPath + "]", t);
             writer.println(sm.getString("managerServlet.exception",
