diff --git a/drools-core/src/main/java/org/drools/util/BinaryHeapQueue.java b/drools-core/src/main/java/org/drools/util/BinaryHeapQueue.java
index 47e24d5..cab57df 100644
--- a/drools-core/src/main/java/org/drools/util/BinaryHeapQueue.java
+++ b/drools-core/src/main/java/org/drools/util/BinaryHeapQueue.java
@@ -129,7 +129,7 @@
      *
      * @param element the Queueable to be inserted
      */
-    public void enqueue(final Queueable element) {
+    public synchronized void enqueue(final Queueable element) {
         if ( isFull() ) {
             grow();
         }
@@ -143,7 +143,7 @@
      * @return the Queueable at top of heap
      * @throws NoSuchElementException if <code>isEmpty() == true</code>
      */
-    public Queueable dequeue() throws NoSuchElementException {
+    public synchronized Queueable dequeue() throws NoSuchElementException {
         if ( isEmpty() ) {
             return null;
         }
@@ -168,7 +168,7 @@
      *
      * @param index
      */
-    public Queueable dequeue(final int index) {
+    public synchronized Queueable dequeue(final int index) {
         if ( index < 1 || index > this.size ) {
             //throw new NoSuchElementException();
             return null;
