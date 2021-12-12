diff --git a/h2o-core/src/main/java/water/fvec/Vec.java b/h2o-core/src/main/java/water/fvec/Vec.java
index bd035d2..4f6b5a6 100644
--- a/h2o-core/src/main/java/water/fvec/Vec.java
+++ b/h2o-core/src/main/java/water/fvec/Vec.java
@@ -148,7 +148,7 @@
   static final byte T_TIMELAST= (byte)(T_TIME+ParseTime.TIME_PARSE.length);
   byte _type;                   // Vec Type
 
-  /** True if this is an Enum column.  All enum columns are also isInt(), but
+  /** True if this is an Enum column.  All enum columns are also {@link #isInt}, but
    *  not vice-versa.
    *  @return true if this is an Enum column.  */
   public final boolean isEnum   (){ return _type==T_ENUM; }
@@ -158,7 +158,7 @@
   public final boolean isString (){ return _type==T_STR; }
   /** @return true if this is a numeric column, excluding enum and time types  */
   public final boolean isNumeric(){ return _type==T_NUM; }
-  /** True if this is a time column.  All time columns are also isInt(), but
+  /** True if this is a time column.  All time columns are also {@link #isInt}, but
    *  not vice-versa.
    *  @return true if this is a time column.  */
   public final boolean isTime   (){ return _type>=T_TIME && _type<T_TIMELAST; }
@@ -188,9 +188,9 @@
   public Vec makeZero(String[] domain) { return makeCon(0, domain); }
   /** Make a new vector with the same size and data layout as the old one, and
    *  initialized to a constant. */
-  public Vec makeCon( final long l ) { return makeCon(l, null); }
+  Vec makeCon( final long l ) { return makeCon(l, null); }
   private Vec makeCon( final long l, String[] domain ) { return makeCon(l,domain,group(),_espc); }
-  static public Vec makeCon( final long l, String[] domain, final long len ) {
+  public static Vec makeCon( final long l, String[] domain, final long len ) {
     int nchunks = (int)Math.max(1,(len>>LOG_CHK)-1);
     long[] espc = new long[nchunks+1];
     for( int i=0; i<nchunks; i++ )
@@ -199,7 +199,7 @@
     return makeCon(l,domain,VectorGroup.VG_LEN1,espc);
   }
 
-  static public Vec makeCon( final long l, String[] domain, VectorGroup group, long[] espc ) {
+  static Vec makeCon( final long l, String[] domain, VectorGroup group, long[] espc ) {
     final int nchunks = espc.length-1;
     final Vec v0 = new Vec(group.addVec(), espc, domain);
 
@@ -360,7 +360,11 @@
   /** Positive and negative infinity counts */
   public long  pinfs() { return rollupStats()._pinfs; }
   public long  ninfs() { return rollupStats()._ninfs; }
-  /** Is all integers? */
+  /** {@link #isInt} is a property of numeric Vecs and not a type; this
+   *  property can be changed by assigning non-integer values into the Vec (or
+   *  restored by overwriting non-integer values with integers).  This is a
+   *  strong type for {@link #isEnum} and {@link #isTime} Vecs.
+   *  @return true if the Vec is all integers */
   public boolean isInt(){return rollupStats()._isInt; }
   /** Size of compressed vector data. */
   long byteSize(){return rollupStats()._size; }
