diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PInput.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PInput.java
index 1b3791d..f938aeb 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PInput.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/values/PInput.java
@@ -28,7 +28,7 @@
   /**
    * Returns the owning {@link Pipeline} of this {@link PInput}.
    */
-  public Pipeline getPipeline();
+  Pipeline getPipeline();
 
   /**
    * Expands this {@link PInput} into a list of its component output
@@ -43,7 +43,7 @@
    *
    * <p>Not intended to be invoked directly by user code.
    */
-  public Collection<? extends PValue> expand();
+  Collection<? extends PValue> expand();
 
   /**
    * After building, finalizes this {@code PInput} to make it ready for
@@ -52,5 +52,5 @@
    * <p>Automatically invoked whenever {@code apply()} is invoked on
    * this {@code PInput}, so users do not normally call this explicitly.
    */
-  public void finishSpecifying();
+  void finishSpecifying();
 }
