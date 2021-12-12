diff --git a/java/org/apache/catalina/session/StandardSession.java b/java/org/apache/catalina/session/StandardSession.java
index eaa3924..a8025cc 100644
--- a/java/org/apache/catalina/session/StandardSession.java
+++ b/java/org/apache/catalina/session/StandardSession.java
@@ -808,7 +808,9 @@
         synchronized (this) {
             // Check again, now we are inside the sync so this code only runs once
             // Double check locking - isValid needs to be volatile
-            if (!isValid)
+            // The check of expiring is to ensure that an infinite loop is not
+            // entered as per bug 56339
+            if (expiring || !isValid)
                 return;
 
             if (manager == null)
