diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/values/POutput.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/values/POutput.java
index 6be9215..27a280f 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/values/POutput.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/values/POutput.java
@@ -30,7 +30,7 @@
   /**
    * Returns the owning {@link Pipeline} of this {@link POutput}.
    */
-  public Pipeline getPipeline();
+  Pipeline getPipeline();
 
   /**
    * Expands this {@link POutput} into a list of its component output
@@ -45,7 +45,7 @@
    *
    * <p>Not intended to be invoked directly by user code.
    */
-  public Collection<? extends PValue> expand();
+  Collection<? extends PValue> expand();
 
   /**
    * Records that this {@code POutput} is an output of the given
@@ -58,7 +58,7 @@
    * is automatically invoked as part of applying the
    * producing {@link PTransform}.
    */
-  public void recordAsOutput(AppliedPTransform<?, ?, ?> transform);
+  void recordAsOutput(AppliedPTransform<?, ?, ?> transform);
 
   /**
    * As part of applying the producing {@link PTransform}, finalizes this
@@ -72,5 +72,5 @@
    * used as a {@link PInput}, when {@link Pipeline#run}
    * is called, so users do not normally call this explicitly.
    */
-  public void finishSpecifyingOutput();
+  void finishSpecifyingOutput();
 }
