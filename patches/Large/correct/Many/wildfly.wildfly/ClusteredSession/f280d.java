diff --git a/web/src/main/java/org/jboss/as/web/session/ClusteredSession.java b/web/src/main/java/org/jboss/as/web/session/ClusteredSession.java
index c9c46af..0b3cb66 100644
--- a/web/src/main/java/org/jboss/as/web/session/ClusteredSession.java
+++ b/web/src/main/java/org/jboss/as/web/session/ClusteredSession.java
@@ -805,7 +805,7 @@
         }
 
         if (canAttributeBeReplicated(value) == false) {
-            throw MESSAGES.failToReplicateAttribute();
+            throw MESSAGES.failToReplicateAttribute(name, value.getClass().getCanonicalName());
         }
 
         // Construct an event with the new value
