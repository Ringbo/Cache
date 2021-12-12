diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/snippets/ObjectCloneNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/snippets/ObjectCloneNode.java
index 5298241..bc1fc36 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/snippets/ObjectCloneNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/snippets/ObjectCloneNode.java
@@ -86,7 +86,7 @@
     }
 
     private static ResolvedJavaType getConcreteType(ObjectStamp stamp, Assumptions assumptions) {
-        if (stamp.isExactType()) {
+        if (stamp.isExactType() || stamp.type() == null) {
             return stamp.type();
         } else {
             ResolvedJavaType type = stamp.type().findUniqueConcreteSubtype();
