diff --git a/java/org/apache/catalina/session/ManagerBase.java b/java/org/apache/catalina/session/ManagerBase.java
index 0e17ff2..e6d91f0 100644
--- a/java/org/apache/catalina/session/ManagerBase.java
+++ b/java/org/apache/catalina/session/ManagerBase.java
@@ -778,7 +778,7 @@
                     value.getClass().getName()).matches()) {
                 if (getWarnOnSessionAttributeFilterFailure() || log.isDebugEnabled()) {
                     String msg = sm.getString("managerBase.sessionAttributeValueClassNameFilter",
-                            name, value.getClass().getName(), sessionAttributeNamePattern);
+                            name, value.getClass().getName(), sessionAttributeValueClassNamePattern);
                     if (getWarnOnSessionAttributeFilterFailure()) {
                         log.warn(msg);
                     } else {
