diff --git a/presto-main/src/main/java/com/facebook/presto/testing/TestingConnectorSession.java b/presto-main/src/main/java/com/facebook/presto/testing/TestingConnectorSession.java
index 2e6f0c8..f1d07a7 100644
--- a/presto-main/src/main/java/com/facebook/presto/testing/TestingConnectorSession.java
+++ b/presto-main/src/main/java/com/facebook/presto/testing/TestingConnectorSession.java
@@ -117,7 +117,7 @@
                 .add("timeZoneKey", timeZoneKey)
                 .add("locale", locale)
                 .add("startTime", startTime)
-                .add("properties", properties)
+                .add("properties", propertyValues)
                 .toString();
     }
 }
