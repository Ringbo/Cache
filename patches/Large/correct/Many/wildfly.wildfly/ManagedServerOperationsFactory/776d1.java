diff --git a/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerOperationsFactory.java b/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerOperationsFactory.java
index 2a4d9c1..23a8e40 100644
--- a/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerOperationsFactory.java
+++ b/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerOperationsFactory.java
@@ -437,7 +437,7 @@
                 final String ref = include.asString();
                 if (processed.add(ref)) {
                     final ModelNode includedGroup = groups.get(ref);
-                    if (group == null) {
+                    if (includedGroup == null) {
                         throw MESSAGES.undefinedSocketBindingGroup(ref);
                     }
                     mergeBindingGroups(updates, groups, groupName, includedGroup, processed);
