diff --git a/components/camel-asterisk/src/main/java/org/apache/camel/component/asterisk/AsteriskEndpoint.java b/components/camel-asterisk/src/main/java/org/apache/camel/component/asterisk/AsteriskEndpoint.java
index b75dc5d..629a24d 100644
--- a/components/camel-asterisk/src/main/java/org/apache/camel/component/asterisk/AsteriskEndpoint.java
+++ b/components/camel-asterisk/src/main/java/org/apache/camel/component/asterisk/AsteriskEndpoint.java
@@ -95,7 +95,7 @@
     }
 
     public boolean isSingleton() {
-        return true;
+        return false;
     }
 
     public void addListener(ManagerEventListener listener) throws CamelAsteriskException {
