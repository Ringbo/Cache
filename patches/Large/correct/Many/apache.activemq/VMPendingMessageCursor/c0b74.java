diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/VMPendingMessageCursor.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/VMPendingMessageCursor.java
index d89d69d..958ce88 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/VMPendingMessageCursor.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/VMPendingMessageCursor.java
@@ -35,7 +35,7 @@
     /**
      * @return true if there are no pending messages
      */
-    public boolean isEmpty() {
+    public synchronized boolean isEmpty() {
         if (list.isEmpty()) {
             return true;
         } else {
@@ -57,7 +57,7 @@
     /**
      * reset the cursor
      */
-    public void reset() {
+    public synchronized void reset() {
         iter = list.listIterator();
         last = null;
     }
@@ -67,7 +67,7 @@
      * 
      * @param node
      */
-    public void addMessageLast(MessageReference node) {
+    public synchronized void addMessageLast(MessageReference node) {
         node.incrementReferenceCount();
         list.addLast(node);
     }
@@ -78,7 +78,7 @@
      * @param position
      * @param node
      */
-    public void addMessageFirst(MessageReference node) {
+    public synchronized void addMessageFirst(MessageReference node) {
         node.incrementReferenceCount();
         list.addFirst(node);
     }
@@ -86,14 +86,14 @@
     /**
      * @return true if there pending messages to dispatch
      */
-    public boolean hasNext() {
+    public synchronized boolean hasNext() {
         return iter.hasNext();
     }
 
     /**
      * @return the next pending message
      */
-    public MessageReference next() {
+    public synchronized MessageReference next() {
         last = (MessageReference)iter.next();
         return last;
     }
@@ -101,7 +101,7 @@
     /**
      * remove the message at the cursor position
      */
-    public void remove() {
+    public synchronized void remove() {
         if (last != null) {
             last.decrementReferenceCount();
         }
@@ -111,18 +111,18 @@
     /**
      * @return the number of pending messages
      */
-    public int size() {
+    public synchronized int size() {
         return list.size();
     }
 
     /**
      * clear all pending messages
      */
-    public void clear() {
+    public synchronized void clear() {
         list.clear();
     }
 
-    public void remove(MessageReference node) {
+    public synchronized void remove(MessageReference node) {
         for (Iterator<MessageReference> i = list.iterator(); i.hasNext();) {
             MessageReference ref = i.next();
             if (node.getMessageId().equals(ref.getMessageId())) {
