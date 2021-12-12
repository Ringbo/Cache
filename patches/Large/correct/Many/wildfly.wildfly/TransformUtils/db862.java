diff --git a/legacy/jacorb/src/main/java/org/jboss/as/jacorb/TransformUtils.java b/legacy/jacorb/src/main/java/org/jboss/as/jacorb/TransformUtils.java
index 4188715..a1eedd9 100644
--- a/legacy/jacorb/src/main/java/org/jboss/as/jacorb/TransformUtils.java
+++ b/legacy/jacorb/src/main/java/org/jboss/as/jacorb/TransformUtils.java
@@ -46,7 +46,7 @@
         for (Property property : legacyModel.asPropertyList()) {
             String name = property.getName();
             final ModelNode legacyValue = property.getValue();
-            if (legacyModel.isDefined()) {
+            if (legacyValue.isDefined()) {
                 final ModelNode value;
                 switch (name) {
                     case JacORBSubsystemConstants.ORB_GIOP_MINOR_VERSION:
