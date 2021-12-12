diff --git a/activemq-core/src/main/java/org/apache/activemq/command/ActiveMQDestination.java b/activemq-core/src/main/java/org/apache/activemq/command/ActiveMQDestination.java
index 6f4bd82..e592e71 100755
--- a/activemq-core/src/main/java/org/apache/activemq/command/ActiveMQDestination.java
+++ b/activemq-core/src/main/java/org/apache/activemq/command/ActiveMQDestination.java
@@ -175,7 +175,7 @@
             if( i!=0 )
                 sb.append(COMPOSITE_SEPERATOR);
             if( getDestinationType()==destinations[i].getDestinationType()) {
-                sb.append(destinations[i].getQualifiedName());
+                sb.append(destinations[i].getPhysicalName());
             } else {
                 sb.append(destinations[i].getQualifiedName());
             }
