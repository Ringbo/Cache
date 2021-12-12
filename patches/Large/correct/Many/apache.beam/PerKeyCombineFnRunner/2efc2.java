diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/PerKeyCombineFnRunner.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/PerKeyCombineFnRunner.java
index e8fa4f7..c1a93b7 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/PerKeyCombineFnRunner.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/PerKeyCombineFnRunner.java
@@ -37,7 +37,7 @@
    *
    * <p>It can be a {@code KeyedCombineFn} or a {@code KeyedCombineFnWithContext}.
    */
-  public PerKeyCombineFn<K, InputT, AccumT, OutputT> fn();
+  PerKeyCombineFn<K, InputT, AccumT, OutputT> fn();
 
   /////////////////////////////////////////////////////////////////////////////
 
@@ -47,7 +47,7 @@
    * <p>It constructs a {@code CombineWithContext.Context} from {@code OldDoFn.ProcessContext}
    * if it is required.
    */
-  public AccumT createAccumulator(K key, OldDoFn<?, ?>.ProcessContext c);
+  AccumT createAccumulator(K key, OldDoFn<?, ?>.ProcessContext c);
 
   /**
    * Forwards the call to a {@link PerKeyCombineFn} to add the input in a {@link OldDoFn}.
@@ -55,7 +55,7 @@
    * <p>It constructs a {@code CombineWithContext.Context} from {@code OldDoFn.ProcessContext}
    * if it is required.
    */
-  public AccumT addInput(K key, AccumT accumulator, InputT input, OldDoFn<?, ?>.ProcessContext c);
+  AccumT addInput(K key, AccumT accumulator, InputT input, OldDoFn<?, ?>.ProcessContext c);
 
   /**
    * Forwards the call to a {@link PerKeyCombineFn} to merge accumulators in a {@link OldDoFn}.
@@ -63,7 +63,7 @@
    * <p>It constructs a {@code CombineWithContext.Context} from {@code OldDoFn.ProcessContext}
    * if it is required.
    */
-  public AccumT mergeAccumulators(
+  AccumT mergeAccumulators(
       K key, Iterable<AccumT> accumulators, OldDoFn<?, ?>.ProcessContext c);
 
   /**
@@ -72,7 +72,7 @@
    * <p>It constructs a {@code CombineWithContext.Context} from {@code OldDoFn.ProcessContext}
    * if it is required.
    */
-  public OutputT extractOutput(K key, AccumT accumulator, OldDoFn<?, ?>.ProcessContext c);
+  OutputT extractOutput(K key, AccumT accumulator, OldDoFn<?, ?>.ProcessContext c);
 
   /**
    * Forwards the call to a {@link PerKeyCombineFn} to compact the accumulator in a {@link OldDoFn}.
@@ -80,7 +80,7 @@
    * <p>It constructs a {@code CombineWithContext.Context} from {@code OldDoFn.ProcessContext}
    * if it is required.
    */
-  public AccumT compact(K key, AccumT accumulator, OldDoFn<?, ?>.ProcessContext c);
+  AccumT compact(K key, AccumT accumulator, OldDoFn<?, ?>.ProcessContext c);
 
   /**
    * Forwards the call to a {@link PerKeyCombineFn} to combine the inputs and extract output
@@ -89,7 +89,7 @@
    * <p>It constructs a {@code CombineWithContext.Context} from {@code OldDoFn.ProcessContext}
    * if it is required.
    */
-  public OutputT apply(K key, Iterable<? extends InputT> inputs, OldDoFn<?, ?>.ProcessContext c);
+  OutputT apply(K key, Iterable<? extends InputT> inputs, OldDoFn<?, ?>.ProcessContext c);
 
   /**
    * Forwards the call to a {@link PerKeyCombineFn} to add all inputs in a {@link OldDoFn}.
@@ -97,7 +97,7 @@
    * <p>It constructs a {@code CombineWithContext.Context} from {@code OldDoFn.ProcessContext}
    * if it is required.
    */
-  public AccumT addInputs(K key, Iterable<InputT> inputs, OldDoFn<?, ?>.ProcessContext c);
+  AccumT addInputs(K key, Iterable<InputT> inputs, OldDoFn<?, ?>.ProcessContext c);
 
   /////////////////////////////////////////////////////////////////////////////
 
@@ -107,7 +107,7 @@
    * <p>It constructs a {@code CombineWithContext.Context} from
    * {@link PipelineOptions} and {@link SideInputReader} if it is required.
    */
-  public AccumT createAccumulator(K key, PipelineOptions options,
+  AccumT createAccumulator(K key, PipelineOptions options,
       SideInputReader sideInputReader, Collection<? extends BoundedWindow> windows);
 
   /**
@@ -116,7 +116,7 @@
    * <p>It constructs a {@code CombineWithContext.Context} from
    * {@link PipelineOptions} and {@link SideInputReader} if it is required.
    */
-  public AccumT addInput(K key, AccumT accumulator, InputT value, PipelineOptions options,
+  AccumT addInput(K key, AccumT accumulator, InputT value, PipelineOptions options,
       SideInputReader sideInputReader, Collection<? extends BoundedWindow> windows);
 
   /**
@@ -125,7 +125,7 @@
    * <p>It constructs a {@code CombineWithContext.Context} from
    * {@link PipelineOptions} and {@link SideInputReader} if it is required.
    */
-  public AccumT mergeAccumulators(K key, Iterable<AccumT> accumulators, PipelineOptions options,
+  AccumT mergeAccumulators(K key, Iterable<AccumT> accumulators, PipelineOptions options,
       SideInputReader sideInputReader, Collection<? extends BoundedWindow> windows);
 
   /**
@@ -134,7 +134,7 @@
    * <p>It constructs a {@code CombineWithContext.Context} from
    * {@link PipelineOptions} and {@link SideInputReader} if it is required.
    */
-  public OutputT extractOutput(K key, AccumT accumulator, PipelineOptions options,
+  OutputT extractOutput(K key, AccumT accumulator, PipelineOptions options,
       SideInputReader sideInputReader, Collection<? extends BoundedWindow> windows);
 
   /**
@@ -143,6 +143,6 @@
    * <p>It constructs a {@code CombineWithContext.Context} from
    * {@link PipelineOptions} and {@link SideInputReader} if it is required.
    */
-  public AccumT compact(K key, AccumT accumulator, PipelineOptions options,
+  AccumT compact(K key, AccumT accumulator, PipelineOptions options,
       SideInputReader sideInputReader, Collection<? extends BoundedWindow> windows);
 }
