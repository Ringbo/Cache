diff --git a/common/src/main/java/io/netty/util/internal/MpscLinkedQueue.java b/common/src/main/java/io/netty/util/internal/MpscLinkedQueue.java
index c1b931a..a1a8c2c 100644
--- a/common/src/main/java/io/netty/util/internal/MpscLinkedQueue.java
+++ b/common/src/main/java/io/netty/util/internal/MpscLinkedQueue.java
@@ -32,22 +32,19 @@
  * A lock-free concurrent single-consumer multi-producer {@link Queue}.
  * It allows multiple producer threads to perform the following operations simultaneously:
  * <ul>
- * <li>{@link #offer(Object)}, {@link #add(Object)}, and {@link #addAll(Collection)}</li>
- * <li>All other read-only operations:
- *     <ul>
- *     <li>{@link #contains(Object)} and {@link #containsAll(Collection)}</li>
- *     <li>{@link #element()}, {@link #peek()}</li>
- *     <li>{@link #size()} and {@link #isEmpty()}</li>
- *     <li>{@link #iterator()} (except {@link Iterator#remove()}</li>
- *     <li>{@link #toArray()} and {@link #toArray(Object[])}</li>
- *     </ul>
- * </li>
+ *     <li>{@link #offer(Object)}, {@link #add(Object)}, {@link #addAll(Collection)}</li>
+ *     <li>{@link #isEmpty()}</li>
  * </ul>
  * .. while only one consumer thread is allowed to perform the following operations exclusively:
  * <ul>
  * <li>{@link #poll()} and {@link #remove()}</li>
+ *     <li>{@link #element()}, {@link #peek()}</li>
  * <li>{@link #remove(Object)}, {@link #removeAll(Collection)}, and {@link #retainAll(Collection)}</li>
  * <li>{@link #clear()}</li> {@link #}
+ *     <li>{@link #iterator()}</li>
+ *     <li>{@link #toArray()} and {@link #toArray(Object[])}</li>
+ *     <li>{@link #contains(Object)} and {@link #containsAll(Collection)}</li>
+ *     <li>{@link #size()}</li>
  * </ul>
  *
  * <strong>The behavior of this implementation is undefined if you perform the operations for a consumer thread only
@@ -184,7 +181,7 @@
 
     @Override
     public boolean isEmpty() {
-        return peekNode() == null;
+        return headRef() == tailRef();
     }
 
     @Override
