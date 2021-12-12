diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/support/builder/CompositeItemWriterBuilder.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/support/builder/CompositeItemWriterBuilder.java
index d37d0fb..bd13f7c 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/support/builder/CompositeItemWriterBuilder.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/support/builder/CompositeItemWriterBuilder.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2017-2018 the original author or authors.
+ * Copyright 2017-2019 the original author or authors.
  *
  *  Licensed under the Apache License, Version 2.0 (the "License");
  *  you may not use this file except in compliance with the License.
@@ -28,6 +28,7 @@
  *
  * @author Glenn Renfro
  * @author Drummond Dawson
+ * @author Mahmoud Ben Hassine
  * @since 4.0
  */
 public class CompositeItemWriterBuilder<T> {
@@ -72,13 +73,14 @@
 	 * The item writers to use as delegates. Items are written to each of the
 	 * delegates.
 	 *
-	 * @param delegates the delegates to use. The delegates list must not be null
-	 * nor be empty.
+	 * @param delegates the delegates to use.
 	 * @return this instance for method chaining.
 	 *
 	 * @see CompositeItemWriter#setDelegates(List)
 	 */
-	public CompositeItemWriterBuilder<T> delegates(ItemWriter<? super T>... delegates) {
+	@SafeVarargs
+	@SuppressWarnings("varargs")
+	public final CompositeItemWriterBuilder<T> delegates(ItemWriter<? super T>... delegates) {
 		return delegates(Arrays.asList(delegates));
 	}
 
