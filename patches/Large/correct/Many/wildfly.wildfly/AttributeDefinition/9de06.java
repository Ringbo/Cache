diff --git a/controller/src/main/java/org/jboss/as/controller/AttributeDefinition.java b/controller/src/main/java/org/jboss/as/controller/AttributeDefinition.java
index 079af05..ea91d2b 100644
--- a/controller/src/main/java/org/jboss/as/controller/AttributeDefinition.java
+++ b/controller/src/main/java/org/jboss/as/controller/AttributeDefinition.java
@@ -102,7 +102,7 @@
         }
         if (flags == null || flags.length == 0) {
             this.flags = EnumSet.noneOf(AttributeAccess.Flag.class);
-        } else if (flags.length == 0) {
+        } else if (flags.length == 1) {
             this.flags = EnumSet.of(flags[0]);
         } else {
             this.flags = EnumSet.of(flags[0], flags);
