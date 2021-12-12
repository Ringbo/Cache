diff --git a/src/com/fsck/k9/mail/store/WebDavStore.java b/src/com/fsck/k9/mail/store/WebDavStore.java
index 4f2e87e..e0f4c21 100644
--- a/src/com/fsck/k9/mail/store/WebDavStore.java
+++ b/src/com/fsck/k9/mail/store/WebDavStore.java
@@ -1942,7 +1942,7 @@
      */
     public class WebDavHandler extends DefaultHandler {
         private DataSet mDataSet = new DataSet();
-        private final Deque<String> mOpenTags = new ArrayDeque<String>();
+        private final LinkedList<String> mOpenTags = new LinkedList<String>();
 
         public DataSet getDataSet() {
             return this.mDataSet;
@@ -1977,7 +1977,7 @@
         @Override
         public void characters(char ch[], int start, int length) {
             String value = new String(ch, start, length);
-            mDataSet.addValue(value, mOpenTags.peekFirst());
+            mDataSet.addValue(value, mOpenTags.peek());
         }
     }
 
