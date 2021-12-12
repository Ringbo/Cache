diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
index 8cb9589..2b101f4 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
@@ -219,7 +219,7 @@
                             if (instanceOfB.type().isAssignableFrom(type.getType())) {
                                 // Do not add to profile.
                             } else {
-                                ProfiledType newType = new ProfiledType(type.getType(), Math.max(1.0, type.getProbability() * (1.0 - probabilityA) / (1.0 - probabilityB)));
+                                ProfiledType newType = new ProfiledType(type.getType(), Math.min(1.0, type.getProbability() * (1.0 - probabilityA) / (1.0 - probabilityB)));
                                 profiledTypes.add(newType);
                                 remainder -= newType.getProbability();
                             }
@@ -227,7 +227,7 @@
 
                         for (ProfiledType type : profileA.getTypes()) {
                             if (instanceOfA.type().isAssignableFrom(type.getType())) {
-                                ProfiledType newType = new ProfiledType(type.getType(), Math.max(1.0, type.getProbability() / (1.0 - probabilityB)));
+                                ProfiledType newType = new ProfiledType(type.getType(), Math.min(1.0, type.getProbability() / (1.0 - probabilityB)));
                                 profiledTypes.add(newType);
                                 remainder -= newType.getProbability();
                             }
