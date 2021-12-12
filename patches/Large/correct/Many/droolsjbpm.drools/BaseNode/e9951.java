diff --git a/drools-core/src/main/java/org/drools/reteoo/BaseNode.java b/drools-core/src/main/java/org/drools/reteoo/BaseNode.java
index 0dd4d5c..dc81b66 100644
--- a/drools-core/src/main/java/org/drools/reteoo/BaseNode.java
+++ b/drools-core/src/main/java/org/drools/reteoo/BaseNode.java
@@ -150,6 +150,6 @@
     }
 
     public String toString() {
-        return "[" + this.getClass().getSimpleName() + "(" + this.id + ")]";
+        return "[" + this.getClass().getName() + "(" + this.id + ")]";
     }
 }
