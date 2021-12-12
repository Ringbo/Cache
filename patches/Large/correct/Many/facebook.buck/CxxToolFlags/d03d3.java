diff --git a/src/com/facebook/buck/cxx/CxxToolFlags.java b/src/com/facebook/buck/cxx/CxxToolFlags.java
index cb575b7..7dbdccc 100644
--- a/src/com/facebook/buck/cxx/CxxToolFlags.java
+++ b/src/com/facebook/buck/cxx/CxxToolFlags.java
@@ -38,10 +38,10 @@
   private static final CxxToolFlags EMPTY_FLAGS = CxxToolFlags.explicitBuilder().build();
 
   /** Flags that precede flags from {@code #getRuleFlags()}. */
-  public abstract Iterable<Arg> getPlatformFlags();
+  public abstract ImmutableList<Arg> getPlatformFlags();
 
   /** Flags that succeed flags from {@code #getPlatformFlags()}. */
-  public abstract Iterable<Arg> getRuleFlags();
+  public abstract ImmutableList<Arg> getRuleFlags();
 
   /** Returns all flags in the appropriate order. */
   public final Iterable<Arg> getAllFlags() {
@@ -114,8 +114,8 @@
 @BuckStyleTuple
 abstract class AbstractIterableCxxToolFlags extends CxxToolFlags {
   @Override
-  public abstract Iterable<Arg> getPlatformFlags();
+  public abstract ImmutableList<Arg> getPlatformFlags();
 
   @Override
-  public abstract Iterable<Arg> getRuleFlags();
+  public abstract ImmutableList<Arg> getRuleFlags();
 }
