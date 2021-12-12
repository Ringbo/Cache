diff --git a/controller/src/main/java/org/jboss/as/controller/AttributeDefinition.java b/controller/src/main/java/org/jboss/as/controller/AttributeDefinition.java
index f44b08d..6345e8a 100644
--- a/controller/src/main/java/org/jboss/as/controller/AttributeDefinition.java
+++ b/controller/src/main/java/org/jboss/as/controller/AttributeDefinition.java
@@ -124,7 +124,7 @@
     }
 
     public String[] getRequires() {
-        return alternatives;
+        return requires;
     }
 
     public EnumSet<AttributeAccess.Flag> getFlags() {
