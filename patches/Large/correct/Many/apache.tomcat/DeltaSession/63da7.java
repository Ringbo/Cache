diff --git a/java/org/apache/catalina/ha/session/DeltaSession.java b/java/org/apache/catalina/ha/session/DeltaSession.java
index 7b6bda8..a5dbbba 100644
--- a/java/org/apache/catalina/ha/session/DeltaSession.java
+++ b/java/org/apache/catalina/ha/session/DeltaSession.java
@@ -221,7 +221,7 @@
     @Override
     public boolean isAccessReplicate() {
         long replDelta = System.currentTimeMillis() - getLastTimeReplicated();
-        if (maxInactiveInterval >=0 && replDelta > (maxInactiveInterval * 1000)) {
+        if (maxInactiveInterval >=0 && replDelta > (maxInactiveInterval * 1000L)) {
             return true;
         }
         return false;
