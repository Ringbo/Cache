diff --git a/azkaban-common/src/main/java/azkaban/executor/mail/DefaultMailCreator.java b/azkaban-common/src/main/java/azkaban/executor/mail/DefaultMailCreator.java
index a6483a9..9ddc488 100644
--- a/azkaban-common/src/main/java/azkaban/executor/mail/DefaultMailCreator.java
+++ b/azkaban-common/src/main/java/azkaban/executor/mail/DefaultMailCreator.java
@@ -205,7 +205,7 @@
             + convertMSToString(executableFlow.getStartTime()) + "</td></tr>");
         message.println("<tr><td>End Time</td><td>"
             + convertMSToString(executableFlow.getEndTime()) + "</td></tr>");
-        message.println("<tr><td>Status</td><td>" + flow.getStatus() + "</td></tr>");
+        message.println("<tr><td>Status</td><td>" + executableFlow.getStatus() + "</td></tr>");
         message.println("</table>");
       }
 
