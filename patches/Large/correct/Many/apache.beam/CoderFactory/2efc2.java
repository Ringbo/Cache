diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/CoderFactory.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/CoderFactory.java
index b49cdbd..22d03fa 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/CoderFactory.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/CoderFactory.java
@@ -32,7 +32,7 @@
    * values of a particular type, given the Coders for each of
    * the type's generic parameter types.
    */
-  public Coder<?> create(List<? extends Coder<?>> componentCoders);
+  Coder<?> create(List<? extends Coder<?>> componentCoders);
 
   /**
    * Returns a list of objects contained in {@code value}, one per
@@ -40,5 +40,5 @@
    * The list of returned objects should be the same size as the
    * list of coders required by {@link #create}.
    */
-  public List<Object> getInstanceComponents(Object value);
+  List<Object> getInstanceComponents(Object value);
 }
