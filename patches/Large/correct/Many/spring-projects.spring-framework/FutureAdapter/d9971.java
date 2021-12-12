diff --git a/spring-core/src/main/java/org/springframework/util/concurrent/FutureAdapter.java b/spring-core/src/main/java/org/springframework/util/concurrent/FutureAdapter.java
index ad04695..37aac93 100644
--- a/spring-core/src/main/java/org/springframework/util/concurrent/FutureAdapter.java
+++ b/spring-core/src/main/java/org/springframework/util/concurrent/FutureAdapter.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2014 the original author or authors.
+ * Copyright 2002-2015 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -59,27 +59,27 @@
 	 * Returns the adaptee.
 	 */
 	protected Future<S> getAdaptee() {
-		return adaptee;
+		return this.adaptee;
 	}
 
 	@Override
 	public boolean cancel(boolean mayInterruptIfRunning) {
-		return adaptee.cancel(mayInterruptIfRunning);
+		return this.adaptee.cancel(mayInterruptIfRunning);
 	}
 
 	@Override
 	public boolean isCancelled() {
-		return adaptee.isCancelled();
+		return this.adaptee.isCancelled();
 	}
 
 	@Override
 	public boolean isDone() {
-		return adaptee.isDone();
+		return this.adaptee.isDone();
 	}
 
 	@Override
 	public T get() throws InterruptedException, ExecutionException {
-		return adaptInternal(adaptee.get());
+		return adaptInternal(this.adaptee.get());
 	}
 
 	@Override
@@ -107,7 +107,7 @@
 						this.state = State.FAILURE;
 						throw ex;
 					}
-					catch (RuntimeException ex) {
+					catch (Throwable ex) {
 						ExecutionException execEx = new ExecutionException(ex);
 						this.result = execEx;
 						this.state = State.FAILURE;
