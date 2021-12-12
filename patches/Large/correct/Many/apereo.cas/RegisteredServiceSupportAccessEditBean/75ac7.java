diff --git a/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/beans/RegisteredServiceSupportAccessEditBean.java b/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/beans/RegisteredServiceSupportAccessEditBean.java
index 91ab872..2f610a9 100644
--- a/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/beans/RegisteredServiceSupportAccessEditBean.java
+++ b/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/beans/RegisteredServiceSupportAccessEditBean.java
@@ -77,7 +77,7 @@
     }
 
     public void setRejectedAttr(final Map<String, Set<String>> rejectedAttr) {
-        this.rejectedAttr = requiredAttr;
+        this.rejectedAttr = rejectedAttr;
     }
 
     public Map<String, Set<String>> getRejectedAttr() {
