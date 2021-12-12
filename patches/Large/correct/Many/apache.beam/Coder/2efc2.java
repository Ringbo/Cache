diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/Coder.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/Coder.java
index f1e3fe7..93e65d3 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/Coder.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/Coder.java
@@ -63,7 +63,7 @@
  */
 public interface Coder<T> extends Serializable {
   /** The context in which encoding or decoding is being done. */
-  public static class Context {
+  class Context {
     /**
      * The outer context: the value being encoded or decoded takes
      * up the remainder of the record/stream contents.
@@ -122,7 +122,7 @@
    * for some reason
    * @throws CoderException if the value could not be encoded for some reason
    */
-  public void encode(T value, OutputStream outStream, Context context)
+  void encode(T value, OutputStream outStream, Context context)
       throws CoderException, IOException;
 
   /**
@@ -133,7 +133,7 @@
    * for some reason
    * @throws CoderException if the value could not be decoded for some reason
    */
-  public T decode(InputStream inStream, Context context)
+  T decode(InputStream inStream, Context context)
       throws CoderException, IOException;
 
   /**
@@ -142,12 +142,12 @@
    * returns {@code null} if this cannot be done or this is not a
    * parameterized type.
    */
-  public List<? extends Coder<?>> getCoderArguments();
+  List<? extends Coder<?>> getCoderArguments();
 
   /**
    * Returns the {@link CloudObject} that represents this {@code Coder}.
    */
-  public CloudObject asCloudObject();
+  CloudObject asCloudObject();
 
   /**
    * Throw {@link NonDeterministicException} if the coding is not deterministic.
@@ -165,7 +165,7 @@
    *
    * @throws Coder.NonDeterministicException if this coder is not deterministic.
    */
-  public void verifyDeterministic() throws Coder.NonDeterministicException;
+  void verifyDeterministic() throws Coder.NonDeterministicException;
 
   /**
    * Returns {@code true} if this {@link Coder} is injective with respect to {@link Objects#equals}.
@@ -177,7 +177,7 @@
    * whenever {@code equals()} compares object identity, rather than performing a
    * semantic/structural comparison.
    */
-  public boolean consistentWithEquals();
+  boolean consistentWithEquals();
 
   /**
    * Returns an object with an {@code Object.equals()} method that represents structural equality
@@ -197,7 +197,7 @@
    *
    * <p>See also {@link #consistentWithEquals()}.
    */
-  public Object structuralValue(T value) throws Exception;
+  Object structuralValue(T value) throws Exception;
 
   /**
    * Returns whether {@link #registerByteSizeObserver} cheap enough to
@@ -209,7 +209,7 @@
    * {@link org.apache.beam.sdk.runners.PipelineRunner}
    * implementations.
    */
-  public boolean isRegisterByteSizeObserverCheap(T value, Context context);
+  boolean isRegisterByteSizeObserverCheap(T value, Context context);
 
   /**
    * Notifies the {@code ElementByteSizeObserver} about the byte size
@@ -219,7 +219,7 @@
    * {@link org.apache.beam.sdk.runners.PipelineRunner}
    * implementations.
    */
-  public void registerByteSizeObserver(
+  void registerByteSizeObserver(
       T value, ElementByteSizeObserver observer, Context context)
       throws Exception;
 
@@ -239,7 +239,7 @@
    * read data from the prior format.
    */
   @Experimental(Kind.CODER_ENCODING_ID)
-  public String getEncodingId();
+  String getEncodingId();
 
   /**
    * A collection of encodings supported by {@link #decode} in addition to the encoding
@@ -251,13 +251,13 @@
    * @see #getEncodingId()
    */
   @Experimental(Kind.CODER_ENCODING_ID)
-  public Collection<String> getAllowedEncodings();
+  Collection<String> getAllowedEncodings();
 
   /**
    * Exception thrown by {@link Coder#verifyDeterministic()} if the encoding is
    * not deterministic, including details of why the encoding is not deterministic.
    */
-  public static class NonDeterministicException extends Exception {
+  class NonDeterministicException extends Exception {
     private Coder<?> coder;
     private List<String> reasons;
 
