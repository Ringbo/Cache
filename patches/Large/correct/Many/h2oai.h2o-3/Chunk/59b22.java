diff --git a/h2o-core/src/main/java/water/fvec/Chunk.java b/h2o-core/src/main/java/water/fvec/Chunk.java
index e5de5d4..0ef5a40 100644
--- a/h2o-core/src/main/java/water/fvec/Chunk.java
+++ b/h2o-core/src/main/java/water/fvec/Chunk.java
@@ -108,7 +108,7 @@
 }}</pre>
  */
 
-public abstract class Chunk<D extends Chunk> extends Iced<D> {
+public abstract class Chunk extends Iced<Chunk> {
   public Chunk() {}
   private Chunk(byte [] bytes) {_mem = bytes;initFromBytes();}
 
@@ -615,10 +615,10 @@
   public final byte [] asBytes(){return _mem;}
 
   @Override
-  public final D reloadFromBytes(byte [] ary){
+  public final Chunk reloadFromBytes(byte [] ary){
     _mem = ary;
     initFromBytes();
-    return (D)this;
+    return this;
   }
 
   protected abstract void initFromBytes();
