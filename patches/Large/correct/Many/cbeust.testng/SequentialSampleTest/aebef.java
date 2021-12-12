diff --git a/test-14/src/test/thread/SequentialSampleTest.java b/test-14/src/test/thread/SequentialSampleTest.java
index 59a3a3a..00cb47d 100644
--- a/test-14/src/test/thread/SequentialSampleTest.java
+++ b/test-14/src/test/thread/SequentialSampleTest.java
@@ -25,7 +25,7 @@
    * @testng.test
    */
   public void f1() {
-    Long id = new Long(Thread.currentThread().getId());
+    Long id = new Long(Thread.currentThread().hashCode());
     ppp("ID:" + id);
     m_threads.put(id, id);
   }
@@ -34,7 +34,7 @@
    * @testng.test
    */
   public void f2() {
-    Long id = new Long(Thread.currentThread().getId());
+    Long id = new Long(Thread.currentThread().hashCode());
     ppp("ID:" + id);
     m_threads.put(id, id);
   }
@@ -43,7 +43,7 @@
    * @testng.test
    */
   public void f3() {
-    Long id = new Long(Thread.currentThread().getId());
+    Long id = new Long(Thread.currentThread().hashCode());
     ppp("ID:" + id);
     m_threads.put(id, id);
   }
