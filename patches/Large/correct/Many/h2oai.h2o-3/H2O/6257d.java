diff --git a/h2o-core/src/main/java/water/H2O.java b/h2o-core/src/main/java/water/H2O.java
index cbfa3b0..09c2297 100644
--- a/h2o-core/src/main/java/water/H2O.java
+++ b/h2o-core/src/main/java/water/H2O.java
@@ -1027,7 +1027,7 @@
 
 
     @Override
-    public byte [] asBytes(){return new AutoBuffer().put(this).bufClose();}
+    public byte [] asBytes(){return new AutoBuffer().put(this).buf();}
 
     @Override
     public T reloadFromBytes(byte [] ary){ return read(new AutoBuffer(ary));}
