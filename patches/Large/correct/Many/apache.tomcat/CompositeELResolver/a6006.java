diff --git a/java/javax/el/CompositeELResolver.java b/java/javax/el/CompositeELResolver.java
index e93b05e..34080be 100644
--- a/java/javax/el/CompositeELResolver.java
+++ b/java/javax/el/CompositeELResolver.java
@@ -29,7 +29,7 @@
 
     public CompositeELResolver() {
         this.size = 0;
-        this.resolvers = new ELResolver[2];
+        this.resolvers = new ELResolver[8];
     }
 
     public void add(ELResolver elResolver) {
