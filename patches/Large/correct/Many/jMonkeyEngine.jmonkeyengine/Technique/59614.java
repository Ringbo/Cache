diff --git a/jme3-core/src/main/java/com/jme3/material/Technique.java b/jme3-core/src/main/java/com/jme3/material/Technique.java
index 9dee912..aecf5ab 100644
--- a/jme3-core/src/main/java/com/jme3/material/Technique.java
+++ b/jme3-core/src/main/java/com/jme3/material/Technique.java
@@ -186,7 +186,7 @@
     public int getSortId() {
        int hash = 17;
        hash = hash * 23 + def.getSortId();
-       hash = hash * 23 + dynamicDefines.hashCode();
+        hash = hash * 23 + paramDefines.hashCode();
        return hash;
     }
 }
