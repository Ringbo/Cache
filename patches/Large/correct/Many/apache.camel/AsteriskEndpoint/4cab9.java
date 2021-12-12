diff --git a/components/camel-asterisk/src/main/java/org/apache/camel/component/asterisk/AsteriskEndpoint.java b/components/camel-asterisk/src/main/java/org/apache/camel/component/asterisk/AsteriskEndpoint.java
index 0ca8304..b75dc5d 100644
--- a/components/camel-asterisk/src/main/java/org/apache/camel/component/asterisk/AsteriskEndpoint.java
+++ b/components/camel-asterisk/src/main/java/org/apache/camel/component/asterisk/AsteriskEndpoint.java
@@ -85,7 +85,7 @@
         }
         
         // validate action value
-        ActionsEnum.valueOf(action);
+        AsteriskActionEnum.valueOf(action);
 
         return new AsteriskProducer(this);
     }
